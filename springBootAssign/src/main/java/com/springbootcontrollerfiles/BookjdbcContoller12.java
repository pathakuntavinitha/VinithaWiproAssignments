package com.springbootcontrollerfiles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootbeanfiles.Bookjdbc12;
import com.springbootdaofiles.bookjdbcdao;
import com.springdaoservice.Bookjdbcservice12;

@RestController
@RequestMapping("/api/books")
public class BookjdbcContoller12 {


    @Autowired
    private bookjdbcdao service;

    @GetMapping
    public List<Bookjdbc12> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Object getBookById(@PathVariable int id) {
        try {
            return service.getBookById(id);
        } catch (Exception e) {
            return new ErrorMessage("Book with id " + id + " not found");
        }
    }

    @PostMapping
    public String addBook(@RequestBody Bookjdbc12 book) {
        service.addBook(book);
        return "Book added successfully";
    }

    @PutMapping("/{id}")
    public String updateBook(@PathVariable int id, @RequestBody Bookjdbc12 book) {
        book.setBookid(id);
        service.updateBook(book);
        return "Book updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        service.deleteBook(id);
        return "Book deleted successfully";
    }

    static class ErrorMessage {
        private String errorMessage;

        public ErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public String getErrorMessage() {
            return errorMessage;
        }
    }
}
