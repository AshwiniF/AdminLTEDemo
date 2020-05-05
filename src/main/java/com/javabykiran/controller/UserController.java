package com.javabykiran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.service.UserService;
import com.jbk.hibernate.Addnewuser;
import com.jbk.hibernate.Users;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/usersjsp")
	public ModelAndView openUserlist(@ModelAttribute Addnewuser user) {
		ModelAndView mv=new ModelAndView();
		
		List<Addnewuser>listOfUsers=userService.loadUsers();
		System.out.println("openUserlist..........");
		mv.setViewName("users");
		mv.addObject("userlist", listOfUsers);
		System.out.println(listOfUsers);
		return mv;
	}
	
	@RequestMapping(value = "/dashboardlink")
	public String getDashboard() {
		return "dashboard";
		
	}
}
