package com.Spring.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

	// pointcut declaration
	@Pointcut("execution(* com.Spring.AOP.*.*(..))")
	public void forMVCpackage() {
	}

	@Before("forMVCpackage()")
	public void runBeforeAccount() {
		System.out.println("In Security Aspect");
	}
	
}
