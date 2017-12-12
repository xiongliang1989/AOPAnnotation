package com.xl.aop.impl;

import org.springframework.stereotype.Service;

import com.xl.aop.HelloWorld;

@Service("helloWorldImpl1")
public class HelloWorldImpl1 implements HelloWorld {

	public void printHelloWorld() {
		System.out.println("Enter HelloWorldImpl1.printHelloWorld()");
	}

	public void doPrint() {
		System.out.println("Enter HelloWorldImpl1.doPrint()");
		return;
	}

	public void doScan() {
		System.out.println("Enter HelloWorldImpl1.doScan()");
	}

}
