package at.fhv.issdistance.handlers;

// Start of user code (user defined imports)
import at.fhv.issdistance.models.DiscoveredResult;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
// End of user code

public class AnalysisHandler {
	// Start of user code (user defined attributes)
	
	// End of user code
	

	private static AnalysisHandler INSTANCE;
	
	private AnalysisHandler(){
	    // singleton
	}
	
	public static AnalysisHandler getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new AnalysisHandler();
	    }
	
	    return INSTANCE;
	}
	
	public at.fhv.issdistance.models.DiscoveredResult analyze(String token) throws Exception {
		// Start of user code analyze
		if(token != null && !token.equals("")){
			DiscoveredResult discoveredResult = new DiscoveredResult();
			HttpResponse response = Request.Get("http://api.open-notify.org/iss-now.json").execute().returnResponse();
			String result = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
			Gson gson = new GsonBuilder().create();
			JsonObject jsonObject = gson.fromJson(result, JsonObject.class);
			discoveredResult.setMessage(jsonObject.get("message").toString());
			discoveredResult.setTimestamp(jsonObject.get("timestamp").getAsInt());
			JsonObject pos = jsonObject.getAsJsonObject("iss_position");
			discoveredResult.setLatitude(pos.get("latitude").getAsString());
			discoveredResult.setLongitude(pos.get("longitude").getAsString());
            HistoryHandler.getInstance().addHistory(token, discoveredResult);
			return discoveredResult;
		}
		else {
			throw new Exception("Invalid authentication");
		}
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
