package com.sahana.day4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sahana.day4.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	
}