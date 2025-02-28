package com.kadirpasaoglu.controller.impl;


import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.kadirpasaoglu.controller.IEmployeeController;
import com.kadirpasaoglu.dto.DtoEmployee;
import com.kadirpasaoglu.services.IEmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/rest/api/employee")
public class EmployeeControllerImpl implements IEmployeeController{

    @Autowired
    IEmployeeService employeeService;
    @Override
    @GetMapping("/list")
    public List<DtoEmployee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

}
