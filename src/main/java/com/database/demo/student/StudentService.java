/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author danielramirez
 */
@Service
public class StudentService {
    
    public List<Student> getStudents(){
            return List.of(
                    new Student(
                    1L,
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    21));
        }
    
}
