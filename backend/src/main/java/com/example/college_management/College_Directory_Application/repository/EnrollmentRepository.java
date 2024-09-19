package com.example.college_management.College_Directory_Application.repository;


import com.example.college_management.College_Directory_Application.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
