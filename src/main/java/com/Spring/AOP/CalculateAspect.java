package com.Spring.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class CalculateAspect {

	//poincut declaration
	@Pointcut("execution(public int divide(..))")
	public void divide() {}
	//@AfterReturning aspect
	@AfterReturning(pointcut="divide()",returning="result")
	public void afterReturnAdvice(JoinPoint thejoinpoint,int result) {
		System.out.println("In Calculate Aspect- after returning advise");
		MethodSignature signature=(MethodSignature) thejoinpoint.getSignature();
		System.out.println("Method: "+signature);
		Object[] args = thejoinpoint.getArgs();
		for(Object a:args) {
			System.out.println("parameter: "+a);
		}
		System.out.println("returned val: "+result);
	}	
	
	//@AfterThrowing advice
	@AfterThrowing(pointcut="divide()",throwing="result")
	public void afterThrowingAdvice(JoinPoint thejoinpoint,Throwable result) {
		System.out.println("In Calculate Aspect- after throwing advise");
		MethodSignature signature=(MethodSignature) thejoinpoint.getSignature();
		System.out.println("Method: "+signature);
		Object[] args = thejoinpoint.getArgs();
		for(Object a:args) {
			System.out.println("parameter: "+a);
		}
		System.out.println("returned val: "+result);
	}
	
	//@After advise- runs whether success or exception. runs before @AfterThrowing and @After doesn't have access to exception 
	@After("divide()")
	public void afterAdvise(JoinPoint thejoinpoint) {
		System.out.println("In Calculate Aspect-after advice");
		MethodSignature signature=(MethodSignature) thejoinpoint.getSignature();
		System.out.println("Method: "+signature);
		Object[] args = thejoinpoint.getArgs();
		for(Object a:args) {
			System.out.println("parameter: "+a);
		}
	}
	
	//@Around advice
	@Around("execution( * getFortune(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinpoint) throws Throwable{
		Object result=null;
		try {
			result=joinpoint.proceed();
		}
		catch(Exception e) {
			System.out.println("exeption occured in around");
			result="default fortune";
		}
		return result;
	}
}
