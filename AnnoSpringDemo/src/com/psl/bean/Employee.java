package com.psl.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component (value="emp")            //used to instantiate as you register pojo in config.xml
public class Employee {

	@Value(value="999")
	private int employeeId;
	@Value(value="Aman")
	private String employeeName;
@Autowired

	 private Address addr;

	public Employee() {
		super();
		System.out.println("employee constructor");
	}

	public Employee(int employeeId, String employeeName,Address addr) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.addr=addr;
		
		
		
		
		
		System.out.println("employee param-contructor");
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Address getAddr() {
		return addr;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", addr=" + addr + "]";
	}

	@PostConstruct
    public void	myMethodABC(){
    	System.out.println("myMethodABC");
    }
    
	@PreDestroy
    public void	myMethodXYZ(){
    	System.out.println("myMethodXYZ");
    }

}
