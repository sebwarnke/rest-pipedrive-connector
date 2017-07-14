package com.camunda.consulting.connectors.pipedrive.pojo;

import java.util.HashMap;
import java.util.Map;

public class Phone {
	

		private String label;
		private String value;
		private Boolean primary;
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();
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
		public Boolean getPrimary() {
			return primary;
		}
		public void setPrimary(Boolean primary) {
			this.primary = primary;
		}
		public Map<String, Object> getAdditionalProperties() {
			return additionalProperties;
		}
		public void setAdditionalProperties(Map<String, Object> additionalProperties) {
			this.additionalProperties = additionalProperties;
		}

}
