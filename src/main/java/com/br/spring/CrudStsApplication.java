package com.br.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.br.spring.controllers")
public class CrudStsApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CrudStsApplication.class, args);
	}

}
