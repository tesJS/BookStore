package com.example.Bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Bookstore.model.Book;

@Repository
public interface BookStoreRepository extends CrudRepository<Book,Long> {

}
