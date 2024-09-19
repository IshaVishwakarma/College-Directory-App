package com.example.college_management.College_Directory_Application.model;



import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class FacultyProfile {

    @Id
    private Long userId;
    private String photo;
    private String officeHours;

    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;

    // Getters and Setters
}
