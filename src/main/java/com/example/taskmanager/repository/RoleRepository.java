package com.example.taskmanager.repository;

import com.example.taskmanager.model.Role;
import com.example.taskmanager.model.ERole;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}