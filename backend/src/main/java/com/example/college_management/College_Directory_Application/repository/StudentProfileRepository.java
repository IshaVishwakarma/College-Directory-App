package com.example.college_management.College_Directory_Application.repository;


import com.example.college_management.College_Directory_Application.model.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long> {

}

