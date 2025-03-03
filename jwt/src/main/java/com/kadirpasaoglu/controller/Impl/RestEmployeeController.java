package com.kadirpasaoglu.controller.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kadirpasaoglu.controller.IRestEmployeeController;
import com.kadirpasaoglu.dto.DtoEmployee;
import com.kadirpasaoglu.service.IEmployeeService;


@RestController
@RequestMapping("/employee")
public class RestEmployeeController implements IRestEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/list/{id}")
    @Override
    public DtoEmployee getEmployeeById( @PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

}
