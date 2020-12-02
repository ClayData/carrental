package com.spring.DAO;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.spring.model.CustomerModel;

@Repository
public class AdminDAOImpl extends AbstractDAO implements AdminDAO {

	@Override
	public boolean validateAdmin(Login login) {
			System.out.println("Here is " + login.getEmail() + " " + login.getPassword());
			boolean user_found = false;
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
	
}
