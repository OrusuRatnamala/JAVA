package com.infinite.Springs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Springs {
	@RequestMapping("/insert")
	public String insert() {
		System.out.println("insert was invoked");
		return "insert1";
	}

	@RequestMapping("/delete")
	public String delete() {
		System.out.println("delete was invoked");
		return "delete1";
	}
}