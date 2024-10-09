package com.nt.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nt.entity.Employee;

public class EmpRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		int id=rs.getInt("Id");
		String name=rs.getString("name");
		int sal=rs.getInt("salary");
		String password=rs.getString("password");
		String emailId=rs.getString("emailId");
		return new Employee(id, name, sal, password, emailId);
	}

}
