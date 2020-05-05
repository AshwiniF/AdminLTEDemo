package com.javabykiran.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.DownloadDao;
import com.jbk.hibernate.Downloads;

@Service
public class DownloadService {
	
	@Autowired
	DownloadDao downloadDao;
	
	public ArrayList<Downloads> loadDownloadList(){
		return (ArrayList<Downloads>) downloadDao.loadDownloads(); 
		
	}
	

}
