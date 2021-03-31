package com.cognizant.springlearn2.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Department {
	
	private String id;
	private String name;
	private String location;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Department.class);
	
	public Department() {
		LOGGER.debug("Inside department constructor");
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public static Logger getLogger() {
		return LOGGER;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

	
	
}
