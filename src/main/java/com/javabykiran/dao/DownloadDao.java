package com.javabykiran.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hibernate.Downloads;

@Repository
public class DownloadDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Downloads> loadDownloads(){
		System.out.println("I am in Dao");
		List<Downloads> downloadsList=(List<Downloads>) sessionFactory.openSession()
		.createCriteria(Downloads.class).list();
		System.out.println(downloadsList);
		return downloadsList;
		
	}

}
