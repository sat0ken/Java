package com.example.demo.springjpa3.repository;

import com.example.demo.springjpa3.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
