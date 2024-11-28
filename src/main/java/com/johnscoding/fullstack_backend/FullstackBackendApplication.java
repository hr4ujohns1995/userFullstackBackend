package com.johnscoding.fullstack_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
public class FullstackBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullstackBackendApplication.class, args);
		System.out.println("hello world");
	}


}
