package com.example.gogonvservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GoGonvServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoGonvServiceApplication.class, args);
	}
}
