package com.osufinals.finalsscheduler.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osufinals.finalsscheduler.model.Subject;
import com.osufinals.finalsscheduler.repository.subjects.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;
	
	public List<Subject> findAllSubjects() {
		return subjectRepository.findAll();
	}
}
