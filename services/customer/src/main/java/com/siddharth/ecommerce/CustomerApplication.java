package com.siddharth.ecommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner testMongo() {
//		return args -> {
//			com.mongodb.client.MongoClient client = com.mongodb.client.MongoClients.create(
//					"mongodb://siddharth:siddharth@localhost:27017/customer?authSource=admin&authMechanism=SCRAM-SHA-256"
//			);
//			client.getDatabase("admin").runCommand(new org.bson.Document("ping", 1));
//			System.out.println("MONGO CONNECTED DIRECTLY OK");
//			client.close();
//		};
//	}
}


