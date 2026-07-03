package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.Service.CountryService;
import com.cognizant.springlearn.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

private final CountryService countyService;

    public CountryController(CountryService countryService) {
        this.countyService = countryService;
    }
@RequestMapping("/country")
    public Country getCountryIndia() {

        LOGGER.info("START");
    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        LOGGER.info("END");
        return country;
    }
    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) {
        LOGGER.info("START");
        //ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        //Country country = context.getBean("country", Country.class);
        Country country = countyService.getCountry(code);
        LOGGER.info("END");
        return country;
    }

    //create end point to authentication --create






}
