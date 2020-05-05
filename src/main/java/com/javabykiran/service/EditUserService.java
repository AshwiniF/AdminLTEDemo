package com.javabykiran.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.EditUserDao;
import com.jbk.hibernate.Addnewuser;

@Service
public class EditUserService {
	
	@Autowired
	EditUserDao editUserDao;
		
	public List<Addnewuser> editdata(int id) {
		System.out.println("i am in edit Service");
		return editUserDao.getData(id);
		
	}
	public boolean updateUser(Addnewuser user) {
	    
	    return editUserDao.updateUser(user);
	
}
		
	}
	

