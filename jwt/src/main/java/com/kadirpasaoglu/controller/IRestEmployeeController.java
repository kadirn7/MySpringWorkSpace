package com.kadirpasaoglu.controller;

import com.kadirpasaoglu.dto.DtoEmployee;

public interface IRestEmployeeController {
    public DtoEmployee getEmployeeById(Long id);
}
