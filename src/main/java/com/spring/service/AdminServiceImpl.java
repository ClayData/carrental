package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.DAO.AdminDAO;
import com.spring.DAO.Login;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDAO adminDao;

	@Override
	@Transactional
	public boolean validateAdmin(Login login) {
		
		return adminDao.validateAdmin(login);
	}
	
	
}
