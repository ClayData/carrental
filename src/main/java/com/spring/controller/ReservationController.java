package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.Reservation;
import com.spring.service.CarService;
import com.spring.service.ReservationService;
import com.spring.validator.ResValidator;

@Controller
public class ReservationController {
	
	@Autowired
	ReservationService resService;
	
	@Autowired
	CarService carService;
	
	@Autowired
	ResValidator resValidator;
	
	@InitBinder
	protected void initBinding(WebDataBinder binder) {
		binder.addValidators(resValidator);
	}
	
//	@RequestMapping(value="/showcar", method=RequestMethod.GET)
//	public String formRes(Model theModel) {
//		Reservation res = new Reservation();
//		theModel.addAttribute("resinfo", res);
//		return "showcar";
//	}
	
	@RequestMapping(value="/resForm", method=RequestMethod.POST)
	public String createRes(@ModelAttribute("resinfo") @Validated Reservation res,BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			System.out.println("invalid");
			return "redirect:/showcar";
		} else {
		carService.updateCarYes(res.getCar_id());
		resService.setReservation(res);
		return "congrats";
		}
	}
}
