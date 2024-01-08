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
//public class SubjectsMongoConfig {
//	
//	private final MongoClient mongoClient;
//	
//	public SubjectsMongoConfig(MongoClient mongoClient) {
//		this.mongoClient = mongoClient;
//	}
//	
//	@Bean
//	public MongoTemplate subjectsMongoTemplate() {
//		String databaseName = "Subjects";
//        return new MongoTemplate(MongoClients.create(), databaseName);
//	}
//
//}
