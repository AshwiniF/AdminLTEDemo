package com.javabykiran.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.service.DeleteUserService;
import com.javabykiran.service.UserService;
import com.jbk.hibernate.Addnewuser;

@Controller
public class DeleteUserController {
	
	@Autowired
	DeleteUserService deleleUserService;
	
	@Autowired
	UserService userservice;
	
	
	
	@RequestMapping("/deleteData")
	public ModelAndView doDelete(@RequestParam int id) {
		System.out.println(id);
		ModelAndView mv= new ModelAndView();
		deleleUserService.deleteData(id);
		
		ArrayList<Addnewuser> list=userservice.loadUsers();
		mv.addObject("userlist", list);
		mv.setViewName("users");
		return mv;
		
	}
	@RequestMapping("/multipleDelete")
	public ModelAndView doMultiDelete(@RequestParam(value = "id[]", required = false) int[] id ) {
		
		ModelAndView mv= new ModelAndView();
		if(id!=null) {
			System.out.println("checkbox is checked " +id.length);
		}
		
		System.out.println("controller");
		deleleUserService.deleteMultiData(id);
		
		ArrayList<Addnewuser> list=userservice.loadUsers();
		mv.addObject("userlist", list);
		mv.setViewName("users");
		return mv;
		
	}
	
	}

