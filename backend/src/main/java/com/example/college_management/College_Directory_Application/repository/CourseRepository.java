package com.example.college_management.College_Directory_Application.repository;



import com.example.college_management.College_Directory_Application.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

