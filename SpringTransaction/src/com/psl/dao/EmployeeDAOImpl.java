package com.psl.dao;

import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeDAOImpl implements IEmployeeDAO{

	JdbcTemplate templateJdbc;
	
	public void setTemplateJdbc(JdbcTemplate templateJdbc) {
		this.templateJdbc = templateJdbc;
	}
	public JdbcTemplate getTemplateJdbc() {
		return templateJdbc;
	}
	
	

	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly= false,rollbackFor=BadSqlGrammarException.class)
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		templateJdbc.update("delete from employee where id ="+id);
		System.out.println("delete employee suceess");
		addEmployeeToHistory(id);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void addEmployeeToHistory(int id) {
		// TODO Auto-generated method stub
		templateJdbc.update("insert into history values(101,'asif')");
		System.out.println("employee added to history table");
	}

}
