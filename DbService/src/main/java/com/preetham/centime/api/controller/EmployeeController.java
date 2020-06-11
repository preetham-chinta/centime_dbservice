package com.preetham.centime.api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.preetham.centime.api.dto.DEmployeeDTO;
import com.preetham.centime.api.dto.EmployeeDTO;
import com.preetham.centime.api.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    
    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable("id") Long id) {
    	return employeeService.getEmployeeById(id);
    }
    
    @GetMapping("/dangling")
    public List<DEmployeeDTO> getAllDEmployees() {
    	return employeeService.getAllDEmployees();
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
    	return employeeService.getAllEmployees();
    }
    
}