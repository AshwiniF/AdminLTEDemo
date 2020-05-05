package com.javabykiran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.RegistrationDao;
import com.jbk.hibernate.Users;

@Service
public class RegistrationService {
	
	@Autowired
	RegistrationDao registrationDao;
	
	public Users getRegister(Users user) {
		return registrationDao.getNewUser(user);
		
	}

}
