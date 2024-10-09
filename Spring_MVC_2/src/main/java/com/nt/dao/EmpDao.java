package com.nt.dao;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.entity.Employee;
import com.nt.rowMapper.EmpRowMapper;

@Repository
public class EmpDao {

	@Autowired
	private JdbcTemplate template;

	public void register(Employee e) {
		Object[] args = { e.getId(), e.getName(), e.getSal(), e.getPassword(), e.getEmailId() };
		template.update("insert into emp values(?,?,?,?,?)", args);
	}

	public Employee isValidUser(String emailId) {
		Object[] args = { emailId };

		try {
			return (Employee) template.queryForObject("Select * from emp where emailId = ?", args, new EmpRowMapper());

		} catch (Exception e) {
			System.out.println("Invalid user");
			e.printStackTrace();
			return null;
		}

	}

	public List<Employee> getAllUser() {

		try {
			return template.query("SELECT * FROM emp", new EmpRowMapper());
		} catch (Exception e) {
			System.out.println("No record found");
			e.printStackTrace();
			return Collections.emptyList();
		}
	}
}
