package com.camunda.consulting.connectors.pipedrive.pojo;

public class Value {
	private String label;
	private String value;
	private boolean primary;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean isPrimary() {
		return primary;
	}
	public void setPrimary(boolean primary) {
		this.primary = primary;
	}
}
