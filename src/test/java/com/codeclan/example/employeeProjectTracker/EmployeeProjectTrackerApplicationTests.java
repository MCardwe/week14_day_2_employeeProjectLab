package com.codeclan.example.employeeProjectTracker;

import com.codeclan.example.employeeProjectTracker.models.Department;
import com.codeclan.example.employeeProjectTracker.models.Employee;
import com.codeclan.example.employeeProjectTracker.models.Project;
import com.codeclan.example.employeeProjectTracker.repositories.DepartmentRepository;
import com.codeclan.example.employeeProjectTracker.repositories.EmployeeRepository;
import com.codeclan.example.employeeProjectTracker.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeProjectTrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	DepartmentRepository departmentRepository;
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
//		Department accounts = new Department("Accounts");
//		departmentRepository.save(accounts);
//		Employee daniel = new Employee("Daniel", "Ranson", 443, accounts);
		Project audit = new Project("audit", 34);
//		daniel.addProject(audit);
//		audit.addEmployee(daniel);
//		accounts.addEmployee(daniel);
//		departmentRepository.save(accounts);
//		employeeRepository.save(daniel);
		projectRepository.save(audit);
	}

}
