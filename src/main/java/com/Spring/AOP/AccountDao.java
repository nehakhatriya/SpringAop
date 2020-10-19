package com.Spring.AOP;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {

	private String Name;
	
	public int divide(int num1,int num2) {
		if(num2==0)
			throw new ArithmeticException("denominater cannot be zero");
		return num1/num2;
	}
	
	public String getFortune(boolean b){
		if(b) {
			throw new NullPointerException();
		}
		return "good fortune";
	}
	
	public void addAccount(boolean b) {
		System.out.println("in class"+getClass()+"add acc");
	}
	
	public void deleteAccount() {
		System.out.println("in class"+getClass()+"delete acc");
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
