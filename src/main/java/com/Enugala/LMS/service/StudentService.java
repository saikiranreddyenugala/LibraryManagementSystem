package com.Enugala.LMS.service;

import java.util.List;




import com.Enugala.LMS.entity.Student;

public interface StudentService {
     
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	
	
	
}
