package com.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.Student;
import java.util.List;


public interface StudentRepo extends JpaRepository<Student, Integer>{
    
}
