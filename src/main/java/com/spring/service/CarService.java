package com.spring.service;

import java.util.List;

import com.spring.model.Car;

public interface CarService {
	public void saveCar(Car car);
	public void updateCar(Car car);
	public void deleteCar(Car car);
	public List<Car> fetchCar();
	public Car fetchCarById(int id);

}
