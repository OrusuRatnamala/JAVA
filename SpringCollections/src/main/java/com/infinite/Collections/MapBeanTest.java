package com.infinite.Collections;
import java.util.HashMap;

import org.springframework.context.support.AbstractApplicationContext;

	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class MapBeanTest {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			MapBean customer = (MapBean) context.getBean("mapexample");
			HashMap<String,String> hp=(HashMap<String,String>) customer.getMp();
			System.out.println(hp.keySet());
            System.out.println(hp.values());
try
{
	context.registerShutdownHook();
}
catch(Exception e)
{
	e.printStackTrace();
		}
	}


}
