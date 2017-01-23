package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class SpittrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpittrApplication.class, args);
	}
}
