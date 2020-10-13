package com.spring.testing;

import org.springframework.beans.factory.annotation.Value;

public class Account {

	@Value("${account.accId}")
	private String accID;
	@Value("${account.balance}")
	private double balance;
	

	public void deposit(int amt) {
		balance+=amt;
	}
	public String getAccID() {
		return accID;
	}

	public void setAccID(String accID) {
		this.accID = accID;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
