package com.Enugala.LMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Enugala.LMS.entity.Book;
import com.Enugala.LMS.entity.StudentBooks;

public interface StudentBookRepository extends JpaRepository<StudentBooks, Long>  {

}
