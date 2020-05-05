package com.javabykiran.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.LinkDao;
import com.jbk.hibernate.Links;

@Service
public class LinkService {
	
	@Autowired
	LinkDao linkdao;
	
	public ArrayList<Links> loadusefulLink(){
		return (ArrayList<Links>) linkdao.loadlink();
		
	}

}
