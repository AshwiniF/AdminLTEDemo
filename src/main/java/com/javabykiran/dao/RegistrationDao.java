package com.javabykiran.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hibernate.Users;

@Repository
public class RegistrationDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public Users getNewUser(Users user) {
		Session session=sessionFactory.openSession();
		System.out.println(user.getName());
		session.saveOrUpdate(user);
		Transaction tr = session.beginTransaction();
		tr.commit();
		return user;
		
	}

}
