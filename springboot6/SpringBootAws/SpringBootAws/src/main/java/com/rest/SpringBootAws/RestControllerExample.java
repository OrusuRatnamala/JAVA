package com.rest.SpringBootAws;

import org.springframework.scheduling.annotation.Scheduled;

public class RestControllerExample {
	static int i = 0;

	@Scheduled(fixedRate = 1000)

	public void displayTask() {
		System.out.println("Sending Message = " + i);
		i++;
	}
	@Scheduled(cron = "/10 * * * * *")
	  public  void displayTask1(){
	  System.out.println("Sending cron message =");
}
}
