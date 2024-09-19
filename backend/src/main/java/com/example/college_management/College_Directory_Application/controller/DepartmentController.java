package com.example.college_management.College_Directory_Application.controller;



import com.example.college_management.College_Directory_Application.model.Department;
import com.example.college_management.College_Directory_Application.service.DepartmentService;
import com.example.college_management.College_Directory_Application.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Long id) {
        Department department = departmentService.findById(id);
        return ResponseEntity.ok(department);
    }

    @PostMapping
    public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
        Department savedDepartment = departmentService.save(department);
        return ResponseEntity.ok(savedDepartment);
    }

    // Other CRUD operations
}

