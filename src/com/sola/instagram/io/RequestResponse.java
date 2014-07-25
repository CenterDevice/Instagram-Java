package com.sola.instagram.io;

import com.sola.org.json.JSONException;
import com.sola.org.json.JSONObject;
import com.sola.org.json.JSONTokener;

public class RequestResponse {
	
	String responseString;
	public RequestResponse(String responseAsString) {
		this.responseString = responseAsString;
	}
	
	public JSONObject getJSON() {
		JSONObject res = null;	
		try {
			res = new JSONObject(new JSONTokener(getResponseString()));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return res;
	}

	public String getResponseString() {
		return responseString;
	}

	public void setResponseString(String responseString) {
		this.responseString = responseString;
	}
}
