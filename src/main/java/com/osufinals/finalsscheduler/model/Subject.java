package com.osufinals.finalsscheduler.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Subjects")
public class Subject {
	
	@Id
	private String id;
	
	@Field("short")
	private String shortName;
	
	@Field("long")
	private String longName;
	private String title;
	
	public Subject() {
		
	}
	
	public Subject(String id, String shortName, String longName, String title) {
		super();
		this.id = id;
		this.shortName = shortName;
		this.longName = longName;
		this.title = title;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
    @Override
    public String toString() {
        return "Subject{" +
                "id='" + id + '\'' +
                ", shortName='" + shortName + '\'' +
                ", longName='" + longName + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

}
