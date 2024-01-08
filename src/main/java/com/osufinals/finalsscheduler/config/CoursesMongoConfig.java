//package com.osufinals.finalsscheduler.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.core.MongoTemplate;
//
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//
//@Configuration
//public class CoursesMongoConfig {
//	
//	private final MongoClient mongoClient;
//
//	public CoursesMongoConfig(MongoClient mongoClient) {
//		this.mongoClient = mongoClient;
//	}
//	
//	@Bean
//	public MongoTemplate coursesMongoTemplate() {
//		String databaseName = "Courses";
//        return new MongoTemplate(MongoClients.create(), databaseName);
//	}
//}
