package com.kadirpasaoglu.controller;

import java.util.List;

import com.kadirpasaoglu.dto.DtoStudent;
import com.kadirpasaoglu.dto.DtoStudentIU;

public interface IStudentController {
	
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
	public List<DtoStudent> getAllStudents();
	public DtoStudent getStudentById(Integer id);
	public DtoStudent updateStudent(DtoStudentIU dtoStudentIU);
	public void deleteStudent(Integer id);
}
