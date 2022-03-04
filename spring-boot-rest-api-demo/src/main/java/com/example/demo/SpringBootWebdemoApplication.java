package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//@EntityScan("com.psl.training.*")
@SpringBootApplication
public class SpringBootWebdemoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootWebdemoApplication.class, args);
	}

}
