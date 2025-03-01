package com.kadirpasaoglu.controller;

import java.util.List;

import com.kadirpasaoglu.dto.DtoEmployee;
import com.kadirpasaoglu.entities.RootEntity;

public interface IEmployeeController {
    public List<DtoEmployee> getAllEmployees();
    public RootEntity<DtoEmployee> getEmployeeById(Long id);
}
