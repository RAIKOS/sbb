package com.wiki.sbb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitController {

	public static void main(String[] args) {
		
		String git = "푸시";
		String token = "이클립스";
		
		
		SpringApplication.run(SbbApplication.class, args);
	}

}
