package com.example.college_management.College_Directory_Application.service;

import com.example.college_management.College_Directory_Application.model.Department;


import com.example.college_management.College_Directory_Application.model.Department;
import com.example.college_management.College_Directory_Application.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department findById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    public Department save(Department department) {
        return departmentRepository.save(department);
    }
}

