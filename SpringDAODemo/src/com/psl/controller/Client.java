package com.psl.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Employee;
import com.psl.service.EmployeeService;



public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
	
		//Employee e=(Employee)context.getBean("emp");
	Employee e=	context.getBean("emp", Employee.class);     //another way of getting bean
	
	
	//client--->service--->IEmpDAO---->EmployeeDAOImpl----->template----->DB
	
	EmployeeService service=context.getBean("service", EmployeeService.class);
	service.createEmployee(e);
	
	service.getEmployee();
	}
}
