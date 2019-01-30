package at.fhv.issdistance.models;

// Start of user code (user defined imports)

// End of user code

public class DiscoveredResult {
	/**
	 * Description of the property message.
	 */
	public String message = null;
	
	/**
	 * Description of the property timestamp.
	 */
	public int timestamp = 0;
	
	/**
	 * Description of the property longitude.
	 */
	public String longitude = null;
	
	/**
	 * Description of the property latitude.
	 */
	public String latitude = null;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getMessage(){
		   return this.message;
		}
		
		public void setMessage(String message){
		   this.message = message;
		}
		
		public int getTimestamp(){
		   return this.timestamp;
		}
		
		public void setTimestamp(int timestamp){
		   this.timestamp = timestamp;
		}
		
		public String getLongitude(){
		   return this.longitude;
		}
		
		public void setLongitude(String longitude){
		   this.longitude = longitude;
		}
		
		public String getLatitude(){
		   return this.latitude;
		}
		
		public void setLatitude(String latitude){
		   this.latitude = latitude;
		}
		
	
}
