package at.fhv.issdistance.models;

// Start of user code (user defined imports)

// End of user code

public class ISS_position {
	/**
	 * Description of the property latitude.
	 */
	public String latitude = null;
	
	/**
	 * Description of the property longitude.
	 */
	public String longitude = null;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getLatitude(){
		   return this.latitude;
		}
		
		public void setLatitude(String latitude){
		   this.latitude = latitude;
		}
		
		public String getLongitude(){
		   return this.longitude;
		}
		
		public void setLongitude(String longitude){
		   this.longitude = longitude;
		}
		
	
}
