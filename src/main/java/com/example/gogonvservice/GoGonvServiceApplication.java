package com.example.gogonvservice;

import com.example.gogonvservice.converionService.ConverionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GoGonvServiceApplication implements CommandLineRunner{

	@Autowired
	ConverionService converionService;
	public static void main(String[] args) {
		SpringApplication.run(GoGonvServiceApplication.class, args);
	}

	@Override
	public void run(String... arg) throws Exception {
		//converionService.deleteAll();
		//converionService.init();
	}
}
