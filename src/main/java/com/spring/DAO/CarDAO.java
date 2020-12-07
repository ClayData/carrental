package com.spring.DAO;

import java.util.List;

import com.spring.model.Car;

public interface CarDAO {
	public void saveCar(Car car);
	public List<Car> fetchAllCars();
	public List<Car> fetchUnreserved();
	public Car fetchCarById(int id);
	public void updateCarYes(int id);
	public void updateCarNo(int id);
	public void deleteCar(int id);
//	public void fetchCarByisReserved(Boolean isReserved);

}
