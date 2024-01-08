package com.osufinals.finalsscheduler.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osufinals.finalsscheduler.model.Course;
import com.osufinals.finalsscheduler.repository.courses.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getCoursesBySubjectId(String subjectId) {
		return courseRepository.findBySubjectId(subjectId);
	}
	
}
