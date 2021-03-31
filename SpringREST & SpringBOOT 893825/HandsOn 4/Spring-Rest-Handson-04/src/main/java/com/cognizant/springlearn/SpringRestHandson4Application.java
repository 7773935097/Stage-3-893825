package com.cognizant.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.model.Country;

@SpringBootApplication
public class SpringRestHandson4Application {
	
	private static final Logger logger=LoggerFactory.getLogger("SpringRestHandson4Application.java");
	
	public static void displayCountry()
	{
		logger.info("Start");
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		Country country=context.getBean("in",Country.class);
		Country anotherCountry=context.getBean("us",Country.class);
		logger.debug("country :{}",country);
		logger.debug("anotheCountry : {}",anotherCountry);
		logger.info("End");
		
	}
	
	public static void displayCountries()
	
	{
		logger.info("Start");
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		List<Country> list=context.getBean("countryList",java.util.ArrayList.class);
		logger.debug("Country : {}", list);
		logger.info("END");
	}

	public static void displayDate() throws ParseException
	{
		logger.info("Start");
		ApplicationContext context=new ClassPathXmlApplicationContext("dateformat.xml");
		SimpleDateFormat format=context.getBean("dateFormat",SimpleDateFormat.class);
		Date date=format.parse("20/03/2021");
		logger.debug(date.toString());
		logger.info("End");
	}
	public static void main(String[] args) throws ParseException {
		SpringApplication.run(SpringRestHandson4Application.class, args);
		displayCountry();
		displayCountries();
		displayDate();
		
	}

}
