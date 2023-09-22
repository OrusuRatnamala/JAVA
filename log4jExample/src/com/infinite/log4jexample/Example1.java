package com.infinite.log4jexample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Example1 {
	
	 private static final Logger logger
     = Logger.getLogger(Example1.class);
	
public static void main(String [] args){
	PropertyConfigurator.configure("log4j.properties");
    logger.info("Hi Hello World");
    logger.warn("Pls dont use it");
    logger.error("Help Error Occured");
    logger.fatal("Error ach");
}
}
   