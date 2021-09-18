package com.example.Bookstore.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity

public class Book {
	@Id
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="book_sequence")	
	private Long id;
	@Column(name="title",
			nullable=false,
			columnDefinition="TEXT")
	private String title;
	@Column(name="author",
			nullable=false,
			columnDefinition="TEXT")
	private String author;
	@Column(name="year",
			nullable=false,
			columnDefinition="TEXT")
	private String year;
	@Column(name="isbn",
			nullable=false,
			columnDefinition="TEXT")
	private String isbn;
	

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Book(Long id, String title, String author, String year, String isbn) {
		super();
		this.id = id;
		
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
	}


	public Book(String title, String author, String year, String isbn) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ","
				+ " year=" + year + ", isbn=" + isbn + "]";
	}

	

}
