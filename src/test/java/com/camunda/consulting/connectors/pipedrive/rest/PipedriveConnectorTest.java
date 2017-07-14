package com.camunda.consulting.connectors.pipedrive.rest;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.camunda.consulting.connectors.pipedrive.exceptions.UnexpectedResponseException;
import com.camunda.consulting.connectors.pipedrive.pojo.GenericDeal;

public class PipedriveConnectorTest {

	@Test
	public void testRequestResponse() throws UnexpectedResponseException {
		
		GetDealsRequest getDealsRequest = new GetDealsRequest();
		getDealsRequest.setApiToken("");
		getDealsRequest.setStageId(14);
		
		GetDealsResponse response = getDealsRequest.submit();
		List<GenericDeal> deals = response.getDeals(GenericDeal.class);
		
		Assert.assertNotNull("response must not be null", response);
		Assert.assertNotNull("deals must not be null", deals);
		Assert.assertFalse("deals must not be empty", deals.isEmpty());
		Assert.assertTrue("deals must have size 10", deals.size() == 10);
	}
}
