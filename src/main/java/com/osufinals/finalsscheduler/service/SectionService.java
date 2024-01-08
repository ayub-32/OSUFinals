package com.osufinals.finalsscheduler.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osufinals.finalsscheduler.model.Section;
import com.osufinals.finalsscheduler.repository.sections.SectionRepository;

@Service
public class SectionService {
	
	private final SectionRepository sectionRepository;
	
	@Autowired
    public SectionService(SectionRepository sectionRepository) {
        this.sectionRepository = sectionRepository;
    }
	
    public List<Section> getSectionsBySubjectIdAndCourse(String subjectId, String course) {
        return sectionRepository.findBySubjectIdAndCourse(subjectId, course);
    }
}
