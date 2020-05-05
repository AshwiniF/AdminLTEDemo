package com.javabykiran.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hibernate.Addnewuser;

@Repository
public class UserDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Addnewuser> loadUser() {
		sessionFactory.openSession().clear();
		
		List<Addnewuser> listusers = (List<Addnewuser>) sessionFactory.openSession()
		.createCriteria(Addnewuser.class).list();
		System.out.println(listusers);
		
		return listusers;
	}

}
