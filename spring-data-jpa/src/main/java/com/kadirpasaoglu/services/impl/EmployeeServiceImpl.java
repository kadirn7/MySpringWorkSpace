package com.kadirpasaoglu.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadirpasaoglu.dto.DtoDepartment;
import com.kadirpasaoglu.dto.DtoEmployee;
import com.kadirpasaoglu.entities.Department;
import com.kadirpasaoglu.entities.Employee;
import com.kadirpasaoglu.repository.IEmployeeRepository;
import com.kadirpasaoglu.services.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    IEmployeeRepository employeeRepository;

    @Override
    public List<DtoEmployee> getAllEmployees() {
        List<DtoEmployee> dtoEmployees= new ArrayList<>();
        List<Employee> employees= employeeRepository.findAll();
        
        if(employees.isEmpty()){
            return null;
        }
        for (Employee employee: employees){
            DtoEmployee dtoEmployee=new DtoEmployee();
            DtoDepartment dtoDepartment=new DtoDepartment();
            Department department=employee.getDepartment();
            
            BeanUtils.copyProperties(department, dtoDepartment);
            BeanUtils.copyProperties(employee, dtoEmployee);
            dtoEmployee.setDepertment(dtoDepartment);
            dtoEmployees.add(dtoEmployee);
        }
        return dtoEmployees;
    }
}
