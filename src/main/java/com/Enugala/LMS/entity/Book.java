package com.Enugala.LMS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
     private Long id;
	
	@Column(name="book_name",nullable=false)
     private String bookName;
	
	@Column(name="author_name")
     private String authorName;
	
	@Column(name="genere")
     private String genere;
     
     public Book() {
    	 
     }
     public Book(String bookName, String authorName, String genere) {
 		super();
 		this.bookName = bookName;
 		this.authorName = authorName;
 		this.genere = genere;
 	}
     
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
     
     
}
