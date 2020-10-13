package com.spring.testing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring.testing")
@PropertySource("classpath:Bank.properties")
public class ConfigurationClassBank {

	@Bean
	public Customer customer() {
		return new Customer();
	}
	
	@Bean
	public Account account() {
		return new Account();
	}
	
	@Bean
	public Bank bank() {
		return new Bank(customer(),account());
	}
}
