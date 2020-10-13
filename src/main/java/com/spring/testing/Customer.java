package com.spring.testing;

import org.springframework.beans.factory.annotation.Value;

public class Customer {

	@Value("${customer.firstName}")
	private String firstName;
	@Value("${customer.lastName}")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
