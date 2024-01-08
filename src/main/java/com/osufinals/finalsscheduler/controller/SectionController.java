package com.osufinals.finalsscheduler.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osufinals.finalsscheduler.model.Section;
import com.osufinals.finalsscheduler.service.SectionService;

@RestController
@RequestMapping("/api/subjects/{subjectId}/courses/{courseId}/sections")
public class SectionController {
	
	
	private final SectionService sectionService;
	
	@Autowired
	public SectionController(SectionService sectionService) {
		this.sectionService = sectionService;
	}
	
    @GetMapping
    public List<Section> getSectionsBySubjectIdAndCourse(@PathVariable String subjectId, @PathVariable String courseId) {
        return sectionService.getSectionsBySubjectIdAndCourse(subjectId, courseId);
    }
}
