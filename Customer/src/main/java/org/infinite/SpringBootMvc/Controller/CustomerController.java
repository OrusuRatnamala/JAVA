package org.infinite.SpringBootMvc.Controller;

import org.infinite.SpringBootMvc.Model.Customer;
import org.infinite.SpringBootMvc.Service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class CustomerController {
	@Autowired
	CustomerServiceImpl cservice;

	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/getAllCustomers";
	}

	@RequestMapping(value = "/getAllCustomers, method = RequestMethod.GET")
	public String getAllCustomers(Model model) {
		model.addAttribute("Customer", new Customer());
		model.addAttribute("ListOfCustomer", cservice.getAllCustomers());
		return "customerdetails";
	}
}
