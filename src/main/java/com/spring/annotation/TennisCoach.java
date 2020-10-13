package com.spring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tenniscoach")
@Scope("prototype")
public class TennisCoach implements Coach {

	// can set fiels directly using reflection api(internally)
	// @Autowired
	private FortuneService service;

//	@Autowired
//	public TennisCoach(HappyFortune service) {
//		super();
//		System.out.print("con");
//		this.service = service;
//	}

	public String getWorkout() {
		// TODO Auto-generated method stub
		return "practice daily";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return service.getFortune();
	}

	@Autowired
	@Qualifier("abc")
	public void setService(FortuneService service) {

		this.service = service;
	}
	// can auotwire on any method other that setter
//	@Autowired
//	public void fortuneService(HappyFortune service) {
//		System.out.print("con");
//		this.service = service;
//	}

	// init method
	@PostConstruct
	public void dostartupstuff() {
		System.out.print("init method");
	}

	// destroy method
	@PreDestroy
	public void docleanupstuff() {
		System.out.print("destroy method");
	}
}
