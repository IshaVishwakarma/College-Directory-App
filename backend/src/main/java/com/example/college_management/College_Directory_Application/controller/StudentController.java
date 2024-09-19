package com.example.college_management.College_Directory_Application.controller;



import com.example.college_management.College_Directory_Application.model.StudentProfile;
import com.example.college_management.College_Directory_Application.service.StudentProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentProfileService studentProfileService;

    @GetMapping("/{id}")
    public ResponseEntity<StudentProfile> getStudentById(@PathVariable Long id) {
        StudentProfile studentProfile = studentProfileService.findById(id);
        return ResponseEntity.ok(studentProfile);
    }

    @PostMapping
    public ResponseEntity<StudentProfile> createStudent(@RequestBody StudentProfile studentProfile) {
        StudentProfile savedStudentProfile = studentProfileService.save(studentProfile);
        return ResponseEntity.ok(savedStudentProfile);
    }

    // Other CRUD operations
}

