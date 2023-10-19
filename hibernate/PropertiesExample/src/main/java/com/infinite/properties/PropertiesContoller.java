package com.infinite.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PropertiesContoller {
	@Value("${company}")
	private String Cname;

	@RequestMapping("/create")
	public String create(Model mod) {
		mod.addAttribute("comp", Cname);
		System.out.println("create was invoked");
		return "index";

	}

	@RequestMapping("/delete")
	public String delete() {
		System.out.println("delete was invoked");
		return "delete";
	}

}
