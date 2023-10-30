package com.infinite.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infinite.spring.service.IAaadharService;
import com.infinite.spring.service.PersonService;

@Controller
public class CAadhar {

	private IAaadharService iaadhar;
	
	@Autowired(required=true)
	@Qualifier(value="iaadhar")
	public void setIaadhar(IAaadharService iaadhar) {
		this.iaadhar = iaadhar;
	}


	
	@RequestMapping(value="/aadhar",method=RequestMethod.POST)
	public String iaadhar(HttpServletRequest request,Model mod)
	{
		mod.addAttribute("fname",request.getParameter("fname"));
		mod.addAttribute("lname",request.getParameter("lname"));
		mod.addAttribute("newregis",request.getParameter("newregis"));
		mod.addAttribute("updetails",request.getParameter("updetails"));
		return "isuccess";
		
	}
	
}
