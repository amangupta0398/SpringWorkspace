package com.psl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//http://localhost:8080/SpringMVC/
//http://localhost:8080/SpringMVC/home
//http://localhost:8080/SpringMVC/login

@Controller
public class EmployeeController {

	@RequestMapping(value={"/home","/login"})
	public String showHomePage(Model m){
		m.addAttribute("hello","Hello welcome to SpringMVC!!!!!!");
		return "home";                  //view name
	}
	
	
	@RequestMapping(value="/{empName}")
	public ModelAndView showEmpHome(Model m,@PathVariable String empName) {
		// TODO Auto-generated method stub
		//controller---->service---->DAOImp----->Db
		Employee e=new Employee();
		m.addAttribute("name", empName);
		return new ModelAndView("emp", "employee", "e")  ;              //view name
	}
}
