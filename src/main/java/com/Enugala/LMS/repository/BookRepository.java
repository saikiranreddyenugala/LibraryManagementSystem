package com.Enugala.LMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Enugala.LMS.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
     
	
}
