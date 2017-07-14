package com.camunda.consulting.connectors.pipedrive.pojo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenericDeal {
	private Integer id;
	private User creator_user_id;
	private User user_id;
	private Person person_id;
	private Organisation org_id;
	private Integer stage_id;
	private String title;
	private Integer value;
	private String currency;
	private String add_time;
	private String update_time;
	private String stage_change_time;
	private Boolean active;
	private Boolean deleted;
	private String status;
	private Object next_activity_date;
	private Object next_activity_time;
	private Object next_activity_id;
	private Object last_activity_id;
	private Object last_activity_date;
	private Object lost_reason;
	private String visible_to;
	private Object close_time;
	private Integer pipeline_id;
	private Object won_time;
	private Object first_won_time;
	private Object lost_time;
	private Integer products_count;
	private Integer files_count;
	private Integer notes_count;
	private Integer followers_count;
	private Integer email_messages_count;
	private Integer activities_count;
	private Integer done_activities_count;
	private Integer undone_activities_count;
	private Integer reference_activities_count;
	private Integer participants_count;
	private Object expected_close_date;
	
	private Object last_incoming_mail_time;
	private Object last_outgoing_mail_time;
	private Integer stage_order_nr;
	private String person_name;
	private String org_name;
	private Object next_activity_subject;
	private Object next_activity_type;
	private Object next_activity_duration;
	private Object next_activity_note;
	private String formatted_value;
	private String rotten_time;
	private Integer weighted_value;
	private String formatted_weighted_value;
	private String owner_name;
	private String cc_email;
	private Boolean org_hidden;
	private Boolean person_hidden;
	//private Average_time_to_won average_time_to_won;
	private Integer average_stage_progress;
	private Age age;
	//private Stay_in_pipeline_stages stay_in_pipeline_stages;
	private Object last_activity;
	private Object next_activity;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getCreator_user_id() {
		return creator_user_id;
	}
	public void setCreator_user_id(User creator_user_id) {
		this.creator_user_id = creator_user_id;
	}
	public User getUser_id() {
		return user_id;
	}
	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}
	public Person getPerson_id() {
		return person_id;
	}
	public void setPerson_id(Person person_id) {
		this.person_id = person_id;
	}
	public Integer getStage_id() {
		return stage_id;
	}
	public void setStage_id(Integer stage_id) {
		this.stage_id = stage_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAdd_time() {
		return add_time;
	}
	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	public String getStage_change_time() {
		return stage_change_time;
	}
	public void setStage_change_time(String stage_change_time) {
		this.stage_change_time = stage_change_time;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getNext_activity_date() {
		return next_activity_date;
	}
	public void setNext_activity_date(Object next_activity_date) {
		this.next_activity_date = next_activity_date;
	}
	public Object getNext_activity_time() {
		return next_activity_time;
	}
	public void setNext_activity_time(Object next_activity_time) {
		this.next_activity_time = next_activity_time;
	}
	public Object getNext_activity_id() {
		return next_activity_id;
	}
	public void setNext_activity_id(Object next_activity_id) {
		this.next_activity_id = next_activity_id;
	}
	public Object getLast_activity_id() {
		return last_activity_id;
	}
	public void setLast_activity_id(Object last_activity_id) {
		this.last_activity_id = last_activity_id;
	}
	public Object getLast_activity_date() {
		return last_activity_date;
	}
	public void setLast_activity_date(Object last_activity_date) {
		this.last_activity_date = last_activity_date;
	}
	public Object getLost_reason() {
		return lost_reason;
	}
	public void setLost_reason(Object lost_reason) {
		this.lost_reason = lost_reason;
	}
	public String getVisible_to() {
		return visible_to;
	}
	public void setVisible_to(String visible_to) {
		this.visible_to = visible_to;
	}
	public Object getClose_time() {
		return close_time;
	}
	public void setClose_time(Object close_time) {
		this.close_time = close_time;
	}
	public Integer getPipeline_id() {
		return pipeline_id;
	}
	public void setPipeline_id(Integer pipeline_id) {
		this.pipeline_id = pipeline_id;
	}
	public Object getWon_time() {
		return won_time;
	}
	public void setWon_time(Object won_time) {
		this.won_time = won_time;
	}
	public Object getFirst_won_time() {
		return first_won_time;
	}
	public void setFirst_won_time(Object first_won_time) {
		this.first_won_time = first_won_time;
	}
	public Object getLost_time() {
		return lost_time;
	}
	public void setLost_time(Object lost_time) {
		this.lost_time = lost_time;
	}
	public Integer getProducts_count() {
		return products_count;
	}
	public void setProducts_count(Integer products_count) {
		this.products_count = products_count;
	}
	public Integer getFiles_count() {
		return files_count;
	}
	public void setFiles_count(Integer files_count) {
		this.files_count = files_count;
	}
	public Integer getNotes_count() {
		return notes_count;
	}
	public void setNotes_count(Integer notes_count) {
		this.notes_count = notes_count;
	}
	public Integer getFollowers_count() {
		return followers_count;
	}
	public void setFollowers_count(Integer followers_count) {
		this.followers_count = followers_count;
	}
	public Integer getEmail_messages_count() {
		return email_messages_count;
	}
	public void setEmail_messages_count(Integer email_messages_count) {
		this.email_messages_count = email_messages_count;
	}
	public Integer getActivities_count() {
		return activities_count;
	}
	public void setActivities_count(Integer activities_count) {
		this.activities_count = activities_count;
	}
	public Integer getDone_activities_count() {
		return done_activities_count;
	}
	public void setDone_activities_count(Integer done_activities_count) {
		this.done_activities_count = done_activities_count;
	}
	public Integer getUndone_activities_count() {
		return undone_activities_count;
	}
	public void setUndone_activities_count(Integer undone_activities_count) {
		this.undone_activities_count = undone_activities_count;
	}
	public Integer getReference_activities_count() {
		return reference_activities_count;
	}
	public void setReference_activities_count(Integer reference_activities_count) {
		this.reference_activities_count = reference_activities_count;
	}
	public Integer getParticipants_count() {
		return participants_count;
	}
	public void setParticipants_count(Integer participants_count) {
		this.participants_count = participants_count;
	}
	public Object getExpected_close_date() {
		return expected_close_date;
	}
	public void setExpected_close_date(Object expected_close_date) {
		this.expected_close_date = expected_close_date;
	}
	public Object getLast_incoming_mail_time() {
		return last_incoming_mail_time;
	}
	public void setLast_incoming_mail_time(Object last_incoming_mail_time) {
		this.last_incoming_mail_time = last_incoming_mail_time;
	}
	public Object getLast_outgoing_mail_time() {
		return last_outgoing_mail_time;
	}
	public void setLast_outgoing_mail_time(Object last_outgoing_mail_time) {
		this.last_outgoing_mail_time = last_outgoing_mail_time;
	}
	public Integer getStage_order_nr() {
		return stage_order_nr;
	}
	public void setStage_order_nr(Integer stage_order_nr) {
		this.stage_order_nr = stage_order_nr;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getOrg_name() {
		return org_name;
	}
	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}
	public Object getNext_activity_subject() {
		return next_activity_subject;
	}
	public void setNext_activity_subject(Object next_activity_subject) {
		this.next_activity_subject = next_activity_subject;
	}
	public Object getNext_activity_type() {
		return next_activity_type;
	}
	public void setNext_activity_type(Object next_activity_type) {
		this.next_activity_type = next_activity_type;
	}
	public Object getNext_activity_duration() {
		return next_activity_duration;
	}
	public void setNext_activity_duration(Object next_activity_duration) {
		this.next_activity_duration = next_activity_duration;
	}
	public Object getNext_activity_note() {
		return next_activity_note;
	}
	public void setNext_activity_note(Object next_activity_note) {
		this.next_activity_note = next_activity_note;
	}
	public String getFormatted_value() {
		return formatted_value;
	}
	public void setFormatted_value(String formatted_value) {
		this.formatted_value = formatted_value;
	}
	public String getRotten_time() {
		return rotten_time;
	}
	public void setRotten_time(String rotten_time) {
		this.rotten_time = rotten_time;
	}
	public Integer getWeighted_value() {
		return weighted_value;
	}
	public void setWeighted_value(Integer weighted_value) {
		this.weighted_value = weighted_value;
	}
	public String getFormatted_weighted_value() {
		return formatted_weighted_value;
	}
	public void setFormatted_weighted_value(String formatted_weighted_value) {
		this.formatted_weighted_value = formatted_weighted_value;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public String getCc_email() {
		return cc_email;
	}
	public void setCc_email(String cc_email) {
		this.cc_email = cc_email;
	}
	public Boolean getOrg_hidden() {
		return org_hidden;
	}
	public void setOrg_hidden(Boolean org_hidden) {
		this.org_hidden = org_hidden;
	}
	public Boolean getPerson_hidden() {
		return person_hidden;
	}
	public void setPerson_hidden(Boolean person_hidden) {
		this.person_hidden = person_hidden;
	}
	public Integer getAverage_stage_progress() {
		return average_stage_progress;
	}
	public void setAverage_stage_progress(Integer average_stage_progress) {
		this.average_stage_progress = average_stage_progress;
	}
	public Age getAge() {
		return age;
	}
	public void setAge(Age age) {
		this.age = age;
	}
	public Object getLast_activity() {
		return last_activity;
	}
	public void setLast_activity(Object last_activity) {
		this.last_activity = last_activity;
	}
	public Object getNext_activity() {
		return next_activity;
	}
	public void setNext_activity(Object next_activity) {
		this.next_activity = next_activity;
	}
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
	public Organisation getOrg_id() {
		return org_id;
	}
	public void setOrg_id(Organisation org_id) {
		this.org_id = org_id;
	}
}
