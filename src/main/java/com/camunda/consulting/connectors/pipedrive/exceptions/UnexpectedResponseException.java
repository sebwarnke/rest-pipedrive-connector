package com.camunda.consulting.connectors.pipedrive.exceptions;

public class UnexpectedResponseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1724637276911031920L;

	public UnexpectedResponseException() {
		super();
	}
	
	public UnexpectedResponseException(Exception e) {
		super(e);
	}
	
	public UnexpectedResponseException(String message, Exception e) {
		super(message, e);
	}
	
}
