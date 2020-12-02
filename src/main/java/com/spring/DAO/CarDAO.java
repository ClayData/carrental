package com.spring.DAO;

import java.util.List;

import com.spring.model.Car;

public interface CarDAO {
	public void saveCar(Car car);
	public List<Car> fetchCar();
	public Car fetchCarById(int id);
	public void updateCar(Car car);
	public void deleteCar(Car car);
//	public void fetchCarByisReserved(Boolean isReserved);

}
