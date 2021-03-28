/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database.demo.student;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author danielramirez
 */
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    
    private final StudentService studentService; 
    
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    @GetMapping
    public List<Student> getStudent(){
            return studentService.getStudents(); 
    }
}
    

