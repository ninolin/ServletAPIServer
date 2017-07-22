package nino.API.Data;

import org.json.*;

public class Result {
	private String API, MESSAGE;
	private JSONObject ARGS, DATA;
	private int RESULT;
	private long TimeAPICall, TimeAPIReturn;
	private int CostDBLib, CostBELib;
	
	public Result(String myAPI, long timestamp) {
		this.API = myAPI;
		this.RESULT = 0;
		this.TimeAPICall = timestamp;
		this.TimeAPIReturn = 0;
		this.CostDBLib = 0;
		this.CostBELib = 0;
		this.ARGS = new JSONObject();
		this.DATA = new JSONObject();
	}

	public void setARGS(JSONObject data) {
		this.ARGS = data;
	}
	
	public void setMessage(String data) {
		this.MESSAGE = data;
	}
	
	public void setResult(int data) {
		this.RESULT = data;
	}
	public int getResult() {
		return this.RESULT;
	}
	
	public void setDATA(JSONArray data) throws JSONException {
		this.DATA = new JSONObject().put("", data);
	}
	public void setDATA(JSONObject data) {
		this.DATA = data;
	}
	public JSONObject getDATA() {
		return this.DATA;
	}
	
	public void addCostDBLib(int time) {
		this.CostDBLib += time;
	}
	
	public JSONObject toJSONObject() 
			throws JSONException {

		this.TimeAPIReturn = System.currentTimeMillis();
		JSONObject json = new JSONObject();
		
		json.put("API", this.API);
		json.put("ARGS", this.ARGS);
		json.put("RESULT", this.RESULT);
		json.put("MESSAGE", this.MESSAGE);
		json.put("TimeAPICall", this.TimeAPICall);
		json.put("TimeAPIReturn", this.TimeAPIReturn);
		json.put("CostDBLib", this.CostDBLib);
		json.put("CostBELib", this.CostBELib);			
		if( this.DATA.length() == 1 && this.DATA.has("")){
				json.put("DATA", this.DATA.getJSONArray(""));		
		}else if( this.DATA.length() == 2 &&  this.DATA.has("") && this.DATA.has("cost_time")){
			json.put("DATA",  this.DATA.getJSONArray(""));
		}else
			json.put("DATA",  this.DATA);
		
		return json;
	}
	
	public String toString() {
		String rtString = new String();
		
		try {
			JSONObject rtJSON = this.toJSONObject();
			rtString = rtJSON.toString();
		} catch(Exception e) {
			rtString = "{\"API\": \"" + this.API + "\","
					 + " \"RESULT\": \"" + this.RESULT + "\","
					 + " \"MESSAGE\": \"JSON parse error in this API\","
					 + " \"TimeAPICall\": \"" + this.TimeAPICall + "\","
					 + " \"TimeAPIReturn\": \"" + this.TimeAPIReturn + "\","
					 + " \"CostDBLib\": \"" + this.CostDBLib + "\","
					 + " \"CostBELib\": \"" + this.CostBELib + "\","
					 + " \"DATA\": \"" + this.DATA + "\"}";
		}
		
		return rtString;
	}
}