package com.springboot.demo.libraryManagement.controller;

import org.springframework.web.bind.annotation.*;

import com.springboot.demo.libraryManagement.entities.Author;
import com.springboot.demo.libraryManagement.entities.Book;
import com.springboot.demo.libraryManagement.service.LibraryService;

import java.util.List;

@RestController
@RequestMapping("/api/library")
public class LibraryController {

    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return libraryService.getAllBooks();
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return libraryService.addBook(book);
    }

    @GetMapping("/authors")
    public List<Author> getAllAuthors() {
        return libraryService.getAllAuthors();
    }

    @PostMapping("/authors")
    public Author addAuthor(@RequestBody Author author) {
        return libraryService.addAuthor(author);
    }
}
