package com.spring.DAO;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;
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
		List<Car>cars = getSession().createQuery(criteria).getResultList();
		System.out.println(cars);
		return cars;
//		CriteriaBuilder builder = getSession().getCriteriaBuilder();
//		CriteriaQuery<Car> query = builder.createQuery(Car.class);
//		Root<Car> carRoot = query.from(Car.class);
//		CriteriaQuery<Car> all = query.select(carRoot);
//		TypedQuery<Car> allQuery = getSession().createQuery(all);
//		
//		return allQuery.getResultList();
//		Session currentSession = getSession();
		
		// create a query  ... sort by last name
//		Query<Car> theQuery = 
//				currentSession.createQuery("from CAR",
//											Car.class);
		
		// execute query and get result list
//		List<Car> cars = theQuery.getResultList();
//		return cars;
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
