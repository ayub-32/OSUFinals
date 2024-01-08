package com.osufinals.finalsscheduler.repository.sections;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.osufinals.finalsscheduler.model.Section;

public interface SectionRepository extends MongoRepository<Section, String>{
	@Query("{ 'sections.subjectId': ?0, 'sections.course': ?1 }")
    List<Section> findBySubjectIdAndCourse(String subjectId, String course);
}
