package com.example.SpringBoot.RestAPI.Security.dao;

import com.example.SpringBoot.RestAPI.Security.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
