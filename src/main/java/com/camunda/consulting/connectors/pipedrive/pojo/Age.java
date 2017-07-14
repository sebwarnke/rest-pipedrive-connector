package com.camunda.consulting.connectors.pipedrive.pojo;
import java.util.HashMap;
import java.util.Map;
public class Age {
	private Integer y;
	private Integer m;
	private Integer d;
	private Integer h;
	private Integer i;
	private Integer s;
	private Integer total_seconds;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	public Integer getM() {
		return m;
	}
	public void setM(Integer m) {
		this.m = m;
	}
	public Integer getD() {
		return d;
	}
	public void setD(Integer d) {
		this.d = d;
	}
	public Integer getH() {
		return h;
	}
	public void setH(Integer h) {
		this.h = h;
	}
	public Integer getI() {
		return i;
	}
	public void setI(Integer i) {
		this.i = i;
	}
	public Integer getS() {
		return s;
	}
	public void setS(Integer s) {
		this.s = s;
	}
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
	public Integer getTotal_seconds() {
		return total_seconds;
	}
	public void setTotal_seconds(Integer total_seconds) {
		this.total_seconds = total_seconds;
	}

}
