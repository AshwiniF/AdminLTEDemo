package com.javabykiran.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.AddUserDao;
import com.jbk.hibernate.Addnewuser;
import com.jbk.hibernate.Statemaster;

@Service
public class AddUserService {
	
	@Autowired
	AddUserDao addUserDao;
	
	public Addnewuser addNewUser(Addnewuser newUser) {
		return addUserDao.getNewUser(newUser);
		
	}
 public ArrayList<Statemaster> loadState(){
	 return (ArrayList<Statemaster>) addUserDao.loadState();
 }

}
