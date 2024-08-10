package com.springboot.demo.libraryManagement.data;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.demo.libraryManagement.entities.Author;
import com.springboot.demo.libraryManagement.entities.Book;
import com.springboot.demo.libraryManagement.service.LibraryService;

@Configuration
public class DataInitializer {

    @Bean
    ApplicationRunner init(LibraryService libraryService) {
        return args -> {
            Author author = new Author();
            author.setName("J.K. Rowling");
            libraryService.addAuthor(author);
            
            Book book1 = new Book();
            book1.setTitle("Harry Potter and the Sorcerer's Stone");
            book1.setAuthor(author);
            libraryService.addBook(book1);
            
            Book book2 = new Book();
            book2.setTitle("Harry Potter and the Chamber of Secrets");
            book2.setAuthor(author);
            libraryService.addBook(book2);
        };
    }
}
