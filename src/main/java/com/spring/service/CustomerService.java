package com.spring.service;

import java.util.List;

import com.spring.DAO.Login;
import com.spring.model.CustomerModel;

public interface CustomerService {
	public void addCustomer(CustomerModel customer);
	public void updateCustomer(CustomerModel customer);
	public void deleteCustomer(CustomerModel customer);
	public boolean validateCustomer(Login login);
	public List<CustomerModel> fetchCustomer();
}
