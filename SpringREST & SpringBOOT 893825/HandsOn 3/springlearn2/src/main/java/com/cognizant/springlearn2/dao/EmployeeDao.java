package com.cognizant.springlearn2.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn2.model.Employee;

@Repository
public class EmployeeDao {

	private static List<Employee> EMPLOYEE_LIST = new ArrayList<>();
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDao.class);
	
	public EmployeeDao() {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		EMPLOYEE_LIST = context.getBean("employeeList", ArrayList.class);
		
	}
	
	public List<Employee> getAllEmployees(){
		LOGGER.info("START");
		LOGGER.debug("Employees List " +EMPLOYEE_LIST);
		LOGGER.info("END");
		return EMPLOYEE_LIST;
	}
	
}
