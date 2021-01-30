package com.caseItauUnibanco.restJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages={"com.caseItauUnibanco.restJava"})
public class RestJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestJavaApplication.class, args);
	}

}
