package com.madan.springboot.sampleapplication.sampleapp;

import java.util.Arrays;
import java.util.List;
import com.madan.springboot.sampleapplication.sampleapp.Book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
    
    @GetMapping("/books")
    public List<Book> retrieveAllBooks() {
        Book book = new Book(1l,"Madan History", "Madan");
        return Arrays.asList(book);
    }
}