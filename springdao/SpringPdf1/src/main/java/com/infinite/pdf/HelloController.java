package com.infinite.pdf;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String display(HttpServletRequest request, Model m) {
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		if (pass.equals("admin")) {
			String msg = "hello" + name;
			m.addAttribute("message", msg);
			return "viewpage";
		} else {
			String msg = "Sorry" + name + ". you entered an incorrect password";
			m.addAttribute("message", msg);
			return "error";
		}

	}

}
