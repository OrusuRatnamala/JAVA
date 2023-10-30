package org.infinite.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.infinite.impl.CartImpl;
import org.infinite.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DisplayCart {
	@RequestMapping(value = "/display", method = RequestMethod.POST)
	public String display(HttpServletRequest request, HttpServletResponse response, Model m) {
		List<Product> ls = null;
		String msg = null;
		CartImpl pd = new CartImpl();
		ls = pd.display();
		m.addAttribute("msg", ls);
		return "main";
	}

}