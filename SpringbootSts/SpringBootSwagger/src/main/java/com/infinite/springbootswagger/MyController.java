package com.infinite.springbootswagger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping(method=RequestMethod.GET, value="/api/hello" )
	public String hello()
	{
		return "welcome to infinite";
		
	}

}
