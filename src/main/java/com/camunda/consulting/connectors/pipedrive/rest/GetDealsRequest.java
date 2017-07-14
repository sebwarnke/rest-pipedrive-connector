package com.camunda.consulting.connectors.pipedrive.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class GetDealsRequest {

	private static final Logger log = LoggerFactory.getLogger(GetDealsRequest.class);
	
	private static final String REST_URL = "https://api.pipedrive.com/v1";
	private static final String ENDPOINT_DEALS = "/deals";
	
	private int id = Integer.MIN_VALUE;
	private int stageId = Integer.MIN_VALUE;
	
	private String apiToken = "";
	
	public GetDealsRequest() {
		// left blank intentionally
	}
	
	public GetDealsRequest(int id, String apiToken) {
		this.id = id;
		this.apiToken = apiToken;
	}
	
	public String getRequestString() {
		
		String requestString = "";
		
		requestString += REST_URL;
		requestString += ENDPOINT_DEALS;
		requestString += "?api_token=" + apiToken;
		
		if (id == Integer.MIN_VALUE) {
			// ignore id
		} else {
			requestString += "&id=" + id;
		}
		
		if (stageId == Integer.MIN_VALUE) {
			// ignore stage id
		} else {
			requestString += "&stage_id=" + stageId;
		}
		
		log.info("assembled request: '{}'", requestString);
		return requestString;
	}

	public GetDealsResponse submit() {
		
		GetDealsResponse result = null;
		
		HttpResponse<JsonNode> httpResponse = null;
		
		String requestString = getRequestString();
		
		try {
			httpResponse = Unirest.get(requestString).asJson();
			result = new GetDealsResponse(httpResponse);
			
		} catch (UnirestException e) {
			log.error("request failed", e);
		}
		
		return result;
	}
	
	public String getApiToken() {
		return apiToken;
	}

	public void setApiToken(String apiToken) {
		this.apiToken = apiToken;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStageId() {
		return stageId;
	}

	public void setStageId(int stageId) {
		this.stageId = stageId;
	}
	
	
}
