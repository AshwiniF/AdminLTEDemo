package com.javabykiran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.DeleteUserDao;
import com.jbk.hibernate.Addnewuser;

@Service
public class DeleteUserService {
	
	@Autowired
	DeleteUserDao deleteUserDao;
	
	public boolean deleteData(int id) {
		System.out.println("i am in DeleteUserService");
		return deleteUserDao.deleteUser(id);
		
	}
	public boolean deleteMultiData(int [] id) {
		System.out.println("i am in DeleteUserService");
		return deleteUserDao.deleteMultiUser(id);
	}

}
