package com.example.Bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Bookstore.model.Book;
import com.example.Bookstore.repository.BookStoreRepository;
import java.util.*;

@Controller
public class BookController {

	@Autowired
	private BookStoreRepository bookRepository;
	List<Book> booksList = new ArrayList<>();

	@GetMapping("/booklist")
	public String getIndex(Model model) {
		//booksList = (List<Book>) bookRepository.findAll();
		//model.addAttribute("books", booksList);
		model.addAttribute("books", bookRepository.findAll());
		return "booklist";
	}

	@GetMapping("/addbook")
	public String getBook(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "addbook";
	}

	@PostMapping("/save")
	public String saveBook(@ModelAttribute("book") Book book, Model model) {

		bookRepository.save(book);
		return "redirect:/booklist";

	}

	@GetMapping("/edit")
	public String editBook(@RequestParam("bookid") Long bookid, Model model) {
		Book book = bookRepository.getById(bookid);
		model.addAttribute("book", book);
		return "updatebook";
	}

	@GetMapping("/delete")
	public String deleteBook(@RequestParam("bookid") Long id) {

		bookRepository.deleteById(id);
		return "redirect:/booklist";

	}

}
