package com.demo;

public class TrackCoach implements Coach{

	private FortuneService service;
	public TrackCoach(FortuneService service) {
		super();
		this.service = service;
	}

	public String getWorkout() {
		// TODO Auto-generated method stub
		return "spend 30 min racing";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return service.getFortune();
	}

	//init method
	public void dostartupstuff() {
		System.out.print("init method");
	}
	
	//destroy method
	public void docleanupstuff() {
		System.out.print("destroy method");
	}
	
}
