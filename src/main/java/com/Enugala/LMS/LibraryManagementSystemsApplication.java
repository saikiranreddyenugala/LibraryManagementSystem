package com.Enugala.LMS;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Enugala.LMS.entity.Book;
import com.Enugala.LMS.entity.Student;
import com.Enugala.LMS.repository.BookRepository;
import com.Enugala.LMS.repository.StudentRepository;

@SpringBootApplication
public class LibraryManagementSystemsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementSystemsApplication.class, args);
		
		
	}
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
		
		}

}
