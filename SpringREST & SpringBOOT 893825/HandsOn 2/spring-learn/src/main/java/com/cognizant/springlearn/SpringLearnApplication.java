package com.cognizant.springlearn;

import java.text.ParseException;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(SpringLearnApplication.class, args);
		displayCountry();
		displayCountries();
	}
	
	public static void  displayCountry() {
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml"); 
		Country country = context.getBean("country", Country.class); 
		Country anotherCountry = context.getBean("country", Country.class);
		LOGGER.debug("Country: "+ country);
		LOGGER.info("END"); 
	}
	public static void displayCountries() {
		
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");		
		ArrayList<Country> countryList= context.getBean("countryList",ArrayList.class);
		LOGGER.debug("CountryList: "+ countryList);
		LOGGER.info("END");
		
	}

}
