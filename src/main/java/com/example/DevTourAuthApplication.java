package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = {"com.example.model.entities"})
//@EnableJpaRepositories(basePackages = {"com.example.repositories"})
//@ComponentScan(basePackages = {"com.example.controller", "com.example.serviceImpl"})

@SpringBootApplication
public class DevTourAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevTourAuthApplication.class, args);
	}

}
