package com.sola.instagram.io;
import org.apache.http.client.methods.HttpGet;
import java.io.InputStream;


import org.apache.http.impl.client.DefaultHttpClient;

import org.apache.http.HttpResponse;

public class GetMethod extends APIMethod {
	
	
	public GetMethod() {
		super();
		this.type = "GET";
	}
	
	@Override
	protected InputStream performRequest() {
		System.out.println(this.methodUri);
		HttpResponse response;
		InputStream stream = null;
		HttpGet post = new HttpGet(this.methodUri);
		try {
			response = client.execute(post);
			stream = response.getEntity().getContent();
		} catch (Exception e) {
			e.printStackTrace();
		}  
		return stream;
	}
}
