package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.psl.service.EmployeeService;

public class Client {

	public static void main(String[] args) {
		
	
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	EmployeeService service=context.getBean( "service",EmployeeService.class);
	service.employeeLDAP(104);
	System.out.println("Done");
	}
}
