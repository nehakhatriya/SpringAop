package com.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.java.config")
public class CongigurationClass {

	@Bean
	public FortuneService sadFortune() {
		return new SadFortune();
	}
	
	@Bean
	public Coach abcd() {
		return new SwimCoach(sadFortune());
	}
}
