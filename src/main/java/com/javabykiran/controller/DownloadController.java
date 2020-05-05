package com.javabykiran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.service.DownloadService;
import com.jbk.hibernate.Downloads;

@Controller
public class DownloadController {
	
	@Autowired
	DownloadService downloadService;
	
	@RequestMapping("/downloadslink")
	public ModelAndView openDownloadPage(@ModelAttribute Downloads downloads) {
		ModelAndView mv = new ModelAndView();
		System.out.println("I am in controller");
		//List<Downloads> list=downloadService.loadDownloadList();
		//System.out.println(list);
		//mv.addObject("listOfDownloads", list);
		mv.setViewName("downloads");
		return mv;
		
	}

}
