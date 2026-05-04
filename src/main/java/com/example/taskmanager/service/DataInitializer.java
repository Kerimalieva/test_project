package com.example.taskmanager.service;

import com.example.taskmanager.model.ERole;
import com.example.taskmanager.model.Role;
import com.example.taskmanager.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        for (ERole eRole : ERole.values()) {
            if (roleRepository.findByName(eRole).isEmpty()) {
                roleRepository.save(new Role(eRole));
                System.out.println("Role " + eRole + " created.");
            }
        }
    }
}