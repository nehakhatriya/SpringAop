package com.Spring.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {


	@Before("com.Spring.AOP.AspectClass.forMVCpackage()")
	public void runBeforeAccount(JoinPoint thejoinpoint) {
		System.out.println("In logging Aspect");
		//display method signature
		MethodSignature signature=(MethodSignature) thejoinpoint.getSignature();
		System.out.println("Method: "+signature);
		//display method arguments
		Object[] args = thejoinpoint.getArgs();
		for(Object a:args) {
			System.out.println("parameter: "+a);
		}
	}
}
