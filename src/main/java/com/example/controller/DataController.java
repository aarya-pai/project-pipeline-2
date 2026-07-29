package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.model.Book;

import java.util.List;
import java.util.ArrayList;

@RestController
public class DataController {
    List<Book> list = new ArrayList<>();
    
    public DataController() {
        list.add(new Book(1, "Data 1"));
        list.add(new Book(2, "Data 2"));
        list.add(new Book(3, "Data 3"));
        list.add(new Book(4, "Data 4"));
    }
    
    @GetMapping("/show")
    public List<Book> show(){
        return list;
    }

    @PostMapping("/add")
    public void add(@RequestBody Book book){
        list.add(book);
    }

    @PutMapping("/update")
    public void update(@RequestBody Book book){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getId() == book.getId()){
                list.set(i, book);
                return;
            }
        }
    }
}