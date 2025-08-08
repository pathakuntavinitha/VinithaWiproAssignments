package com.springbootbeanfiles;
public class BookBean9 {
    
    private int bookId;
    private String name;
    private String writer;
    // Constructors
    public BookBean9() {}
    public BookBean9(int bookId, String name, String writer) {
        this.bookId = bookId;
        this.name = name;
        this.writer = writer;
    }

    // Getters and Setters
    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getWriter() { return writer; }
    public void setWriter(String writer) { this.writer = writer; }

}
