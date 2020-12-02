package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.Reservation;
import com.spring.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	ReservationService resService;
	
	@RequestMapping(value="/showRes", method=RequestMethod.GET)
	public String showRes(Model theModel) {
		Reservation res = new Reservation();
		theModel.addAttribute("resinfo", res);
		return "showcar";
	}
	
	@RequestMapping(value="/resForm", method = RequestMethod.POST)
	public String saveRes(@ModelAttribute(name = "resinfo") Reservation res, Model model) {
		resService.setReservation(res);
		
		return "showcar";
	}
}
