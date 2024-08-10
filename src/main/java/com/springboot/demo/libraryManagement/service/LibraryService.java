package com.springboot.demo.libraryManagement.service;

import org.springframework.stereotype.Service;

import com.springboot.demo.libraryManagement.entities.Author;
import com.springboot.demo.libraryManagement.entities.Book;
import com.springboot.demo.libraryManagement.repository.AuthorRepository;
import com.springboot.demo.libraryManagement.repository.BookRepository;

import java.util.List;

@Service
public class LibraryService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public LibraryService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }
}