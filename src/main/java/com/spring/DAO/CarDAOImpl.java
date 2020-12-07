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
	public List<Car> fetchAllCars() {
		CriteriaQuery<Car> criteria = getSession().getCriteriaBuilder().createQuery(Car.class);
		criteria.select(criteria.from(Car.class));
		List<Car>cars = getSession().createQuery(criteria).getResultList();
		System.out.println(cars);
		return cars;

	}

	@Override
	public List<Car> fetchUnreserved() {
		CriteriaQuery<Car> criteria = getSession().getCriteriaBuilder().createQuery(Car.class);
		Root<Car> root = criteria.from(Car.class);
		criteria.where(getSession().getCriteriaBuilder().like(root.get("isReserved"), "no"));
		List<Car> cars = getSession().createQuery(criteria).getResultList();
		return cars;
	}
	
	@Override
	public Car fetchCarById(@RequestParam int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCarYes(int id) {
		String qryString = "update Car set isReserved = 'yes' where id = ?";
		Query q = getSession().createQuery(qryString);
		q.setParameter(0, id);
		q.executeUpdate();
		
	}
	
	@Override
	public void updateCarNo(int id) {
		String qryString = "update Car set isReserved = 'no' where id = ?";
		Query q = getSession().createQuery(qryString);
		q.setParameter(0, id);
		q.executeUpdate();
		
	}

	@Override
	public void deleteCar(int id) {
		Query q = getSession().createQuery("delete form Car where id =:carid");
		q.setParameter("carid", id);
		q.executeUpdate();
		
	}

}
