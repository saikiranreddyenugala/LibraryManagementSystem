package com.Enugala.LMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Enugala.LMS.entity.Book;
import com.Enugala.LMS.service.BookService;

@Controller
public class BookController {
     private BookService bookService;

	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
     
     //handler method to handle list books and return mode  and view
	@GetMapping("/books")
	public String listBooks(Model model) {
		model.addAttribute("books",bookService.getAllBooks());
		return "books";
	}
	
	@GetMapping("/books/new")
	public String createBookForm(Model model) {
		//create book object to hold book form data
		Book book = new Book();
		model.addAttribute("book", book);
		return "create_book";
	}
	
	@PostMapping("/books")
	public String saveBook(@ModelAttribute("book") Book book) {
		bookService.saveBook(book);
		return "redirect:/books";
	}
	
	@GetMapping("/books/edit/{id}")
	public String editBookForm(@PathVariable Long id, Model model) {
		model.addAttribute("book",bookService.getBookById(id));
		return "edit_book"; 
	}
	
	@PostMapping("/books/{id}")
	public String updateBook(@PathVariable Long id,
			@ModelAttribute("book") Book book, 
			Model model) {
		//get book from data base by  id
		Book existingBook = bookService.getBookById(id);
		existingBook.setId(id); 
		existingBook.setBookName(book.getBookName());
		existingBook.setAuthorName(book.getAuthorName());
		existingBook.setGenere(book.getGenere());
		
		//save updated book obj
		bookService.updateBook(existingBook);
		return "redirect:/books";
	} 
	
	//handler method to handle delete book request
	
	@GetMapping("/books/{id}")
	public String deleteBook(@PathVariable Long id) {
		bookService.deleteStudentById(id);
		return "redirect:/books";
	}
}
