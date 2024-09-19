package com.example.college_management.College_Directory_Application.service;


import com.example.college_management.College_Directory_Application.model.Course;
import com.example.college_management.College_Directory_Application.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course findById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    public Course save(Course course) {
        return courseRepository.save(course);
    }
}

