package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Car;
import com.spring.service.CarService;

@Controller
public class CarController {
	@Autowired
	CarService carService;
	
//	@RequestMapping(value="/go", method=RequestMethod.GET)
//	public String go() {
//		return "savecar";
//	}

	@RequestMapping(value = "/savecar", method=RequestMethod.POST)
	public String saveCar(@ModelAttribute("carInfo") Car carInfo, BindingResult bindingResult,Model model) {
		carService.saveCar(carInfo);
		return "redirect:/fetchcar";
	}
	
	@RequestMapping(value="/showcar")
	public String getCar(Model model) {
		List<Car> car = carService.fetchCar();
		model.addAttribute("cars", car);
		return "savecar";
	}
	
//	@RequestMapping(value="/showcar", method=RequestMethod.GET)
//	public String showCar(Model model) {
//		List<Car> car = carService.fetchCar();
//		model.addAttribute("carList", car);
//		return "showcar";
//	}
	
	@RequestMapping(value="/delete", method = RequestMethod.DELETE)
	public String deleteCustomer(@RequestParam("carId") Car car) {
		carService.deleteCar(car);
		return "redirect:/savecar";
	}
	
}


