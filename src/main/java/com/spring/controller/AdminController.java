package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.DAO.Login;
import com.spring.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value="/adminlogin", method = RequestMethod.GET)
	public String adminLogin(Model theModel) {
		Login log = new Login();
		theModel.addAttribute("adminInfo", log);
		
		return "adminlogin";
	}
	
	@RequestMapping(value="/adminForm", method = RequestMethod.POST)
	public String doAdmin(@ModelAttribute("adminInfo") Login log, Model model) {
		boolean isValid = adminService.validateAdmin(log);
		
		if(isValid == false) {
			System.out.println("false");
			return "adminlogin";
		} else {
			System.out.println("true");
			return "/savecar";
		}
	}
	
}
