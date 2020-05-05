package com.javabykiran.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.service.AddUserService;
import com.javabykiran.service.EditUserService;
import com.javabykiran.service.UserService;
import com.jbk.hibernate.Addnewuser;
import com.jbk.hibernate.Statemaster;


@Controller
public class UserEditController {
	
	@Autowired
	EditUserService editUser;
	
	@Autowired
	UserService userservice;
	
	@Autowired
	AddUserService addUserService;
	
	@RequestMapping("/editData")
	public ModelAndView doEdit(@RequestParam("id") int id) {
		ModelAndView mv= new ModelAndView();
		System.out.println("i am edit controller >> "+ id);
		List<Addnewuser> user= editUser.editdata(id);
		ArrayList<Statemaster> listOfState= addUserService.loadState();
		mv.addObject("stateList",listOfState);
		 mv.setViewName("updated");
		 mv.addObject("user", user);
		return mv;
	}

	
@RequestMapping("/updateData")
public ModelAndView update(@ModelAttribute Addnewuser user) {
	ModelAndView mv= new ModelAndView();
	System.out.println("i am edit controller >> "+ user);
	boolean check= editUser.updateUser(user);
	if(check)
	{
		ArrayList<Addnewuser> list=userservice.loadUsers();
		System.out.println("updated");
		mv.setViewName("users");
		mv.addObject("userlist", list);
	}
	else
	{
		ArrayList<Statemaster> listOfState= addUserService.loadState();
		mv.addObject("stateList",listOfState);
		mv.setViewName("updated");
		mv.addObject("user", "not updated");
	}
	 return mv;
}
}


