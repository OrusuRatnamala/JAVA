package com.infinite.properties1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PropertiesContoller {
	@Value("${companys}")
	private String Cname;

	@RequestMapping("/create")
	public String create(Model mod) {
		mod.addAttribute("comp", Cname);
		System.out.println("create was invoked");
		return "index";

	}

}