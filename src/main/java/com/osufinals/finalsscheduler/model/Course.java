package com.osufinals.finalsscheduler.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Courses")
public class Course {
	
	@Id
	private String id;
	private String subjectLong;
	private String subjectShort;
	private String subjectId;
	private String number;
    private String topic;
    private String displayTitle;
    private String title;
    private String titleLong;
    private String description;
    private Boolean hasTopics;
    private String corequisites;
    private String prerequisites;
    private Boolean hasRestrictions;
    
    
    public Course() {
    	
    }
    
    
	public Course(String id, String subjectLong, String subjectShort, String subjectId, String number, String topic,
			String displayTitle, String title, String titleLong, String description, Boolean hasTopics,
			String corequisites, String prerequisites, Boolean hasRestrictions) {
		super();
		this.id = id;
		this.subjectLong = subjectLong;
		this.subjectShort = subjectShort;
		this.subjectId = subjectId;
		this.number = number;
		this.topic = topic;
		this.displayTitle = displayTitle;
		this.title = title;
		this.titleLong = titleLong;
		this.description = description;
		this.hasTopics = hasTopics;
		this.corequisites = corequisites;
		this.prerequisites = prerequisites;
		this.hasRestrictions = hasRestrictions;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSubjectLong() {
		return subjectLong;
	}
	public void setSubjectLong(String subjectLong) {
		this.subjectLong = subjectLong;
	}
	public String getSubjectShort() {
		return subjectShort;
	}
	public void setSubjectShort(String subjectShort) {
		this.subjectShort = subjectShort;
	}
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getDisplayTitle() {
		return displayTitle;
	}
	public void setDisplayTitle(String displayTitle) {
		this.displayTitle = displayTitle;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitleLong() {
		return titleLong;
	}
	public void setTitleLong(String titleLong) {
		this.titleLong = titleLong;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getHasTopics() {
		return hasTopics;
	}
	public void setHasTopics(Boolean hasTopics) {
		this.hasTopics = hasTopics;
	}
	public String getCorequisites() {
		return corequisites;
	}
	public void setCorequisites(String corequisites) {
		this.corequisites = corequisites;
	}
	public String getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}
	public Boolean getHasRestrictions() {
		return hasRestrictions;
	}
	public void setHasRestrictions(Boolean hasRestrictions) {
		this.hasRestrictions = hasRestrictions;
	}

}
