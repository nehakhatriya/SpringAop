package com.demo;

public class BaseballCoach implements Coach{

	private FortuneService service;
	public BaseballCoach(FortuneService service) {
		super();
		this.service = service;
	}

	public String getWorkout() {
		return "spend 30 min in batting practice";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return service.getFortune();
	}
}
