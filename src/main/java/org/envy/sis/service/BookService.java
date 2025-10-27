package org.envy.sis.service;

import org.envy.sis.model.Book;
import org.envy.sis.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepo repo;

    public List<Book> getallBooks() {
        return repo.findAll();
    }
    public Book findOne(int id) {
        return repo.findById(id).orElse(null);
    }
    public Book save(Book book) {
        return repo.save(book);
    }

    public void delete(Book book) {
        repo.delete(book);
    }
}
