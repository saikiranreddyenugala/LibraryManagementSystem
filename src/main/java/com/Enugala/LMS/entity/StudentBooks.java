package com.Enugala.LMS.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentBooks")
public class StudentBooks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long ID;
	
	@Column(name = "studentID")
	private Long studentID;
	
	
	@Column(name="student_name")
     private String studentName;
	
	@Column(name="book_name")
     private String bookName;
	
	@Column(name="given_date")
    private String givenDate;
	
	@Column(name="return_date")
    private String returnDate;
	
     public StudentBooks() {
    	 
     }

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public Long getStudentID() {
		return studentID;
	}

	public void setStudentID(Long studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getGivenDate() {
		return givenDate;
	}

	public void setGivenDate(String givenDate) {
		this.givenDate = givenDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public StudentBooks(Long studentID, String studentName, String bookName, String givenDate, String returnDate) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.bookName = bookName;
		this.givenDate = givenDate;
		this.returnDate = returnDate;
	}

	

	
     
	
     
     
}
