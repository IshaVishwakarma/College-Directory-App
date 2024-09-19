package com.example.college_management.College_Directory_Application.controller;

import com.example.college_management.College_Directory_Application.model.AdministratorProfile;
import com.example.college_management.College_Directory_Application.service.AdministratorProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdministratorController {

    @Autowired
    private AdministratorProfileService administratorProfileService;

    @GetMapping("/{id}")
    public ResponseEntity<AdministratorProfile> getAdministratorById(@PathVariable Long id) {
        AdministratorProfile administratorProfile = administratorProfileService.findById(id);
        return ResponseEntity.ok(administratorProfile);
    }

    @PostMapping
    public ResponseEntity<AdministratorProfile> createAdministrator(@RequestBody AdministratorProfile administratorProfile) {
        AdministratorProfile savedAdministratorProfile = administratorProfileService.save(administratorProfile);
        return ResponseEntity.ok(savedAdministratorProfile);
    }

    // Other CRUD operations
}
