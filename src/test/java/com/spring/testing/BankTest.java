package com.spring.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { ConfigurationClassBank.class })
class BankTest {

	@Autowired
	Bank bank;
	
	@Test
	void test() {
		assertEquals("101",bank.getAccount().getAccID());
		bank.getAccount().deposit(2000);
		assertEquals(4000,bank.getAccount().getBalance());
	}

}
