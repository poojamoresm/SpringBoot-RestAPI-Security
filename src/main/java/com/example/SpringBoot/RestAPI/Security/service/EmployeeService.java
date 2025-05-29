package com.example.SpringBoot.RestAPI.Security.service;

import com.example.SpringBoot.RestAPI.Security.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
