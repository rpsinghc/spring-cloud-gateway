package com.example.demo;

import java.security.Principal;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.security.AuthorizationAuditListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.stereotype.Component;

import lombok.ToString;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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



	@Configuration
	@EnableAuthorizationServer
	protected static class OAuth2Config extends AuthorizationServerConfigurerAdapter{
		@Autowired
		private AuthenticationManager authenticationManager;	


		@Override
		public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
			endpoints.authenticationManager(authenticationManager);
		}

		@Override
		public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
			clients.inMemory().withClient("client")
			.secret("clientsecret")
			.authorizedGrantTypes("authorization_code","refresh_token","implicit","password","client_credentials")
			.scopes("apiAccess");
		}
	}
}
