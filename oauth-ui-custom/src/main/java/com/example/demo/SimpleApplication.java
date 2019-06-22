package com.example.demo;

import com.example.demo.config.WebSecurityConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class SimpleApplication{
	public static void main(String[] args) {
		SpringApplication.run(new Class[]{SimpleApplication.class,WebSecurityConfig.class}, args);
	}

}
