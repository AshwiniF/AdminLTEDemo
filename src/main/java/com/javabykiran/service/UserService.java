package com.javabykiran.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.UserDao;
import com.jbk.hibernate.Addnewuser;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public ArrayList<Addnewuser> loadUsers() {
		return (ArrayList<Addnewuser>) userDao.loadUser();
	}
}


