package com.example.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Bookstore.model.Book;
import com.example.Bookstore.repository.BookStoreRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	    CommandLineRunner commandLineRunner(
	            BookStoreRepository bookRepository) { 
		 return args -> {
	 
	           Book book1= new Book("War and Peace","Leo Tolstoy","1895","ISO89564777");
	           bookRepository.save(book1);
	           Book book2= new Book("The count of Monte Cristo","Alexander Dumas","1844","ISO89564777");
	           bookRepository.save(book2);
	           Book book3= new Book("Rebecca","Daphne du Maurier","1938","ISO89564777");
	           bookRepository.save(book3);  
		 };
}
}