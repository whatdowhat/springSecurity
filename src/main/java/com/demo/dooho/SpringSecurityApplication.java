package com.demo.dooho;

import java.util.Arrays;
import java.util.function.Function;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.demo.dooho.domain.Authorities;
import com.demo.dooho.domain.User;
import com.demo.dooho.domain.repository.AuthoritiesRepository;
import com.demo.dooho.domain.repository.UsersRepository;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner demo(ApplicationContext ctx,AuthoritiesRepository authoritiesRepository, UsersRepository usersRepository) {
		return (agrs) -> {
			

          String[] beanNames = ctx.getBeanDefinitionNames();
          Arrays.sort(beanNames);
          for (String beanName : beanNames) {
              System.out.println(beanName);
          }
          
         
           
          Function<String, String> myFunction = item -> item.toString();
          
          
          System.out.println(test(myFunction.apply("TEST STRING")));
          
          
		};
		
		
	}
	
	public static String test(String string) {
		
		return string;
		
	}
}
