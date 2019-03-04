package com.psl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.psl.bean.Employee;
import com.psl.dao.IEmployeeDAO;

//@Component(value="service")
@Service("service")
public class EmployeeService {
	
	@Autowired
	IEmployeeDAO dao;
	
	public void setDao(IEmployeeDAO dao) {
		this.dao = dao;
	}
	public IEmployeeDAO getDao() {
		return dao;
	}

	public void createEmployee(Employee e) {

		dao.createEmployee();
		dao.insertEmployee(e);
	}

	public void updateEmployee() {

	}

	public void getEmployee() {

	List<Employee> l=	dao.getEmployees();
	System.out.println(l);
	}

}
