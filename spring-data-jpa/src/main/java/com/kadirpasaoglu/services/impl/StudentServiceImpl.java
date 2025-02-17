package com.kadirpasaoglu.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadirpasaoglu.entities.Student;
import com.kadirpasaoglu.repository.IStudentRepository;
import com.kadirpasaoglu.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{

    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

}
