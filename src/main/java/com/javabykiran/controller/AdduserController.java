package com.javabykiran.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.service.AddUserService;
import com.jbk.hibernate.Addnewuser;
import com.jbk.hibernate.Statemaster;

@Controller
public class AdduserController {
	
	@Autowired
	AddUserService addUserService;
	

	@RequestMapping(value= "/addusers")
	 public ModelAndView newUser() {
		ModelAndView mv = new ModelAndView();
		System.out.println("open Adduser page");
		ArrayList<Statemaster> listOfState= addUserService.loadState();
		System.out.println(listOfState);
		mv.addObject("stateList",listOfState);
		mv.setViewName("add_user");
		return mv;
    }
	
	@RequestMapping("/saveUser")
   public ModelAndView AddNewUser(@ModelAttribute Addnewuser newUser) {
		System.out.println("ADD USER CONTROLLER>>"+newUser);
		ModelAndView mv = new ModelAndView();
		if(addUserService.addNewUser(newUser)!=null) {
			ArrayList<Statemaster> listOfState= addUserService.loadState();
			mv.addObject("stateList",listOfState);
			mv.setViewName("add_user");
			mv.addObject("msg","user added successfully");
		}else {
			mv.addObject("msg","not save");
			mv.setViewName("add_user");
		}
		return mv;
}
}