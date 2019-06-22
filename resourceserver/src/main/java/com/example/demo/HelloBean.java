package com.example.demo;

import java.time.Instant;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.ToString;

@ToString
@RestController
public class HelloBean {
	static String time ;
	
	public static String getDate() {
		return time;
	}

	@GetMapping("/resource/rs")
	public String resource(){
		return  Instant.now().toString() + " : response from resource server";
	}

}
