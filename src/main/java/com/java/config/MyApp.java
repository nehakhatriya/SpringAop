package com.java.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(CongigurationClass.class);
        Coach coach=context.getBean("tenniscoach",Coach.class);
        System.out.print(coach.getWorkout());
        Coach coach1=context.getBean("abcd",Coach.class);
        System.out.print(coach1.getWorkout());
        context.close();

	}

}
