package com.xl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xl.aop.impl.HelloWorldImpl1;

public class TestSpring {

	private static ApplicationContext ctx;

	public static void main(String[] args) {

		ctx = new ClassPathXmlApplicationContext("spring-application.xml");
		HelloWorldImpl1 hw1 = (HelloWorldImpl1) ctx.getBean("helloWorldImpl1");
		hw1.printHelloWorld();
		System.out.println();
		hw1.doPrint();
		System.out.println();
		hw1.doScan();
		
	}

}
