package com.glearning.pg.model;

public class Employee {

	private final String firstName;
	private final String lastName;
	private String emailAddress; 
	private String password;
	private String dept;
	
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return emailAddress;
	}

	public String getDept() {
		return dept;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void setdept(String dept) {
		this.dept = dept;
	}
}
