package com.psl.dao;

import java.util.List;

import com.psl.bean.Employee;

public interface IEmployeeDAO {

	public void createEmployee();
	public void insertEmployee(Employee e);
	public List<Employee> getEmployees();
	public void updateEmployee(Employee e);
	public void deleteEmployee(int id);
	
}
