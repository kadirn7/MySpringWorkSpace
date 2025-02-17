package com.kadirpasaoglu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kadirpasaoglu.entities.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {
	
    @Query("select s from Student s where s.firstName = :firstName")
    public Student findByFirstName(@Param("firstName") String firstName);
}
