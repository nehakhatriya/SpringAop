package com.java.config;

import org.springframework.stereotype.Component;

@Component("abc")
public class HappyFortune implements FortuneService{

	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day";
	}

}
