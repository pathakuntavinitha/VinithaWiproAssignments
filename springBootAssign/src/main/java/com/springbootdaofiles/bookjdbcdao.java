package com.springbootdaofiles;

import java.util.List;

import com.springbootbeanfiles.Bookjdbc12;

public interface bookjdbcdao {
    List<Bookjdbc12> getAllBooks();
    Bookjdbc12 getBookById(int id);
    int addBook(Bookjdbc12 book);
    int updateBook(Bookjdbc12 book);
    int deleteBook(int id);
}
