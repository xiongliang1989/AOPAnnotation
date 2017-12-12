package com.xl.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeHandler {

	// @Before("execution(* com.xl.aop.impl.HelloWorldImpl1.*(..))")
	// public void printTimeBefore() {
	// System.out.println("CurrentTime = " + System.currentTimeMillis());
	// }
	//
	// @After
	// ("execution(* com.xl.aop.impl.HelloWorldImpl1.*(..))")
	// public void printTimeAfter() {
	// System.out.println("CurrentTime = " + System.currentTimeMillis());
	// }

	@Around("execution(* com.xl.aop.impl.HelloWorldImpl1.*(..))")
	public void printTimeAround() {
		System.out.println("CurrentTime = " + System.currentTimeMillis());
	}

	@AfterReturning("execution(* com.xl.aop.impl.HelloWorldImpl1.*(..))")
	public void printTimeAfterReturning() {
		System.out.println("CurrentTime = " + System.currentTimeMillis());
	}

	@AfterThrowing("execution(* com.xl.aop.impl.HelloWorldImpl1.*(..))")
	public void printTimeAfterThrowing() {
		System.out.println("CurrentTime = " + System.currentTimeMillis());
	}

}
