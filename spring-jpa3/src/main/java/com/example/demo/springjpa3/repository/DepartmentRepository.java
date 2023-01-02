package com.example.demo.springjpa3.repository;

import com.example.demo.springjpa3.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
