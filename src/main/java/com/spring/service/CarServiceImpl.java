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
		carDAO.saveCar(car);		
	}

	@Override
	@Transactional
	public void updateCar(Car car) {
		carDAO.updateCar(car);		
	}

	@Override
	@Transactional
	public void deleteCar(Car car) {
		carDAO.deleteCar(car);		
	}

	@Override
	@Transactional
	public List<Car> fetchCar() {
		return carDAO.fetchCar();
	}

	@Override
	@Transactional
	public Car fetchCarById(int id) {
		return carDAO.fetchCarById(id);
	}

}
