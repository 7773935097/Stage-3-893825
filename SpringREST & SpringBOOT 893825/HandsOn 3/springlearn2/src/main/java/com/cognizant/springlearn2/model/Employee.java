package com.cognizant.springlearn2.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Employee {
	
	private String id;
	private String name;
	private Department department;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Employee.class);
	
	public Employee() {
		LOGGER.debug("Inside employee constructor");
	}

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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public static Logger getLogger() {
		return LOGGER;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

	
}
