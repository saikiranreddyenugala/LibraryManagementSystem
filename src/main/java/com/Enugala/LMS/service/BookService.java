package com.Enugala.LMS.service;

import java.util.List;


import com.Enugala.LMS.entity.Book;

public interface BookService {
     
	List<Book> getAllBooks();
	
	Book saveBook(Book book);
	
	Book getBookById(Long id);
	Book updateBook(Book book);
	
	void deleteStudentById(Long id);
	
}
