package at.fhv.issdistance.models;

// Start of user code (user defined imports)

// End of user code

public class DistanceHistory {
	/**
	 * Description of the property items.
	 */
	public java.util.Set<at.fhv.issdistance.models.DistanceHistoryItem> items = new java.util.LinkedHashSet<at.fhv.issdistance.models.DistanceHistoryItem>();
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public java.util.Set<at.fhv.issdistance.models.DistanceHistoryItem> getItems(){
		   return this.items;
		}
		
		public void setItems(java.util.Set<at.fhv.issdistance.models.DistanceHistoryItem> items){
		   this.items = items;
		}
		
	
}
