package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.psl.bean.Employee;

//@Component(value="dao")
@Repository("dao")     //----->more specific
public class EmployeeDAOImpl implements IEmployeeDAO {

	@Autowired
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public void createEmployee() {
//		// TODO Auto-generated method stub
//		template.execute("create table employee (id int,name varchar(20), email varchar(20))");
	}

	@Override
	public void insertEmployee(Employee e) {
		// TODO Auto-generated method stub
		int id = e.getEmployeeId();
		String name = e.getEmployeeName();
		String email = e.getEmployeeEmail();
		String query="insert into employee values("+id+",'"+name+"','"+email+"')";
		template.execute(query);
	

	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
	List<Employee> list=	template.query("select * from employee", new RowMapper<Employee>() {

		@Override
		public Employee mapRow(ResultSet rs, int i) throws SQLException {
			// TODO Auto-generated method stub
			Employee e=new Employee();
			e.setEmployeeId(rs.getInt(1));
			e.setEmployeeName(rs.getString(2));
			e.setEmployeeEmail(rs.getString(3));
			System.out.println("inside MapRow" + e);
			return e;
		}
		
	});
		return list;
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub

	}

}
