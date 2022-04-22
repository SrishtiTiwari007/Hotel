package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class PracticeHotelApplication {
	@Autowired
	HotelRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(PracticeHotelApplication.class, args);
	}

}
