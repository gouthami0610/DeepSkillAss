package org.example.service;

import org.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void bookService() {
        // Implementation of the book service
        System.out.println("BookService is working.");
    }
}
