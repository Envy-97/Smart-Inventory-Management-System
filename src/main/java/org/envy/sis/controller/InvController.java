package org.envy.sis.controller;

import org.envy.sis.model.Book;
import org.envy.sis.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class InvController {

    @Autowired
    private BookService service;

    //Read
    @GetMapping("/allBooks")
    public List<Book> findAll(){
        return service.getallBooks();
    }
    //Create
    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book){
        service.save(book);
        return ("Book Saved Successfully");
    }
    //update
    @PutMapping("/updateBook")
    public String updateBook(@RequestBody Book book){
        service.save(book);
        return ("Book Updated Successfully");
    }
    //delate
    @DeleteMapping("/deleteBook")
    public String deleteBook(@RequestBody Book book){
        service.delete(book);
        return ("Book Deleted Successfully");
    }
    @GetMapping("/findbyid/{id}")
    public Book findBookById(@PathVariable int id){
        return service.findOne(id);
    }

}
