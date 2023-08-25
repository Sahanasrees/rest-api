package com.sahana.day4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sahana.day4.model.Student;
import com.sahana.day4.service.StudentService;

@RestController
public class ApiController {
         @Autowired
             StudentService service;
         
         @PostMapping("save")
         public Student add(@RequestBody Student student) 
         {
        	 return service.saveinfo(student);
         }
         @GetMapping("show")
         public List<Student>show()
         {
        	 return service.showinfo();
         }
         @GetMapping("get/{id}")
         public Optional<Student>getinfo(@PathVariable int id)
         {
        	 return service.sow(id);
         }
         @PutMapping("update/{id}")
         public String modifybyid(@PathVariable int id,@RequestBody Student student)
         {
        	 return service.changeinfoid(id,student);
         }
         @DeleteMapping("delete/{id}")
         public void deletemyid(@PathVariable int id)
         {
        	 service.deleteid(id);
         }
}
