package com.aurora.tcab_backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class T_CabApplication implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(T_CabApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	}
 	

}
