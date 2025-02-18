package com.kadirpasaoglu.services;

import java.util.List;

import com.kadirpasaoglu.dto.DtoStudent;
import com.kadirpasaoglu.dto.DtoStudentIU;



public interface IStudentService {
    public DtoStudent saveStudent(DtoStudentIU student);
    public List<DtoStudent> getAllStudents();
    public DtoStudent getStudentById(Integer id);
    public DtoStudent updateStudent(DtoStudentIU student);
    public void deleteStudent(Integer id);
}
