package com.springbootdaofiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springbootbeanfiles.Bookjdbc12;

import java.util.List;

@Repository
public class Bookjdbcdaoimp12 implements bookjdbcdao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Bookjdbc12> getAllBooks() {
        String sql = "SELECT * FROM book1";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Bookjdbc12.class));
    }

    public Bookjdbc12 getBookById(int bookid) {
        String sql = "SELECT * FROM book1 WHERE bookid=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{bookid}, new BeanPropertyRowMapper<>(Bookjdbc12.class));
    }

    public int addBook(Bookjdbc12 book) {
        String sql = "INSERT INTO book1 (bookid, bookname, author, price) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, book.getBookid(), book.getBookname(), book.getAuthor(), book.getPrice());
    }

    public int updateBook(Bookjdbc12 book) {
        String sql = "UPDATE book1 SET bookname=?, author=?, price=? WHERE bookid=?";
        return jdbcTemplate.update(sql, book.getBookname(), book.getAuthor(), book.getPrice(), book.getBookid());
    }

    public int deleteBook(int bookid) {
        String sql = "DELETE FROM book1 WHERE bookid=?";
        return jdbcTemplate.update(sql, bookid);
    }
}
