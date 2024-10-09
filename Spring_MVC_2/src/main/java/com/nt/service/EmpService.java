package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmpDao;
import com.nt.entity.Employee;

@Service
public class EmpService {

	@Autowired
	private EmpDao dao;
	
	public void register(Employee e) {
		dao.register(e);
	}

	public Employee isValidUser(String emailId) {
		return dao.isValidUser(emailId);
		
	}

	public List<Employee> getAllUser() {
		return dao.getAllUser();
	}
}
