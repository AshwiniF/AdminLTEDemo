package com.javabykiran.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hibernate.Operator;

@Repository
public class OperatorDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Operator> loadOperator(){
		System.out.println("I am in Dao");
		List<Operator> operatorList=(List<Operator>) sessionFactory.openSession()
		.createCriteria(Operator.class).list();
		System.out.println(operatorList);
		return operatorList;
		
	}

}
