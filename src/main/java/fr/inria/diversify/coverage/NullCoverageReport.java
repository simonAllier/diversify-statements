package fr.inria.diversify.coverage;

import fr.inria.diversify.codeFragment.CodeFragment;
import javassist.CtMethod;

import java.io.IOException;

/**
 * User: Simon
 * Date: 6/7/13
 * Time: 10:13 AM
 */
public class NullCoverageReport implements ICoverageReport {
    @Override
    public void create() throws IOException {}

    @Override
    public double codeFragmentCoverage(CodeFragment stmt) {
        return 1;
    }

    @Override
    public int opCodeCoverage(CtMethod method, int indexOpcode) {
        return 1;
    }
}
