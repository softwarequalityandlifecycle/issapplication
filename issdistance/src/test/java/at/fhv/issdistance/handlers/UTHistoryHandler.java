package at.fhv.issdistance.handlers;

import org.junit.Test;

public class UTHistoryHandler {

    @Test(expected = Exception.class)
    public void testAnalyseTokenIsNull() throws Exception {
        HistoryHandler historyHandler = HistoryHandler.getInstance();
        historyHandler.getHistory(null);
    }

    @Test(expected = Exception.class)
    public void testAnalyseTokenIsEmpty() throws Exception {
        HistoryHandler historyHandler = HistoryHandler.getInstance();
        historyHandler.getHistory("");
    }

}
