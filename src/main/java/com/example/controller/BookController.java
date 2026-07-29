package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Book;

@RestController
public class BookController {
    List<Book> list = new ArrayList<>();

    public BookController() {
        list.add(new Book(1, "John"));
        list.add(new Book(2, "Shraddha"));
        list.add(new Book(3, "Vedu"));
        list.add(new Book(4, "Aarya"));
    }

    @GetMapping("/book")
    public List<Book> show(){
        return list;
    }


    @PostMapping("/bookupdate")
    public Book add(@RequestBody Book book){
        list.add(book);
        return book;
    }
    
}
