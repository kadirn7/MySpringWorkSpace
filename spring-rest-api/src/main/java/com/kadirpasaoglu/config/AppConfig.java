package com.kadirpasaoglu.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kadirpasaoglu.model.Employee;

@Configuration
public class AppConfig {

	@Bean
	public List<Employee> employeeList(){
		List<Employee>employeeList=new ArrayList<>();
		employeeList.add(new Employee("1","Kadir","Pasaoglu"));
		employeeList.add(new Employee("2","Yusuf","Pasaoglu"));
		employeeList.add(new Employee("3","Kadir","Arda"));
		employeeList.add(new Employee("4","Yusuf","Arda"));
		employeeList.add(new Employee("5","Enes","Bayram"));
		return employeeList;
	}
}
