package com.sola.instagram.model;

import com.sola.org.json.JSONException;
import com.sola.org.json.JSONObject;

public class ImageMedia extends Media {

	public ImageMedia(JSONObject obj, String accessToken) throws JSONException {
		super(obj, accessToken);
	}

}
