package com.infinite.beans;


	 

	import org.springframework.context.support.AbstractApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	 

	public class ConstructorTest {
		public static void main(String...args)
		{
			AbstractApplicationContext context=//creates container
					new ClassPathXmlApplicationContext("ApplicationContext.xml");
			Constructorinjection customer=(Constructorinjection)context.getBean("const1");//customer is the bean name
			customer.displayName();

			context.registerShutdownHook();//to destroy container

		}

	 

	 

	}


