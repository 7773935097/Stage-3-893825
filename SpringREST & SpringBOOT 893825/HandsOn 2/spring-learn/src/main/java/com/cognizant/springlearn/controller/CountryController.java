package com.cognizant.springlearn.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;
@RestController
public class CountryController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class); 
	@Autowired
	private CountryService service;
	
	@RequestMapping("/country")
	public Country getCountryIndia() {
		LOGGER.info("START");
		Country country = service.getCountryIndia();
		LOGGER.info("END");
		return country;
	}

	@GetMapping("/countries")
	public List<Country> getAllCountries(){
		LOGGER.info("START");
		List<Country> list = service.getAllCountries();
		LOGGER.info("END");
		return list;
	}
	
	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable("code") String code) throws CountryNotFoundException {
		LOGGER.info("START");
		Country country = service.getCountry(code);
		LOGGER.info("END");
		return country;
	}
}
