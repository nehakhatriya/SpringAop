package com.spring.testing;

import org.springframework.beans.factory.annotation.Autowired;

public class Bank {

	private Customer customer;
	private Account account;
	
	@Autowired
	public Bank(Customer customer, Account account) {
		super();
		this.customer = customer;
		this.account = account;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	

	
}
