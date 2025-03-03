package com.kadirpasaoglu.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadirpasaoglu.dto.DtoDepartment;
import com.kadirpasaoglu.dto.DtoEmployee;
import com.kadirpasaoglu.model.Department;
import com.kadirpasaoglu.model.Employee;
import com.kadirpasaoglu.repository.EmployeeRepository;
import com.kadirpasaoglu.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public DtoEmployee getEmployeeById(Long id) {
        DtoEmployee dto = new DtoEmployee();
        DtoDepartment dtoDepartment = new DtoDepartment();
        
        Optional< Employee> optional= employeeRepository.findById(id);
        Employee employee= optional.get();
        if(optional.isEmpty()){
            return null;
        }
        Department department= optional.get().getDepartmant();
        BeanUtils.copyProperties(department, dtoDepartment);
        BeanUtils.copyProperties(employee, dto);
        dto.setDepartment(dtoDepartment);
        
        return dto;
    }
  
} 
