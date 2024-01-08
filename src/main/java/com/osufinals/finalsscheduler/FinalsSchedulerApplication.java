package com.osufinals.finalsscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@SpringBootApplication
public class FinalsSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalsSchedulerApplication.class, args);
	}

}
