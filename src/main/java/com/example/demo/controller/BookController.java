package com.example.demo.controller;

import com.example.demo.domain.Book;
import com.example.demo.service.BookService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequiredArgsConstructor
@RestController
public class BookController {

    private final BookService bookService;
    @GetMapping("/hello")

    public String HelloWorld(){
        return "Hello World!";
    }

    @GetMapping("/clock")
    public Date clock(){
        Date date = new Date();
        return date;
    }

    //Restful API: returns the status code EX: 200 means ok,  404 means error. 505 means server down
    // HTTP methods: get, post, put.

    @PostMapping("/book")
    public ResponseEntity<?> save(@RequestBody Book book){
        return new ResponseEntity<>(bookService.create(book), HttpStatus.CREATED);
    }
    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(bookService.findAll(),HttpStatus.OK);
    }
}
