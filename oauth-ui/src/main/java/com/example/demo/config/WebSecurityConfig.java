package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Order(101)
@EnableOAuth2Sso
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  OAuth2ClientContext oauth2ClientContext;
  
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    System.out.println(http);
    http
      .antMatcher("/**")
      .authorizeRequests()
        .antMatchers("/", "/webjars/**", "/error**").permitAll()
      .anyRequest()
        .authenticated()
      .and().logout().logoutSuccessUrl("/").permitAll().and().csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
  }

}