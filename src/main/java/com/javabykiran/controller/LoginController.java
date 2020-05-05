package com.javabykiran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.service.LoginService;
import com.jbk.hibernate.Users;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/login")
	public ModelAndView checkLogin(@ModelAttribute Users user) {
		System.out.println("user >>> " + user.getEmail());
		System.out.println("user >>> " + user.getPassword());
		
		System.out.println("checkLogin...........");
		ModelAndView mv = new ModelAndView();
		
		if (loginService.checkLogin(user)) {
			mv.setViewName("dashboard");
		} else {
			mv.addObject("msg", "your passwd is wrong..");
			mv.setViewName("login");
		}

		return mv;
	}

	@RequestMapping(value = "/loginpage")
	public String openLoginPage() {
		System.out.println("openLoginPage..........");
		return "login";
	}
	@RequestMapping(value = "/logoutPage")
	public String openLogOutPage() {
		System.out.println("openLoginPage..........");
		return "logout";
	}

}
