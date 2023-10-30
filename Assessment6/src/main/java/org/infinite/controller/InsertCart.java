package org.infinite.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.infinite.impl.CartImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InsertCart {
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String display(HttpServletRequest request, HttpServletResponse response, Model m) {
		String pname = request.getParameter("name");
		int amt = Integer.parseInt(request.getParameter("price"));
		int qty = Integer.parseInt(request.getParameter("quantity"));
		int tp = amt * qty;
		CartImpl impl = new CartImpl();
		impl.insert();
		return "success";
	}
}