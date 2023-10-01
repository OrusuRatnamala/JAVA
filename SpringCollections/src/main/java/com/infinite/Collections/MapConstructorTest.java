package com.infinite.Collections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class MapConstructorTest {
	public static void main(String...args)
	{
		AbstractApplicationContext context=//creates container
		new ClassPathXmlApplicationContext("ApplicationContext.xml");
		MapConstructorinjection customer=(MapConstructorinjection)context.getBean("mapexampleconst");//customer is the bean name
		customer.display();

		context.registerShutdownHook();//to destroy container

	}

 

 

}


