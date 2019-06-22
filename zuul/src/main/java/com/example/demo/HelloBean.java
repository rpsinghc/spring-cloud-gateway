package com.example.demo;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
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

	//@CrossOrigin(origins = "*")
	@GetMapping("/user")
//	@Scheduled(fixedDelay = 2000)
	public Principal getUser(Principal user){
		return user;
	}



	// @Configuration
	// //@EnableAuthorizationServer
	// protected static class OAuth2Config extends AuthorizationServerConfigurerAdapter{
	// 	@Autowired
	// 	private AuthenticationManager authenticationManager;	


	// 	@Override
	// 	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
	// 		endpoints.authenticationManager(authenticationManager)
	// 	}

	// 	@Override
	// 	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
	// 		clients.inMemory().withClient("client")
	// 		.secret("clientsecret")
	// 		.authorizedGrantTypes("authorization_code","refresh_token","implicit","password","client_credentials")
	// 		.scopes("apiAccess");
	// 	}
	// }
}
