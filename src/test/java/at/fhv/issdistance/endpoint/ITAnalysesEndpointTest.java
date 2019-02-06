package at.fhv.issdistance.endpoint;

import at.fhv.issdistance.endpoints.AnalysisEndpoint;
import at.fhv.issdistance.endpoints.AuthEndpoint;
import at.fhv.issdistance.models.DiscoveredResult;
import org.junit.Assert;
import org.junit.Test;

public class ITAnalysesEndpointTest {

    @Test
    public void testAnalyze() throws Exception {
        AuthEndpoint authEndpoint = new AuthEndpoint();
        AnalysisEndpoint analysisEndpoint = new AnalysisEndpoint();
        String token = authEndpoint.login("username1");
        DiscoveredResult discoveredResult = analysisEndpoint.analyze(token);
        Assert.assertNotNull(discoveredResult);
    }

}
