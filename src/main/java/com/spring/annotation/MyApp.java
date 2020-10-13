package com.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationcontextannotation.xml");
        Coach coach=context.getBean("tenniscoach",Coach.class);
        System.out.print(coach.getDailyFortune());
        context.close();
	}

}
