package com.example.college_management.College_Directory_Application.service;

import com.example.college_management.College_Directory_Application.model.AdministratorProfile;



import com.example.college_management.College_Directory_Application.model.AdministratorProfile;
import com.example.college_management.College_Directory_Application.repository.AdministratorProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorProfileService {

    @Autowired
    private AdministratorProfileRepository administratorProfileRepository;

    public AdministratorProfile findById(Long id) {
        return administratorProfileRepository.findById(id).orElse(null);
    }

    public AdministratorProfile save(AdministratorProfile administratorProfile) {
        return administratorProfileRepository.save(administratorProfile);
    }
}


