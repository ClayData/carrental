package com.spring.DAO;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.spring.model.CustomerModel;

@Repository
public class CustomerDAOImpl extends AbstractDAO implements CustomerDAO {
	
	@Override
	public List<CustomerModel> fetchCustomer() {
		CriteriaQuery<CustomerModel> criteria = getSession().getCriteriaBuilder().createQuery(CustomerModel.class);
		criteria.select(criteria.from(CustomerModel.class));
		return getSession().createQuery(criteria).getResultList();
	}

	@Override
	public void save(CustomerModel cust) {
		System.out.println("saving...");
		getSession().save(cust);
		System.out.println("saved");
	}

	@Override
	public void update(CustomerModel customer) {
		getSession().update(customer);
	}
	
	@Override
	public boolean validateCustomer(Login login) {
		System.out.println("Here is " + login.getEmail() + " " + login.getPassword());
		boolean user_found = false;
//		List list = getSession().createCriteria(CustomerModel.class)
//				.add(Restrictions.like("email", login.getEmail()))
//				.add(Restrictions.like("password", login.getPassword()))
//				.list();
		CriteriaQuery<CustomerModel> criteria = getSession().getCriteriaBuilder().createQuery(CustomerModel.class);
		Root<CustomerModel> root = criteria.from(CustomerModel.class);
		criteria.select(root);
		criteria.where(getSession().getCriteriaBuilder().like(root.get("email"), login.getEmail().toLowerCase()));
		criteria.where(getSession().getCriteriaBuilder().like(root.get("password"), login.getPassword().toLowerCase()));
		List<CustomerModel> list = getSession().createQuery(criteria).getResultList();
		if (list != null && (list.size() > 0)) {
			
			user_found= true;
		}
		
		return user_found;
	}

	@Override
	public void delete(CustomerModel customer) {
		getSession().delete(customer);
	}
	
}
