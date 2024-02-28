package com.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.Student;

public interface StudnetRepo extends JpaRepository<Student, Integer>{

}
