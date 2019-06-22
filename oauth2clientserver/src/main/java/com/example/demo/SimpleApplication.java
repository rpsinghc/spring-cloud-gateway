package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@ComponentScan
@EnableResourceServer
@SpringBootApplication
public class SimpleApplication implements CommandLineRunner{
;
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
