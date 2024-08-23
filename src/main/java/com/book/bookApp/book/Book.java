package com.book.bookApp.book;

import java.util.Random;

public class Book {

    Random random = new Random();
    public String name;
    public Long bid;
    public String author;
    public Integer quantity;
    public Integer releaseYear;

    public Book() {

    }

    public Book(String name, String author, Integer quantity, Integer releaseYear) {
        this.name = name;
        this.bid = random.nextLong(1234567890,Long.MAX_VALUE);
        this.author = author;
        this.quantity = quantity;
        this.releaseYear = releaseYear;
    }
}
