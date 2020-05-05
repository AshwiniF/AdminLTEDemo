package com.javabykiran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.service.OperatorService;
import com.jbk.hibernate.Operator;

@Controller
public class OperatorController {
	
	@Autowired
	OperatorService operatorService;
	
	@RequestMapping("/operatorslink")
	public ModelAndView openOperatorPage(@ModelAttribute Operator operator) {
		ModelAndView mv= new ModelAndView();
		System.out.println("I am in controller");
		List<Operator> list=operatorService.loadOperator();
		System.out.println(list);
		mv.addObject("listOfOperator", list);
		mv.setViewName("operators");
		return mv;
		
	}

}
