package com.codeclan.example.employeeProjectTracker.repositories;

import com.codeclan.example.employeeProjectTracker.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
