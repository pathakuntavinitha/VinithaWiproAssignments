package com.springdaoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootbeanfiles.Bookjdbc12;
import com.springbootdaofiles.bookjdbcdao;

import java.util.List;

@Service
public class Bookjdbcservice12 {

    @Autowired
    private bookjdbcdao dao;

    public List<Bookjdbc12> getAll() {
        return dao.getAllBooks();
    }

    public Bookjdbc12 getById(int id) {
        return dao.getBookById(id);
    }

    public void save(Bookjdbc12 book) {
        dao.addBook(book);
    }

    public void update(Bookjdbc12 book) {
        dao.updateBook(book);
    }

    public void delete(int id) {
        dao.deleteBook(id);
    }
}
