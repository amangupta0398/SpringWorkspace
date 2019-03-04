package com.psl.bean;

public class Employee {

	private int employeeId;
	private String employeeName;

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

    public void	myMethodABC(){
    	System.out.println("myMethodABC");
    }
    
    public void	myMethodXYZ(){
    	System.out.println("myMethodXYZ");
    }

}
