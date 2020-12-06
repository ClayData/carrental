package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.DAO.Login;
import com.spring.model.Car;
import com.spring.service.AdminService;
import com.spring.service.CarService;

@Controller
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	CarService carService;
	
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
			return "redirect:/savecar";
		}
	}
	
	@RequestMapping(value="/savecar", method=RequestMethod.GET)
	public String getCar(Model model) {
		System.out.println("I ran");
		List<Car> cars = carService.fetchCar();
		model.addAttribute("cars", cars);
		return "savecar";
	}
	
	@RequestMapping(value = "/addcar", method=RequestMethod.POST)
	public String saveCar(@ModelAttribute("carInfo") Car carInfo, BindingResult bindingResult,Model model) {
		carService.saveCar(carInfo);
		return "redirect:/savecar";
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.DELETE)
	public String deleteCustomer(@RequestParam("carId") Car car) {
		carService.deleteCar(car);
		return "redirect:/savecar";
	}
	
}
