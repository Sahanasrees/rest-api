package com.sahana.day4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sahana.day4.model.Student;
import com.sahana.day4.repository.StudentRepository;

@Service
public class StudentService {
      @Autowired
      StudentRepository studentrepository;
      
      public Student saveinfo(Student student)
      {
    	  return studentrepository.save(student);
      }
      public List<Student> showinfo()
      {
    	  return studentrepository.findAll();
      }
      public Optional<Student> sow(int id)
      {
    	  return studentrepository.findById(id);
      }
      public String changeinfoid(int id,Student student)
      {
    	  studentrepository.saveAndFlush(student);
    	  if(studentrepository.existsById(id))
    	  {
    		  return "Updated";
    	  }
    	  else
    	  {
    		  return "Enter valid id";
    	  }
      }
      public void deleteid(int id)
      {
    	  studentrepository.deleteById(id);
      }
}
