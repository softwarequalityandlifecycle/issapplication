package at.fhv.issdistance.handlers;

import at.fhv.issdistance.models.User;
import org.junit.Assert;
import org.junit.Test;

public class UTAuthHandler {

    // TEST LOGIN

    @Test
    public void testLoginISS() throws Exception {
        AuthHandler authHandler = AuthHandler.getInstance();
        String userToken = authHandler.login("username1");
        //CHECK TOKEN IS NOT NULL OR EMPTY
        Assert.assertNotNull(userToken);
        Assert.assertNotEquals("", userToken);
        User user = authHandler.users.get(userToken);
        Assert.assertEquals("username1", user.getUsername());
        Assert.assertNotNull(user.getHistory());
    }

    @Test(expected = Exception.class)
    public void testLoginUsernameIsEmpty() throws Exception {
        AuthHandler authHandler = AuthHandler.getInstance();
        authHandler.login("");
    }

    @Test(expected = Exception.class)
    public void testLoginUsernameIsNull() throws Exception {
        AuthHandler authHandler = AuthHandler.getInstance();
        authHandler.login(null);
    }

    //TEST LOGOUT

    @Test
    public void testLogoutISS() throws Exception {
        AuthHandler handler = AuthHandler.getInstance();
        handler.users.put("username1", new User());
        handler.logout("username1");
        Assert.assertFalse(handler.users.containsKey("username1"));
    }

    @Test(expected = Exception.class)
    public void testLogoutUsernameIsEmpty() throws Exception {
        AuthHandler handler = AuthHandler.getInstance();
        handler.users.put("username1", new User());
        handler.logout("");
    }

    @Test(expected = Exception.class)
    public void testLogoutUsernameIsNull() throws Exception {
        AuthHandler authHandler = AuthHandler.getInstance();
        authHandler.users.put("username1", new User());
        authHandler.logout(null);
    }

    //TEST GET USER DATA FROM HANDLER

    @Test
    public void testGetUserFromHandler() throws Exception {
        AuthHandler authHandler = AuthHandler.getInstance();
        authHandler.users.put("username1", new User());
        Assert.assertNotNull(authHandler.getUserByToken("username1"));
    }

    @Test(expected = Exception.class)
    public void testGetUserFromHandlerMailIsEmpty() throws Exception {
        AuthHandler authHandler = AuthHandler.getInstance();
        authHandler.users.put("username1", new User());
        authHandler.getUserByToken("");
    }

    @Test(expected = Exception.class)
    public void testGetUserFromHandlerMailIsNULL() throws Exception {
        AuthHandler authHandler = AuthHandler.getInstance();
        authHandler.users.put("username1", new User());
        authHandler.getUserByToken(null);
    }




}
