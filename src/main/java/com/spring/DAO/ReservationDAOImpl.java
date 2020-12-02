package com.spring.DAO;

import org.springframework.stereotype.Repository;

import com.spring.model.Reservation;

@Repository
public class ReservationDAOImpl extends AbstractDAO implements ReservationDAO{

	@Override
	public void createRes(Reservation res) {
		getSession().save(res);
	}
	
}
