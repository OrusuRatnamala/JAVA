package com.infinite.springaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;

@Aspect //class level annotation.
public class MyAdviceClass { //aspect is for class level
	/*@Pointcut("execution(* com.infinite.springaop.*.*(..))")
	private void All(){
	}*/
	@Before("All()")
	public void beforeAdvice(){ //method level
	     System.out.println("Before advice executed.");
	}
	@After("All()")
	public void afterAdvice(){
	    System.out.println("After advice executed.");
	}

 

}