package com.springboot.demo.libraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.libraryManagement.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
