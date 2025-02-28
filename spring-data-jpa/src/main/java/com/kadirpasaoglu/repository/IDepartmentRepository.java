package com.kadirpasaoglu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadirpasaoglu.entities.Department;

public interface IDepartmentRepository extends JpaRepository<Department,Long>{

}
