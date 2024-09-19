package com.example.college_management.College_Directory_Application.service;

import com.example.college_management.College_Directory_Application.model.FacultyProfile;


import com.example.college_management.College_Directory_Application.model.FacultyProfile;
import com.example.college_management.College_Directory_Application.repository.FacultyProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyProfileService {

    @Autowired
    private FacultyProfileRepository facultyProfileRepository;

    public FacultyProfile findById(Long id) {
        return facultyProfileRepository.findById(id).orElse(null);
    }

    public FacultyProfile save(FacultyProfile facultyProfile) {
        return facultyProfileRepository.save(facultyProfile);
    }
}

