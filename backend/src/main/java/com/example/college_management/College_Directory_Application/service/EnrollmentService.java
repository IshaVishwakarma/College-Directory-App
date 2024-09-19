package com.example.college_management.College_Directory_Application.service;

import com.example.college_management.College_Directory_Application.model.Enrollment;



import com.example.college_management.College_Directory_Application.model.Enrollment;
import com.example.college_management.College_Directory_Application.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public Enrollment findById(Long id) {
        return enrollmentRepository.findById(id).orElse(null);
    }

    public Enrollment save(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }
}

