package com.example.thymleaf.model.bookform;


public class bookCreated {
    private String title;
    private String author;
    public bookCreated(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public bookCreated() {
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    
}