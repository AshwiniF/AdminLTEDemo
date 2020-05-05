package com.javabykiran.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.OperatorDao;
import com.jbk.hibernate.Operator;

@Service
public class OperatorService {
	
	@Autowired
	OperatorDao operatorDao;
	
	public ArrayList<Operator> loadOperator(){
		return (ArrayList<Operator>) operatorDao.loadOperator();
		
	}

}
