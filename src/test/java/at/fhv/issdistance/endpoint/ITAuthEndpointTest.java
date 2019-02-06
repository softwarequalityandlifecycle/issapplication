package at.fhv.issdistance.endpoint;

import at.fhv.issdistance.endpoints.AuthEndpoint;
import org.junit.Assert;
import org.junit.Test;

public class ITAuthEndpointTest {

    @Test
    public void testLogin() throws Exception {
        AuthEndpoint endpoint = new AuthEndpoint();
        String token = endpoint.login("username1");
        Assert.assertNotNull(token);
        Assert.assertNotEquals("", token);
    }
}
