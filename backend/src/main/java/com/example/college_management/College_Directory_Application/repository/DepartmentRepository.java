package com.example.college_management.College_Directory_Application.repository;


import com.example.college_management.College_Directory_Application.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
