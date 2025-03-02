package com.kadirpasaoglu.spring_data_jpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kadirpasaoglu.dto.DtoEmployee;
import com.kadirpasaoglu.services.IEmployeeService;
import com.kadirpasaoglu.starter.SpringDataJpaApplication;

@SpringBootTest(classes = {SpringDataJpaApplication.class})
class SpringDataJpaApplicationTests {
	@Autowired 	
	private IEmployeeService employeeService;
	@Test
	public void testgetEmployeeById(){
		DtoEmployee employee=employeeService.getEmployeeById(3L);
		if(employee!=null){
			System.out.println("İsim " + employee.getName());
		}
	}
	

}
