package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.DAO.AdminDAO;
import com.spring.DAO.Login;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDAO adminDao;

	@Override
	public boolean validateAdmin(Login login) {
		
		return adminDao.validateAdmin(login);
	}
	
	
}
