package com.cognizant.springlearn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

	public Country getCountryIndia() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("country",Country.class);
		return country;
	}
	
	public List<Country> getAllCountries(){
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		List countryList = context.getBean("countryList", ArrayList.class);
		return countryList;
	}
	
	public Country getCountry(String code) throws CountryNotFoundException {
		List<Country> countryList = getAllCountries();
		int k=0;
		for (Country c : countryList) {
			if (c.getCode().equalsIgnoreCase(code)) {
				return c;
			}
		}
		k+=1;
		if(k>0) throw new CountryNotFoundException();
		return new Country();
	}
	
}
