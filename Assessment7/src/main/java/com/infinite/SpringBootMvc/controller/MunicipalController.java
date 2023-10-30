package com.infinite.SpringBootMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.infinite.SpringBootMvc.model.Municipal;
import com.infinite.SpringBootMvc.service.MunicipalServiceImpl;

@Controller
public class MunicipalController {

	@Autowired
	MunicipalServiceImpl MunicipalServiceImpl;

	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/getAllComplains";
	}

	@RequestMapping(value = "/getAllComplains", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getAllComplains(Model m) {
		m.addAttribute("municipal", new Municipal());
		m.addAttribute("listOfComplains", MunicipalServiceImpl.getAllComplains());
		return "complaindetails";
	}

	@RequestMapping(value = "/addComplains", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addComplains(@ModelAttribute("municipal") Municipal municipal) {
		if (municipal.getId() == 0) {
			MunicipalServiceImpl.addMunicipal(municipal);
		} else {
			MunicipalServiceImpl.updateMunicipal(municipal);
			;
		}
		return "redirect:/getAllComplains";
	}

	@RequestMapping(value = "/updateComplains/{id}")
	public String updateComplains(@PathVariable("id") int id, Model model) {
		model.addAttribute("municipal", this.MunicipalServiceImpl.getMunicipal(id));
		model.addAttribute("listOfComplains", this.MunicipalServiceImpl.getAllComplains());
		return "complaindetails";
	}

	@RequestMapping(value = "/deleteComplains/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String deleteComplains(@PathVariable("id") int id) {
		MunicipalServiceImpl.deleteMunicipal(id);
		;
		return "redirect:/getAllComplains";
	}

}
