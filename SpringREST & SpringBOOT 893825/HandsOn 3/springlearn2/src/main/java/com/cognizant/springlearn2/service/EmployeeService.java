package com.cognizant.springlearn2.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn2.dao.EmployeeDao;
import com.cognizant.springlearn2.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao; 
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
	
	
	public List<Employee> getAllEmployees(){
		LOGGER.info("START");
		LOGGER.info("END");
		return employeeDao.getAllEmployees();
	}

}
