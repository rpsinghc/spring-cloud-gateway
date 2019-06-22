package com.example.demo;

import java.security.Principal;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.ToString;

@ToString
@Component
@RestController
public class HelloBean {

	static String time ;
	

	
	public static String getDate() {
		return time;
	}

	@GetMapping("/secured/page")
	public String secured(){
		return "secured";
	}
	
	// @GetMapping("/")
	// public String index(){
	// 	return "index";
	// }

	@GetMapping("/user")
	public Principal getUser(Principal user){
		return user;
	}



}
