package at.fhv.issdistance.handlers;

import org.junit.Assert;
import org.junit.Test;

public class UTAnalysisHandlerTest {

    // TEST ANALYSE NULL AND EMPTY TOKEN
    @Test(expected = Exception.class)
    public void testAnalyseTokenIsNull() throws Exception {
        AnalysisHandler analysisHandler = AnalysisHandler.getInstance();
        analysisHandler.analyze(null);
    }

    @Test(expected = Exception.class)
    public void testAnalyseTokenIsEmpty() throws Exception {
        AnalysisHandler analysisHandler = AnalysisHandler.getInstance();
        analysisHandler.analyze("");
    }
}
