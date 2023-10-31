package com.infinite.SpringbootMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infinite.SpringbootMvc.model.Customer;
import com.infinite.SpringbootMvc.service.CustomerServiceImpl;

@Controller
public class CustomController {
	@Autowired
	CustomerServiceImpl cservice;

	@RequestMapping(value = "/getAllCustomers", method = RequestMethod.GET)
	public String getAllCustomers(Model model) {
		model.addAttribute("customer", new Customer());
		model.addAttribute("listOfCustomers", cservice.getAllCustomers());
		return "customerDetails";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/getAllCustomers";
	}

	@RequestMapping(value = "/getCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Customer getCustomerById(@PathVariable int id) {
		return cservice.getCustomer(id);
	}

	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addCustomer(@ModelAttribute("customer") Customer customer) {
		if (customer.getId() == 0) {
			cservice.addCustomer(customer);
		} else {
			cservice.updateCustomer(customer);
		}

		return "redirect:/getAllCustomers";
	}

	@RequestMapping(value = "/updateCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String updateCustomer(@PathVariable("id") int id, Model model) {
		model.addAttribute("customer", this.cservice.getCustomer(id));
		model.addAttribute("listOfCustomers", this.cservice.getAllCustomers());
		return "customerDetails";
	}

	@RequestMapping(value = "/deleteCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String deleteCustomer(@PathVariable("id") int id) {
		cservice.deleteCustomer(id);
		return "redirect:/getAllCustomers";

	}

}