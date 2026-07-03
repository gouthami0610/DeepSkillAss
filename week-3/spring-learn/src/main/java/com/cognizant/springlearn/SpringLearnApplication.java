package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringLearnApplication {

    //private static final Logger log = LoggerFactory.getLogger(SpringLearnApplication.class);

    //private static  final Logger LOGGER= LoggerFactory.getLogger(SpringLearnApplication.class);
    public static void main(String[] args)  throws ParseException{
        SpringApplication.run(SpringLearnApplication.class, args);
       // LOGGER.info("begin");
       // LOGGER.info("End");

        displayDate();

    }
    public static void displayDate() throws ParseException {
        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
       // BeanFactory context;
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
        Date date = new Date();
        System.out.println(date);
    }

}
