package com.osufinals.finalsscheduler.repository.subjects;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.osufinals.finalsscheduler.model.Subject;
//@Configuration
//@EnableMongoRepositories(basePackages = "com.osufinals.finalsscheduler.subjects.repository", mongoTemplateRef = "subjectsMongoTemplate")
public interface SubjectRepository extends MongoRepository<Subject, String> {
	
}
