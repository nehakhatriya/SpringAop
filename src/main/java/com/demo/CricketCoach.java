package com.demo;

public class CricketCoach implements Coach{

	private FortuneService service;
    private String email;
    private String team;
    
	public FortuneService getService() {
		return service;
	}

	public void setService(FortuneService service) {
		this.service = service;
	}

	public String getWorkout() {
		// TODO Auto-generated method stub
		return "Practicein nets for 10hrs";
	}

	public String getDailyFortune() {
		return service.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
}
