package com.java.config;


import org.springframework.stereotype.Component;


public class SwimCoach implements Coach{

	FortuneService service;

	public SwimCoach(FortuneService service) {
		super();
		this.service = service;
	}

	public String getWorkout() {
		// TODO Auto-generated method stub
		return "swim workour";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return service.getFortune();
	}
	
	
}
