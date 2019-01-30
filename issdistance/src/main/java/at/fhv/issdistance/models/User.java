package at.fhv.issdistance.models;

// Start of user code (user defined imports)

// End of user code

public class User {
	/**
	 * Description of the property username.
	 */
	/*package*/ String username = null;
	
	/**
	 * Description of the property history.
	 */
	public at.fhv.issdistance.models.DistanceHistory history = null;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getUsername(){
		   return this.username;
		}
		
		public void setUsername(String username){
		   this.username = username;
		}
		
		public at.fhv.issdistance.models.DistanceHistory getHistory(){
		   return this.history;
		}
		
		public void setHistory(at.fhv.issdistance.models.DistanceHistory history){
		   this.history = history;
		}
		
	
}
