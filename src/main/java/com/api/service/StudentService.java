package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.repo.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo=null;
}
