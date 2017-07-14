package com.camunda.consulting.connectors.pipedrive.pojo;

public class Organisation {
	private String name;
	private int people_count;
	private int owner_id;
	private String address;
	private String cc_email;
	private int value;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPeople_count() {
		return people_count;
	}
	public void setPeople_count(int people_count) {
		this.people_count = people_count;
	}
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCc_email() {
		return cc_email;
	}
	public void setCc_email(String cc_email) {
		this.cc_email = cc_email;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
