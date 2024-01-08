package com.osufinals.finalsscheduler.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "Sections")
public class Section {
    @Id
    private String id;
    private List<RegistrationBlock> registrationBlocks;
    private List<SectionDetail> sections;
    public Section() {
    	
    }
	public Section(String id, List<RegistrationBlock> registrationBlocks, List<SectionDetail> sections) {
		super();
		this.id = id;
		this.registrationBlocks = registrationBlocks;
		this.sections = sections;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<RegistrationBlock> getRegistrationBlocks() {
		return registrationBlocks;
	}
	public void setRegistrationBlocks(List<RegistrationBlock> registrationBlocks) {
		this.registrationBlocks = registrationBlocks;
	}
	public List<SectionDetail> getSections() {
		return sections;
	}
	public void setSections(List<SectionDetail> sections) {
		this.sections = sections;
	}
    
}

class RegistrationBlock {
    private String id;
    private List<String> sectionIds;
    private boolean selected;
    private boolean showLock;
    private boolean enabled;
    private List<String> disabledReasons;
    public RegistrationBlock() {
    	
    }
	public RegistrationBlock(String id, List<String> sectionIds, boolean selected, boolean showLock, boolean enabled,
			List<String> disabledReasons) {
		super();
		this.id = id;
		this.sectionIds = sectionIds;
		this.selected = selected;
		this.showLock = showLock;
		this.enabled = enabled;
		this.disabledReasons = disabledReasons;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<String> getSectionIds() {
		return sectionIds;
	}
	public void setSectionIds(List<String> sectionIds) {
		this.sectionIds = sectionIds;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public boolean isShowLock() {
		return showLock;
	}
	public void setShowLock(boolean showLock) {
		this.showLock = showLock;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public List<String> getDisabledReasons() {
		return disabledReasons;
	}
	public void setDisabledReasons(List<String> disabledReasons) {
		this.disabledReasons = disabledReasons;
	}
	
}

class SectionDetail {
    private String subjectId;
    private String course;
    private String sectionNumber;
    private List<MeetingDetail> meetings; 
    private List<Instructor> instructor;
    public SectionDetail() {
    	
    }
	public SectionDetail(String subjectId, String course, String sectionNumber, List<MeetingDetail> meetings, List<Instructor> instructor) {
		super();
		this.subjectId = subjectId;
		this.course = course;
		this.meetings = meetings;
		this.instructor = instructor;
		this.sectionNumber = sectionNumber;
	}
	public String getSectionNumber() {
		return sectionNumber;
	}
	public void setSectionNumber(String sectionNumber) {
		this.sectionNumber = sectionNumber;
	}
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public List<MeetingDetail> getMeetings() {
		return meetings;
	}
	public void setMeetings(List<MeetingDetail> meetings) {
		this.meetings = meetings;
	}
	public List<Instructor> getInstructors() {
		return instructor;
	}
	public void setInstructors(List<Instructor> instructor) {
		this.instructor = instructor;
	}
    
}

class MeetingDetail {
    private String days;
    private String daysRaw;
    private int startTime;  
    private int endTime;    
    private String location;
    private String startDate;
    private String endDate;
    private String firstMonday;
    private String lastMonday;
    public MeetingDetail() {
    	
    }
	public MeetingDetail(String days, String daysRaw, int startTime, int endTime, String location, String startDate,
			String endDate, String firstMonday, String lastMonday) {
		super();
		this.days = days;
		this.daysRaw = daysRaw;
		this.startTime = startTime;
		this.endTime = endTime;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.firstMonday = firstMonday;
		this.lastMonday = lastMonday;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public String getDaysRaw() {
		return daysRaw;
	}
	public void setDaysRaw(String daysRaw) {
		this.daysRaw = daysRaw;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getFirstMonday() {
		return firstMonday;
	}
	public void setFirstMonday(String firstMonday) {
		this.firstMonday = firstMonday;
	}
	public String getLastMonday() {
		return lastMonday;
	}
	public void setLastMonday(String lastMonday) {
		this.lastMonday = lastMonday;
	}
    
}

class Instructor {
	private String id;
	private String name;
	public Instructor() {
		
	}
	public Instructor(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
