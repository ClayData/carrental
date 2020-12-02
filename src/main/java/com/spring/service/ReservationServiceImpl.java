package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.DAO.ReservationDAO;
import com.spring.model.Reservation;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	ReservationDAO resDao;

	@Override
	@Transactional
	public void setReservation(Reservation res) {
		resDao.createRes(res);
	}
	
	
}
