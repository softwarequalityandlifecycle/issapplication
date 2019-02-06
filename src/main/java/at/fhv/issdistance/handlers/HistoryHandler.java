package at.fhv.issdistance.handlers;

// Start of user code (user defined imports)
import at.fhv.issdistance.models.DistanceHistoryItem;
import at.fhv.issdistance.models.User;
// End of user code

public class HistoryHandler {
	// Start of user code (user defined attributes)
	
	// End of user code
	

	private static HistoryHandler INSTANCE;
	
	private HistoryHandler(){
	    // singleton
	}
	
	public static HistoryHandler getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new HistoryHandler();
	    }
	
	    return INSTANCE;
	}
	
	public void addHistory(String token, at.fhv.issdistance.models.DiscoveredResult result) throws Exception {
		// Start of user code addHistory
		User user = AuthHandler.getInstance().getUserByToken(token);
		DistanceHistoryItem item = new DistanceHistoryItem();
		item.setResult(result);
		item.setLatitude(result.getLatitude());
		item.setLongitude(result.getLongitude());
		user.getHistory().getItems().add(item);
		// End of user code
	}
	
	public at.fhv.issdistance.models.DistanceHistory getHistory(String token) throws Exception {
		// Start of user code getHistory
		if (token != null && !token.equals("")) {
			User user = AuthHandler.getInstance().getUserByToken(token);
			return user.getHistory();

		} else {
			throw new Exception("Token is empty");
		}
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
