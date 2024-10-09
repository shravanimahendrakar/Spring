package com.nt.entity;

public class Employee {

	private int id;
	private String name;
	private int sal;
	private String password;
	private String emailId;
	
	public Employee() {
		
	}
		
	public Employee(int id, String name, int sal, String password,String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.password = password;
		this.emailId = emailId;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
