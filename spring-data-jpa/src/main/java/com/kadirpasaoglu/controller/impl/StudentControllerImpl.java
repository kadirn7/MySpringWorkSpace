package com.kadirpasaoglu.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kadirpasaoglu.controller.IStudentController;
import com.kadirpasaoglu.dto.DtoStudent;
import com.kadirpasaoglu.dto.DtoStudentIU;
import com.kadirpasaoglu.services.IStudentService;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {
	
	@Autowired
	private IStudentService studentService;

	@PostMapping("/save")
	@Override
	public DtoStudent saveStudent(@RequestBody DtoStudentIU dtoStudentIU) {
		return studentService.saveStudent(dtoStudentIU);
	}

	@GetMapping("/list")
	@Override
	public List<DtoStudent> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@GetMapping("/list/{id}")
	@Override
	public DtoStudent getStudentById(@PathVariable Integer id) {
		return studentService.getStudentById(id);
	}
	
	@PutMapping("/update")
	@Override
	public DtoStudent updateStudent(@RequestBody DtoStudentIU dtoStudentIU) {
		return studentService.updateStudent(dtoStudentIU);
	}
	
	@DeleteMapping("/delete/{id}")
	@Override
	public void deleteStudent(@PathVariable Integer id) {
		studentService.deleteStudent(id);
	}

}
