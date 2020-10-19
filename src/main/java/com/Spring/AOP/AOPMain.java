package com.Spring.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPMain {

	public static void main(String[] args) {
		// Aop

		// read spring java config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		// get bean from container
		AccountDao account = context.getBean("accountDao", AccountDao.class);
		// call the buissness method
		System.out.println("adding acc");
		account.addAccount(true);
		System.out.println("setting acc name");
		account.setName("neha");
		account.divide(4,2);
		try {

			account.divide(4,0);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		account.getFortune(true);
		account.getFortune(false);
		// close context
		context.close();

	}

}
