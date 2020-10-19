package com.Spring.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class AspectClass {

	//pointcut declaration
	@Pointcut("execution(* com.Spring.AOP.*.*(..))")
	public void forMVCpackage() {}
	
	//pointcut for setter
	@Pointcut("execution(*  com.Spring.AOP.*.set*(..)) )")
	public void getter() {}
	
	//pointcut for setter
	@Pointcut("execution(*  com.Spring.AOP.*.get*(..)) )")
	public void setter() {}
	
	@Pointcut("forMVCpackage()&&!(getter()||setter())")
	public void forNoGetterSetter() {}
	// run before addAccount() method in any class
	
	@Before("forNoGetterSetter()")
	public void runBeforeAddAccount() {
		System.out.println("In Before Advice Aspect 1");
	}
	
	// run before deleteAccount() method in any class
		@Before("forMVCpackage()")
		public void runBeforeAccount() {
			System.out.println("In Before Advice Aspect 2");
		}
	
}
// run before method stating with add in any class
// @Before("execution(public void add*())")

//run before addAccount() method in only Account class
// @Before("execution(public void com.Spring.MVC.AccountDao.add*())")

//run before method of any modifier and any return type
// @Before("execution(* * addAccount())")

//run before method of any return type(modifier is optional)
// @Before("execution(* addAccount())")

//match a method with no arguments
//@Before("execution(public void addAccount())")

//matches a method with one parameter of any type
// @Before("execution(public void addAccount(*))")

//matches a method with one parameter wiht 0 or more parameter of any type
// @Before("execution(public void addAccount(..))")

//match a method with arguments of Account object
//@Before("execution(public void addAccount(com.Spring.MVC.Account))")

//match a method with any return type any class any method with any number of parameter of any type
//@Before("execution(* .com.Spring.MVC.*.*(..))")
