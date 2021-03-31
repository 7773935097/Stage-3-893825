package com.cognizant.springlearn;



import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.springlearn.controller.CountryController;
import com.cognizant.springlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@SpringBootTest
class SpringLearnApplicationTests {
	
	@Autowired
	private CountryController countryController;
	@Autowired
	private CountryService service;
	
	
//	Testing whether the countryController is loaded or not
	@Test
	void contextLoads() {
		assertNotNull(countryController);
	}
	
//	Invoke the service to get country and 
//	check in the response if it contains code as "IN" and name as "India"+
	@Test
	void test2_forGetCountryMethod() throws CountryNotFoundException {
		assertTrue(service.getCountry("IN").getName().equalsIgnoreCase("india"));
	}
	@Test
	void test3_forGetCountryIndiaMethod() throws CountryNotFoundException {
		assertTrue(service.getCountryIndia().getName().equalsIgnoreCase("india")
				&& service.getCountryIndia().getCode().equalsIgnoreCase("in"));
	}
	
}
