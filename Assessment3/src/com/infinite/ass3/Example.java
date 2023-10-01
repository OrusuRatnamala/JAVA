package com.infinite.ass3;


	import org.apache.log4j.Logger;
	import org.apache.log4j.PropertyConfigurator;

	public class Example{
		
		 private static final Logger logger
	     = Logger.getLogger(Example.class);
		
	public static void main(String [] args){
		PropertyConfigurator.configure("log4j.properties");
	    logger.info("INFINITE SOLUTIONS");
	    logger.info("Java BackEnd");
	}
	}


