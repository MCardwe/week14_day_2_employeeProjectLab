package com.codeclan.example.employeeProjectTracker.repositories;

import com.codeclan.example.employeeProjectTracker.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
