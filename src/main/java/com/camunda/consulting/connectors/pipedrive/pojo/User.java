package com.camunda.consulting.connectors.pipedrive.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
	private Integer id;
	private String name;
	private String email;

	private List<Phone> phone = new ArrayList<Phone>();
	private Boolean has_pic;
	private String pic_hash;
	private Boolean active_flag;
	private Integer value;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Boolean getHas_pic() {
		return has_pic;
	}
	public void setHas_pic(Boolean has_pic) {
		this.has_pic = has_pic;
	}
	public String getPic_hash() {
		return pic_hash;
	}
	public void setPic_hash(String pic_hash) {
		this.pic_hash = pic_hash;
	}
	public Boolean getActive_flag() {
		return active_flag;
	}
	public void setActive_flag(Boolean active_flag) {
		this.active_flag = active_flag;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
	public List<Phone> getPhone() {
		return phone;
	}
	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
