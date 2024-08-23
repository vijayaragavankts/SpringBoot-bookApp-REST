package com.book.bookApp.book;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(path = "book")
public class BookController {

    List<Book> books = new ArrayList<>();

    @GetMapping()
    public String displayBookHome(){
        return "Book route is Working";
    }
    @GetMapping("/all")
    public List<Book> displayBooks(){
        return books;
    }

    @GetMapping("/getBook/{id}")
    public Book getSingleBook(@PathVariable Long id){
        for(Book book:books){
            if(Objects.equals(book.bid,id)){
                return book;
            }
        }
        return new Book();
    }

    @PutMapping("/update/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book bookData){
        Book updatedBook = bookData;
        for(int i=0;i<books.size();i++){
            if(Objects.equals(books.get(i).bid,id)){
                updatedBook.bid = id;
                books.set(i,updatedBook);
            }
        }
        return updatedBook;
    }

    @PostMapping("/add")
    public Book addBook(@RequestBody Book bookData){
        Book newBook = new Book(bookData.name,bookData.author,bookData.quantity,bookData.releaseYear);
        books.add(newBook);
        return newBook;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id){
        for(int i=0;i<books.size();i++){
            if(Objects.equals(books.get(i).bid,id)){
                books.remove(i);
                return "Removed Successfully";
            }
        }
        return "Something went wrong ! Not Deleted";
    }
}
