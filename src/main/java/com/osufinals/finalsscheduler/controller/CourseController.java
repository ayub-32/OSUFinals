package com.osufinals.finalsscheduler.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osufinals.finalsscheduler.model.Course;
import com.osufinals.finalsscheduler.service.CourseService;

@RestController
@RequestMapping("/api/subjects")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/{subjectId}/courses")
	public List<Course> getCoursesBySubjectId(@PathVariable String subjectId) {
		return courseService.getCoursesBySubjectId(subjectId);
	}

}
