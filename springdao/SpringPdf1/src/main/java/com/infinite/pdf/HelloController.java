package com.infinite.pdf;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String display(HttpServletRequest request, Model m, @Valid @ModelAttribute("userForm") User userForm,
			BindingResult result) {

		/*
		 * String name = request.getParameter("name"); String pass =
		 * request.getParameter("pass"); if (pass.equals("admin")) { String msg
		 * = "hello" + name; m.addAttribute("message", msg); return "viewpage";
		 * } else { String msg = "Sorry" + name +
		 * ". you entered an incorrect password"; m.addAttribute("message",
		 * msg); return "error"; }
		 * 
		 * }
		 * 
		 * }
		 */
		if (result.hasErrors()) {
			return "viewpage";
		} else {
			return "error";
		}

	}
}
