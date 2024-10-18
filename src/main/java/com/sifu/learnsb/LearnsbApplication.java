package com.sifu.learnsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnsbApplication {

	public static void main(String[] args) {
		System.out.println("started the server!");
		SpringApplication.run(LearnsbApplication.class, args);
		System.out.println("... server running...");
	}

}
