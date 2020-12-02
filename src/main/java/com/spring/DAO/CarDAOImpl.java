package com.spring.DAO;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.Car;


@Repository
public class CarDAOImpl extends AbstractDAO implements CarDAO {

	@Override
	public void saveCar(Car car) {
		getSession().save(car);
	}

	@Override
	public List<Car> fetchCar() {
		CriteriaQuery<Car> criteria = getSession().getCriteriaBuilder().createQuery(Car.class);
		criteria.select(criteria.from(Car.class));
		return getSession().createQuery(criteria).getResultList();
	}

	@Override
	public Car fetchCarById(@RequestParam int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCar(Car car) {
		getSession().update(car);
		
	}

	@Override
	public void deleteCar(Car car) {
		getSession().delete(car);
		
	}

}
