package com.example.Bookstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Bookstore.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}