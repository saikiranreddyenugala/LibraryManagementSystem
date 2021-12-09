package com.Enugala.LMS.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Enugala.LMS.entity.Book;
import com.Enugala.LMS.entity.Student;
import com.Enugala.LMS.entity.StudentBooks;
import com.Enugala.LMS.service.BookService;
import com.Enugala.LMS.service.StudentBookService;
import com.Enugala.LMS.service.StudentService;

@Controller
public class StudentController {
     private StudentService studentService;
     private StudentBookService studentBookService;

	public StudentController(StudentService roomService,StudentBookService studentBookService) {
		super();
		this.studentService = roomService;
		this.studentBookService = studentBookService;
	}
     
     //handler method to handle list books and return mode  and view
	@GetMapping("/students")
	public String listBooks(Model model) {
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
	}
	
	
	
	@GetMapping("/student/{id}")
	public String updateBook(@PathVariable Long id,Model model) {
		//get book from data base by  id
		Student existingStudent = studentService.getStudentById(id);
		System.out.println(existingStudent.getStudentName());
		System.out.println(existingStudent.getsID());
		List<StudentBooks> sbs= studentBookService.getAllStudentBooks();
		List<StudentBooks> l=new ArrayList<>();
		for(StudentBooks sb:sbs) {
			System.out.println(sb.getStudentID());
			if(sb.getStudentID().equals(existingStudent.getsID())) {
				System.out.println(sb.getBookName());
				l.add(sb);
			}
		}
		model.addAttribute("bookStudents",l);
		
		return "bookStudent";
	} 
	
	//handler method to handle delete book request

	
}
