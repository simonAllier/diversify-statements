package fr.inria.diversify.diversification;

import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.ast.AbstractTransformationQuery;
import fr.inria.diversify.transformation.query.bytecode.ByteCodeTransformationQuery;
import fr.inria.diversify.util.Log;
import org.codehaus.plexus.util.FileUtils;

import java.util.ArrayList;

import java.util.Set;

/**
 * User: Simon
 * Date: 5/2/13
 * Time: 5:39 PM
 */
public class Diversify extends AbstractDiversify {
    protected int compileError = 0;
    protected int sosie = 0;
    protected int trial = 0;

    public Diversify(AbstractTransformationQuery transQuery, String projectDir) {
        this.transQuery = transQuery;
        this.projectDir = projectDir;
        transformations = new ArrayList<Transformation>();
    }

    public Diversify(String projectDir, String workingDir) {
        this.sourceDir = workingDir;
        this.projectDir = projectDir;


        transformations = new ArrayList<Transformation>();
    }

    @Override
    public void run(int n) throws Exception {
        // todo bidon
        Log.info("number of diversification: " + n);
        for (int i = 0; i < n; i++) {
            Log.info("diversification: " + i);
            run(transQuery.getTransformation(), tmpDir);
        }
        FileUtils.cleanDirectory(tmpDir);
        FileUtils.forceDelete(tmpDir);

        Log.debug("{} setCompile error on {} compilation", compileError, n);
        Log.debug("{} sosie on {} trial", sosie, trial);
    }

    @Override
    public void run(Set<Transformation> trans) throws Exception {
        Log.info("number of diversification: " + trans.size());
        int i = 0;
        for (Transformation tran : trans) {
            Log.info("diversification: " + i);
            run(tran, tmpDir);
            i++;
        }
        FileUtils.cleanDirectory(tmpDir);
        FileUtils.forceDelete(tmpDir);
        Log.debug("{} setCompile error on {} compilation", compileError, trans.size());
        Log.debug("{} sosie on {} trial", sosie, trial);
    }

    protected void run(Transformation trans, String tmpDir) throws Exception {
        Log.debug("output dir: " + tmpDir + "/" + sourceDir);
        try {
            trans.apply(tmpDir + "/" + sourceDir);
            transformations.add(trans);
            int failures = runTest(tmpDir);
            if(failures == 0)
                sosie++;
            trial++;
            trans.setCompile(true);
            trans.setJUnitResult(failures);
            transformations.add(trans);

        } catch (Exception e) {
            compileError++;
            trans.setCompile(false);
            Log.warn("setCompile error during diversification", e);
        }
        trans.restore(tmpDir + "/" + sourceDir);
        Log.debug("run after restore: " + tmpDir + "/" + sourceDir);
    }

    protected String[] getMavenPhase() {
        if(transQuery != null && transQuery instanceof ByteCodeTransformationQuery)
            return new String[]{"test"};
        else
            return new String[]{"clean", "test"};
    }
}
