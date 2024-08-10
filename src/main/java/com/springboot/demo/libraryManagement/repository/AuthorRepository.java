package com.springboot.demo.libraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.libraryManagement.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
