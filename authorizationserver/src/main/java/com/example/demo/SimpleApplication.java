package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@ComponentScan
@EnableAuthorizationServer
@SpringBootApplication
public class SimpleApplication {
;
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}
}
