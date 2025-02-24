package com.kadirpasaoglu.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadirpasaoglu.dto.DtoStudent;
import com.kadirpasaoglu.dto.DtoStudentIU;
import com.kadirpasaoglu.entities.Student;
import com.kadirpasaoglu.repository.IStudentRepository;
import com.kadirpasaoglu.services.IStudentService;



@Service
public class StudentServiceImpl implements IStudentService{

    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
        DtoStudent dtoStudentResponse = new DtoStudent();
        Student studentEntity = new Student();
        BeanUtils.copyProperties(dtoStudentIU, studentEntity);
               
        Student savedStudent = studentRepository.save(studentEntity);
        BeanUtils.copyProperties(savedStudent, dtoStudentResponse);
        return dtoStudentResponse;
    }

    @Override
    public List<DtoStudent> getAllStudents() {
    	List<DtoStudent> dtoList =new ArrayList<>();
        List<Student> studentList = studentRepository.findAll();
        
        for(Student student:studentList) {
        	DtoStudent dto=new DtoStudent();
        	BeanUtils.copyProperties(student, dto);
        	dtoList.add(dto);
        }
        return dtoList;
       // return studentList.stream()
       //     .map(student -> new DtoStudent(student.getFirstName(), student.getLastName()))
       //     .collect(Collectors.toList());
    }
    @Override
    public DtoStudent getStudentById(Integer id) {
        Optional<Student> optional = studentRepository.findById(id);
        if(optional.isPresent()){ 
            Student student = optional.get();
            return new DtoStudent(student.getFirstName(), student.getLastName());
        }
        return null;
    }
    @Override
    public DtoStudent updateStudent(DtoStudentIU student) {
        Student studentEntity = new Student();
        studentEntity.setFirstName(student.getFirstName());
        studentEntity.setLastName(student.getLastName());
        
        Student updatedStudent = studentRepository.save(studentEntity);
        return new DtoStudent(updatedStudent.getFirstName(), updatedStudent.getLastName());
    }
    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

}
