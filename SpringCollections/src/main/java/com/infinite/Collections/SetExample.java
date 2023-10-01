package com.infinite.Collections;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		SetTest customer = (SetTest) context.getBean("SetExample");
		System.out.println(customer.getSt());

		context.registerShutdownHook();

	}
}
