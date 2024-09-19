package com.example.college_management.College_Directory_Application.controller;



import com.example.college_management.College_Directory_Application.model.FacultyProfile;
import com.example.college_management.College_Directory_Application.service.FacultyProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/faculty")
public class FacultyController {

    @Autowired
    private FacultyProfileService facultyProfileService;

    @GetMapping("/{id}")
    public ResponseEntity<FacultyProfile> getFacultyById(@PathVariable Long id) {
        FacultyProfile facultyProfile = facultyProfileService.findById(id);
        return ResponseEntity.ok(facultyProfile);
    }

    @PostMapping
    public ResponseEntity<FacultyProfile> createFaculty(@RequestBody FacultyProfile facultyProfile) {
        FacultyProfile savedFacultyProfile = facultyProfileService.save(facultyProfile);
        return ResponseEntity.ok(savedFacultyProfile);
    }

    // Other CRUD operations
}

