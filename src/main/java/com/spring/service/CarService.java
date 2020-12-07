package com.spring.service;

import java.util.List;

import com.spring.model.Car;

public interface CarService {
	public void saveCar(Car car);
	public void updateCarYes(int id);
	public void updateCarNo(int id);
	public void deleteCar(int id);
	public List<Car> fetchAllCars();
	public List<Car> fetchUnreserved();
	public Car fetchCarById(int id);

}
