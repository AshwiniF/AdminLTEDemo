package com.javabykiran.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hibernate.Links;

@Repository
public class LinkDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Links> loadlink(){
		System.out.println("I am in Dao");
		List<Links> linksList=(List<Links>) sessionFactory.openSession()
		.createCriteria(Links.class).list();
		System.out.println(linksList);
		return linksList;
		
	}


}
