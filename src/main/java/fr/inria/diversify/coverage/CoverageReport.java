package fr.inria.diversify.coverage;


import fr.inria.diversify.codeFragment.CodeFragment;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.bytecode.MethodInfo;
import org.jacoco.core.analysis.Analyzer;
import org.jacoco.core.analysis.CoverageBuilder;
import org.jacoco.core.analysis.IClassCoverage;
import org.jacoco.core.analysis.ICounter;
import org.jacoco.core.data.ExecutionDataReader;
import org.jacoco.core.data.ExecutionDataStore;
import org.jacoco.core.data.SessionInfoStore;
import spoon.reflect.declaration.CtSimpleType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class CoverageReport implements ICoverageReport {

    CoverageBuilder coverageBuilder;
    private final File executionDataFile;
    private final File classesDirectory;

    private ExecutionDataStore executionDataStore;
    private SessionInfoStore sessionInfoStore;


    public CoverageReport(String classesDir, File jacocoFile) {
        this.executionDataFile = jacocoFile;
        this.classesDirectory = new File(classesDir);
    }


    public void create() throws IOException {
        loadExecutionData();
        coverageBuilder = analyzeStructure();
    }


    private void loadExecutionData() throws IOException {
        final FileInputStream fis = new FileInputStream(executionDataFile);
        final ExecutionDataReader executionDataReader = new ExecutionDataReader(
                fis);
        executionDataStore = new ExecutionDataStore();
        sessionInfoStore = new SessionInfoStore();

        executionDataReader.setExecutionDataVisitor(executionDataStore);
        executionDataReader.setSessionInfoVisitor(sessionInfoStore);

        while (executionDataReader.read()) {}
        fis.close();
    }

    private CoverageBuilder analyzeStructure() throws IOException {
        final CoverageBuilder coverageBuilder = new CoverageBuilder();
        final Analyzer analyzer = new Analyzer(executionDataStore,
                coverageBuilder);

        analyzer.analyzeAll(classesDirectory);

        return coverageBuilder;
    }


    public double codeFragmentCoverage(CodeFragment stmt) {
        IClassCoverage classCoverage = null;
        for (IClassCoverage cc : coverageBuilder.getClasses()) {
            CtSimpleType<?> cl = stmt.getSourceClass();
            if(!(cl == null || cl.getPackage() == null || cl.getPackage().getSignature() == null)) {
                String name =  cl.getPackage().getSignature().replace(".","/")+"/"+cl.getSimpleName();
                if(name.equals(cc.getName())) {
                    classCoverage = cc;
                    break;
                }
            }
        }
        if(classCoverage == null)
            return 0;
        double ret = 0;
        for (int i = stmt.getStartLine(); i <= stmt.getEndLine(); i++)
             if(classCoverage.getLine(i).getStatus() == ICounter.FULLY_COVERED)
                ret++;
        return ret/(double)(stmt.getEndLine()- stmt.getStartLine() + 1);
    }

    @Override
    public int opCodeCoverage(CtMethod method, int indexOpcode) {
        IClassCoverage classCoverage = null;
        for (IClassCoverage cc : coverageBuilder.getClasses()) {
            CtClass cl = method.getDeclaringClass();

            String name =   cl.getName().replace(".","/");
            if(name.equals(cc.getName())) {
                classCoverage = cc;
                break;
            }
        }
        if(classCoverage == null)
            return 0;

        MethodInfo mInfo = method.getMethodInfo();
        int line = mInfo.getLineNumber(indexOpcode);

        return classCoverage.getLine(line).getStatus();
    }

    public String getFileName() {
        return executionDataFile.getName();
    }
}
