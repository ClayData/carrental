package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.DAO.CarDAO;
import com.spring.model.Car;

@Service
public class CarServiceImpl implements CarService {
	@Autowired
	private CarDAO carDAO;

	@Override
	@Transactional
	public void saveCar(Car car) {
		car.setReserved("no");
		carDAO.saveCar(car);		
	}

	@Override
	@Transactional
	public void updateCarYes(int id) {
		carDAO.updateCarYes(id);		
	}

	@Override
	@Transactional
	public void deleteCar(int id) {
		carDAO.deleteCar(id);		
	}

	@Override
	@Transactional
	public List<Car> fetchAllCars() {
		return carDAO.fetchAllCars();
	}

	@Override
	@Transactional
	public Car fetchCarById(int id) {
		return carDAO.fetchCarById(id);
	}

	@Override
	public void updateCarNo(int id) {
		carDAO.updateCarNo(id);
		
	}

	@Override
	public List<Car> fetchUnreserved() {
		carDAO.fetchUnreserved();
		return null;
	}

}
