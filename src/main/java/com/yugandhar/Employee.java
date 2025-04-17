package com.yugandhar;

public class Employee {
	
	private String id;
	private String name;
	private String department;
	public Employee(String id, String name, String department, String address, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.address = address;
		this.age = age;
	}
	private String address;
	private Integer age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	

}
