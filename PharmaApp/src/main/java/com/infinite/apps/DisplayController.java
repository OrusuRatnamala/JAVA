package com.infinite.apps;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	public class DisplayController {

		@RequestMapping("/display")
		public String insertrecord(HttpServletRequest request, HttpServletResponse response) {
			String medicine = request.getParameter("");
			System.out.println("");
			return "display";
		}
	}