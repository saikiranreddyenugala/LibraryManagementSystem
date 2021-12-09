package com.Enugala.LMS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	@Column(name = "studentID")
     private Long studentID;
	
	@Column(name = "sID")
	private Long sID;
	
	
	@Column(name="student_name")
     private String studentName;
	
	@Column(name="numOfBooks")
     private int books;
	
     public Student() {
    	 
     }

	public Student(Long sID, String studentName, int books) {
		super();
		this.sID = sID;
		this.studentName = studentName;
		this.books = books;
	}

	public Long getStudentID() {
		return studentID;
	}

	public void setStudentID(Long studentID) {
		this.studentID = studentID;
	}

	public Long getsID() {
		return sID;
	}

	public void setsID(Long sID) {
		this.sID = sID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getBooks() {
		return books;
	}

	public void setBooks(int books) {
		this.books = books;
	}
     
     

	
     
	
     
     
}
