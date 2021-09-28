package com.example.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Bookstore.model.Book;
import com.example.Bookstore.model.Category;
import com.example.Bookstore.repository.BookStoreRepository;
import com.example.Bookstore.repository.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(BookStoreRepository bookRepository, CategoryRepository categoryRepo) {
		return args -> {

			Category cat1 = new Category("Drama");
			categoryRepo.save(cat1);
			Category cat2 = new Category("Thriller");
			categoryRepo.save(cat2);
			Category cat3 = new Category("Romance");
			categoryRepo.save(cat3);

			Book book1 = new Book("War and Peace", "Leo Tolstoy", "1895", "ISO89564777", cat1);
			bookRepository.save(book1);
			Book book2 = new Book("The count of Monte Cristo", "Alexander Dumas", "1844", "ISO89564777", cat3);
			bookRepository.save(book2);
			Book book3 = new Book("Rebecca", "Daphne du Maurier", "1938", "ISO89564777", cat2);
			bookRepository.save(book3);

		};
	}
}