/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database.demo.student;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author danielramirez
 */

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
    // @Query("SELEXT s FROM Stduent s WHERE s.email=?1")
    Optional<Student> findStudentByEmail(String email); 
    
}
