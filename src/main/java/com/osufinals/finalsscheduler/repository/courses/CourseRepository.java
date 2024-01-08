package com.osufinals.finalsscheduler.repository.courses;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.osufinals.finalsscheduler.model.Course;

import java.util.List;

//@Configuration
//@EnableMongoRepositories(basePackages = "com.osufinals.finalsscheduler.courses.repository", mongoTemplateRef = "coursesMongoTemplate")
public interface CourseRepository extends MongoRepository<Course, String> {
	List<Course> findBySubjectId(String subjectId);
}
