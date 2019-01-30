package at.fhv.issdistance.endpoints;

// Start of user code (user defined imports)
import at.fhv.issdistance.handlers.AnalysisHandler;

// End of user code

@org.springframework.web.bind.annotation.RestController
public class AnalysisEndpoint {
	// Start of user code (user defined attributes)
	
	// End of user code
	
	
	@org.springframework.web.bind.annotation.PostMapping("/analyze")
	public at.fhv.issdistance.models.DiscoveredResult analyze(@org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code analyze
		return AnalysisHandler.getInstance().analyze(token);
		// End of user code
	}
	
	// Start of user code (user defined operations)

	// End of user code
}
