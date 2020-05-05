package com.javabykiran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.LoginDao;
import com.jbk.hibernate.Users;

@Service // @Component//@Cpnfiguration
public class LoginService {

	@Autowired
	LoginDao loginDao;

	public boolean checkLogin(Users user) {
		Users user2 = loginDao.checkUser(user);
		if (user2 != null) {
			return true;
		} else {
			return false;
		}
	}
}

	
