package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// without spring config files
//		Coach coach=new BaseballCoach();
//		String msg=coach.getWorkout();
//		System.out.println(msg);
		//load config file		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		//retrieve bean from container
		Coach thecoach=(TrackCoach)context.getBean("mytcoach");
		
		
		CricketCoach cricoach=(CricketCoach)context.getBean("mycricoach");
		//call methods on bean
		System.out.println(thecoach.getWorkout());
		System.out.println(thecoach.getDailyFortune());
		System.out.println(cricoach.getDailyFortune());
		System.out.println(cricoach.getEmail());
		System.out.println(cricoach.getTeam());
		//close context
		context.close();
		
	}

}
