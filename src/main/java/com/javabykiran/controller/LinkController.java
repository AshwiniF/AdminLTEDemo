package com.javabykiran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.service.LinkService;
import com.jbk.hibernate.Links;

@Controller
public class LinkController {
	
	@Autowired
	LinkService linkservice;
	
	@RequestMapping("/link")
	public ModelAndView openlinkPage(@ModelAttribute Links link) {
		ModelAndView mv= new ModelAndView ();
		System.out.println("I am in controller");
		List<Links> list=linkservice.loadusefulLink();
		System.out.println(list);
		mv.addObject("listOfLinks", list);
		mv.setViewName("links");
		return mv;

		
	}

}
