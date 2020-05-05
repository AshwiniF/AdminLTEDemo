package com.javabykiran.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hibernate.Users;

@Repository
public class LoginDao {

	@Autowired
	SessionFactory sessionFactory;

	public Users checkUser(Users user) {
		Session session=sessionFactory.openSession();
		org.hibernate.Query query = session.createQuery("select name,email,password from Users where email=:email and password=:password");
		query.setParameter("email", user.getEmail());
		query.setParameter("password", user.getPassword());
		
		List<Users> list=query.list();
		if(!list.isEmpty()) {
			return user;
		}
		return null;
		}
}









