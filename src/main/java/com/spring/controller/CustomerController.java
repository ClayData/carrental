
package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.DAO.Login;
import com.spring.model.CustomerModel;
import com.spring.service.CustomerService;
import com.spring.validator.CustomerValidator;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@Autowired
	CustomerValidator customerValidator;

	@InitBinder
	protected void initBinding(WebDataBinder binder) {
		binder.addValidators(customerValidator);
	}
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String showRegister(Model theModel) {
		CustomerModel cust = new CustomerModel();
		theModel.addAttribute("custinfo", cust);
		return "register";
	}
	
	@RequestMapping(value = "/save")
	public String saveCustomer(@ModelAttribute(name = "custinfo") @Validated CustomerModel customerInfo, BindingResult result, Model model) {
		System.out.println("validating...");

		if(result.hasErrors()) {
			return "register";
		}
		System.out.println("validated");
		customerService.addCustomer(customerInfo);
		return "redirect:welcome";
	}


//	@PostMapping(value = "/save")
//	public String saveCustomer(@ModelAttribute(name = "customerAttribute") CustomerModel customer) {
//		customerService.addCustomer(customer);
//		return "login";
//	}
//	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
//	public String welcome() {
//		return "welcome";
//	}
//	
//	@GetMapping("/fetch")
//	public String getCustomerDetails(Model model) {
//		model.addAttribute("customerList", customerService.fetchCustomer());
//		return "welcome";
//	}

}
