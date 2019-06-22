package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.oauth2.client.filter.OAuth2ClientContextFilter;
import org.springframework.security.oauth2.config.annotation.web.configuration.OAuth2ClientConfiguration;


@Configuration
public class Auth2Config extends OAuth2ClientConfiguration{


@Bean
@Override
public OAuth2ClientContextFilter oauth2ClientContextFilter() {
    OAuth2ClientContextFilter filter = new OAuth2ClientContextFilter();
		return filter;
}

}