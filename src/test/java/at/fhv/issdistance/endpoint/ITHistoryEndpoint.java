package at.fhv.issdistance.endpoint;

import at.fhv.issdistance.endpoints.AnalysisEndpoint;
import at.fhv.issdistance.endpoints.AuthEndpoint;
import at.fhv.issdistance.handlers.HistoryHandler;
import at.fhv.issdistance.models.DistanceHistory;
import org.junit.Assert;
import org.junit.Test;

public class ITHistoryEndpoint {

    @Test
    public void testHistory() throws Exception {
        AuthEndpoint authEndpoint = new AuthEndpoint();
        AnalysisEndpoint analysisEndpoint = new AnalysisEndpoint();
        String token = authEndpoint.login("username1");
        analysisEndpoint.analyze(token);
        HistoryHandler historyHandler = HistoryHandler.getInstance();
        DistanceHistory distanceHistory = historyHandler.getHistory(token);
        Assert.assertNotNull(distanceHistory);
    }

}
