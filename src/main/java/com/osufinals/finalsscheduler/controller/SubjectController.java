package com.osufinals.finalsscheduler.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osufinals.finalsscheduler.model.Subject;
import com.osufinals.finalsscheduler.service.SubjectService;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {
	@Autowired
	private SubjectService subjectService;
	
	@GetMapping
	public List<Subject> getAllSubjects() {
		return subjectService.findAllSubjects();
	}
}
