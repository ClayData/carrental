package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.DAO.Login;
import com.spring.model.Car;
import com.spring.service.CarService;
import com.spring.service.CustomerService;

@Controller
public class LogInController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin(Model theModel) {
		Login log = new Login();
		theModel.addAttribute("loginfo", log);
		
		return "login";
	}
	
	@RequestMapping(value = "/logForm", method = RequestMethod.POST)
	public String doLogin(@ModelAttribute("loginfo") Login log, Model model) {
		
		boolean isValid = customerService.validateCustomer(log);
		
		if(isValid == false) {
			System.out.println("false");
			return "login";
		} else {
			System.out.println("true");
			return "redirect:/showcar";
		}
	}
	

}
