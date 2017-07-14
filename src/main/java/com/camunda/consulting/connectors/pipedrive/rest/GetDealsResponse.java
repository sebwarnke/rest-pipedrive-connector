package com.camunda.consulting.connectors.pipedrive.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.camunda.consulting.connectors.pipedrive.exceptions.UnexpectedResponseException;
import com.camunda.consulting.connectors.pipedrive.pojo.GenericDeal;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;

public class GetDealsResponse {

	private static final Logger log = LoggerFactory.getLogger(GetDealsResponse.class);
	
	private final ObjectMapper objectMapper = new ObjectMapper();
	
	private final boolean isSuccessful;
	private final JSONArray data;
//	private final JSONArray additionalData;
	
	public GetDealsResponse(HttpResponse<JsonNode> httpResponse) {
		
		JsonNode bodyJsonNode = httpResponse.getBody();
		JSONObject bodyJsonObject = bodyJsonNode.getObject();
		
		isSuccessful = bodyJsonObject.getBoolean("success");
		data = bodyJsonObject.getJSONArray("data");
//		additionalData = bodyJsonObject.getJSONArray("additional_data");
	}
	
	public <T extends GenericDeal> List<T> getDeals(Class<T> clazz) throws UnexpectedResponseException {
		
		ArrayList<T> result = new ArrayList<T>();
		
		for (int i = 0; i < data.length(); i++) {
			
			JSONObject dealJsonObject = data.getJSONObject(i);
			String dealJsonString = dealJsonObject.toString();
			
			try {
				T dealObject = objectMapper.readValue(dealJsonString, clazz);
				result.add(dealObject);
			} catch (IOException e) {
				log.error("an unexpected error happened when deserializing pipedrive deal", e);
				throw new UnexpectedResponseException(e);
			}
		}
		
		log.info("GetDealsResponse contains {} deals", result.size());
		
		return result;
		
	}

	public boolean isSuccessful() {
		return isSuccessful;
	}
	
	
}
