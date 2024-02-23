package com.example.demo.service;

import com.example.demo.domain.Book;
import com.example.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;
    @Transactional
    public Book create(Book book){
        return bookRepository.save(book);
    }

    @Transactional
    public List<Book> findAll(){
        return bookRepository.findAll();
    }
    //Dependency Injection: DI is a design pattern used in SE
    //To achieve inversion of control between classes and their dependencies
    //Goal: allows for decoupling components by making them independent
    //of the concrete implementation of classes that they rely on.




//    @Autowired //tells springboot to inject instance of bookrepostiory into bookservice
//
//    public BookService(BookRepository bookRepository){
//        this.bookRepository = bookRepository;

    } //In this example, bookservice depends on bookreposity to access
    //manipulate the book object data



    // Insert a book into our h2-database

//}
