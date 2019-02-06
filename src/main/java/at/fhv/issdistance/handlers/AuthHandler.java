package at.fhv.issdistance.handlers;

// Start of user code (user defined imports)
import at.fhv.issdistance.models.*;
import org.apache.commons.codec.digest.DigestUtils;
import java.util.HashMap;
import java.util.Map;
// End of user code

public class AuthHandler {
	// Start of user code (user defined attributes)
	protected Map<String, User> users = new HashMap<>();
	// End of user code
	

	private static AuthHandler INSTANCE;
	
	private AuthHandler(){
	    // singleton
	}
	
	public static AuthHandler getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new AuthHandler();
	    }
	
	    return INSTANCE;
	}
	
	public void logout(String token) throws Exception {
		// Start of user code logout
		if(token != null && !token.equals("")) {
			users.remove(token);
		}
		else {
			throw new Exception("token is empty.");
		}
		// End of user code
	}
	
	public String login(String username) throws Exception {
		// Start of user code login
		if (username != null && !username.equals("")) {
			String token = DigestUtils.md2Hex(username);
			if (!users.containsKey(token)) {
				User user = new User();
				user.setUsername(username);
				user.setHistory(new DistanceHistory());
				users.put(token, user);
			}
			return token;
		}
		else {
			throw new Exception("username is empty!");
		}
		// End of user code
	}
	
	public at.fhv.issdistance.models.User getUserByToken(String token) throws Exception {
		// Start of user code getUserByToken

		if(token.equals("") || token == null) {
			throw new Exception();
		}

		return users.get(token);
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
