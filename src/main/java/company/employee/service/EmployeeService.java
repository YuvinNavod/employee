package com.company.employee.service;

import com.company.employee.entity.Employee;
import com.company.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }


    public List<Employee> getEmployeesByDepartmentId(Long departmentId) {
        return employeeRepository.findByDepartmentId(departmentId);
    }
}