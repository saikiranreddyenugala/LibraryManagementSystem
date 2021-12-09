package com.Enugala.LMS.service.impl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.Enugala.LMS.entity.Book;
import com.Enugala.LMS.entity.StudentBooks;
import com.Enugala.LMS.repository.BookRepository;
import com.Enugala.LMS.repository.StudentBookRepository;
import com.Enugala.LMS.service.BookService;
import com.Enugala.LMS.service.StudentBookService;

@Service
public class StudentBookServiceImpl implements StudentBookService {
	
	private StudentBookRepository studentBookRepository;
	
	

	public StudentBookServiceImpl(StudentBookRepository studentBookRepository) {
		super();
		this.studentBookRepository = studentBookRepository;
	}

	@Override
	public List<StudentBooks> getAllStudentBooks() {
		// TODO Auto-generated method stub
		return studentBookRepository.findAll();
	}



	
}
