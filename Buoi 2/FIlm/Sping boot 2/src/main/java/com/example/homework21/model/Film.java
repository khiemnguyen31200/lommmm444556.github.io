package com.example.homework21.model;

public class Film {
    private String title;
    private String author;
    private  String year;
    public Film(String title, String author ,String year) {
        this.title = title;
        this.author = author;
        this.year = year;
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
    public String getyear() {
        return year;
    }
    public void setyear(String year ) {
        this.year = year;
    }
}
