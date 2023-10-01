package com.infinite.Collections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CollectionTest customer = (CollectionTest) context.getBean("CollectionTest");
		System.out.println(customer.getLs());

		context.registerShutdownHook();

	}
}
