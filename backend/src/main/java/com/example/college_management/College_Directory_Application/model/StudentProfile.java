package com.example.college_management.College_Directory_Application.model;



import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class StudentProfile {

    @Id
    private Long userId;
    private String photo;
    private String year;

    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;

    // Getters and Setters
}
