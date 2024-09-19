package com.example.college_management.College_Directory_Application.service;

import com.example.college_management.College_Directory_Application.model.StudentProfile;



import com.example.college_management.College_Directory_Application.model.StudentProfile;
import com.example.college_management.College_Directory_Application.repository.StudentProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentProfileService {

    @Autowired
    private StudentProfileRepository studentProfileRepository;

    public StudentProfile findById(Long id) {
        return studentProfileRepository.findById(id).orElse(null);
    }

    public StudentProfile save(StudentProfile studentProfile) {
        return studentProfileRepository.save(studentProfile);
    }
}

