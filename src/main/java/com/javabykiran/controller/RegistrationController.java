package com.javabykiran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.service.RegistrationService;
import com.jbk.hibernate.Users;

@Controller
public class RegistrationController {
	
	@Autowired
	RegistrationService registrationService;
	
	@RequestMapping("/newregistration")
	public String openRegisterLink() {
		return "register";
		
	}
	
	@RequestMapping("/registration")
	public ModelAndView getNewregistration(@ModelAttribute Users user) {
		ModelAndView mv= new ModelAndView();
		System.out.println("i am registration controller");
		
		if(registrationService.getRegister(user) != null) {
		
			mv.setViewName("register");
			mv.addObject("msg", "registeration successfully");
		} else {
			mv.addObject("msg", "someting went wrong");
			mv.setViewName("register");
		}

		return mv;
	}
		
	}


