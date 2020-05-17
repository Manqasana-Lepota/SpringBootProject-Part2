package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class SpringBootMainApplicationPart2 {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootMainApplicationPart2.class, args);
	}

}
