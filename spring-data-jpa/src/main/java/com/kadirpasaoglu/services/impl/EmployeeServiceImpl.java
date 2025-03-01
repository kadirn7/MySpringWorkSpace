package com.kadirpasaoglu.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadirpasaoglu.dto.DtoDepartment;
import com.kadirpasaoglu.dto.DtoEmployee;
import com.kadirpasaoglu.entities.Department;
import com.kadirpasaoglu.entities.Employee;
import com.kadirpasaoglu.exception.BaseException;   
import com.kadirpasaoglu.exception.ErrorMessage;
import com.kadirpasaoglu.exception.MessageType;
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

    @Override
    public DtoEmployee getEmployeeById(Long id) {
        DtoEmployee dtoEmployee= new DtoEmployee();
        Optional<Employee> optional= employeeRepository.findById(id);
        if(optional.isEmpty()){
            throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST,id.toString()));
        }
        Employee employee= optional.get();
        Department department= optional.get().getDepartment();
        DtoDepartment dtoDepartment= new DtoDepartment();
        
        
        BeanUtils.copyProperties(department, dtoDepartment);
        BeanUtils.copyProperties(employee, dtoEmployee);
        dtoEmployee.setDepertment(dtoDepartment);
        return dtoEmployee;


    }
}
