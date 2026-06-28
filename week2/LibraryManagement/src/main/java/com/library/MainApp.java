package com.library;

import com.library.service.BookService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static <ApplicationContext> void main(String[] args){
        org.springframework.context.ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BeanFactory con;
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.displayBook();
    }
}
//ApplicationContext context =
//        new ClassPathXmlApplicationContext("applicationContext.xml");
//
//BookService bookService =
//        context.getBean("bookService", BookService.class);
//
//        bookService.showBooks();