package com.javabykiran.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hibernate.Addnewuser;

@Repository
public class EditUserDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Addnewuser> getData(int id) {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Addnewuser.class);
		criteria.add(Restrictions.eq("id", id));
		List<Addnewuser> list=criteria.list();
		return list;
		
	}
	public boolean updateUser(Addnewuser user) {
	    Session session=sessionFactory.openSession();
	   
	    Transaction tr=session.beginTransaction();
	    session.saveOrUpdate(user);
	    tr.commit();
	    return true;
	}

}



