package com.javabykiran.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hibernate.Addnewuser;
import com.jbk.hibernate.Statemaster;

@Repository
public class AddUserDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	  public Addnewuser getNewUser(Addnewuser newUser) { 
		  Session session=sessionFactory.openSession();
	  System.out.println(newUser.getUsername()); 
	  Transaction tr = session.beginTransaction(); 
	  session.save(newUser); 
	  tr.commit(); 
	  return newUser; 
	  }
	 
	  @SuppressWarnings("unchecked")
	public List<Statemaster> loadState() {
		List<Statemaster> stateList=(List<Statemaster>) sessionFactory.openSession()
				.createCriteria(Statemaster.class).list();
		return stateList;
		  
	  }
	
}
