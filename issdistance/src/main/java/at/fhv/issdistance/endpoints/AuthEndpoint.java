package at.fhv.issdistance.endpoints;

// Start of user code (user defined imports)

// End of user code

import at.fhv.issdistance.handlers.AuthHandler;

@org.springframework.web.bind.annotation.RestController
public class AuthEndpoint {
	// Start of user code (user defined attributes)
	
	// End of user code
	
	
	@org.springframework.web.bind.annotation.PostMapping("/logout")
	public void logout(@org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code logout
		AuthHandler.getInstance().logout(token);
		// End of user code
	}
	
	@org.springframework.web.bind.annotation.PostMapping("/login")
	public String login(@org.springframework.web.bind.annotation.RequestParam("username") String username) throws Exception {
		// Start of user code login
		return AuthHandler.getInstance().login(username);
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
}
