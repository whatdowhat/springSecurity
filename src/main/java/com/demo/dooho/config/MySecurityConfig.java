package com.demo.dooho.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class MySecurityConfig  extends WebSecurityConfigurerAdapter{

	@Autowired 
	DataSource dataSource;
	
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		//auth.inMemoryAuthentication().withUser("admin").password("{noop}1234").roles("ADMIN");
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
		.authorizeRequests()
		.antMatchers("/admin/**").hasRole("ADMIN")
		
		.antMatchers("/**").permitAll();
	
		http.formLogin().loginPage("/login").permitAll();
		
	}

	
	
	
}
