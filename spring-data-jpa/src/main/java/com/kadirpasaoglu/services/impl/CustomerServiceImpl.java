package com.kadirpasaoglu.services.impl;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadirpasaoglu.dto.DtoCustomer;
import com.kadirpasaoglu.dto.DtoStudent;
import com.kadirpasaoglu.entities.Customer; 
import com.kadirpasaoglu.repository.ICustomerRepository;
import com.kadirpasaoglu.services.ICustomerService;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public DtoCustomer createCustomer(DtoCustomer customer) {
        DtoCustomer dtoStudentResponse=new DtoCustomer();
        Customer customerEntity= new Customer();
        BeanUtils.copyProperties(customer,customerEntity);

        Customer savedCustomer=customerRepository.save(customerEntity);
        BeanUtils.copyProperties(savedCustomer, dtoStudentResponse);
        
        return dtoStudentResponse;
    }
    @Override
    public List<DtoCustomer> getAllCustomer() {
        List<DtoCustomer> dtoCustomers= new ArrayList<>();
        List<Customer> allCustomer =customerRepository.findAll();

        for(Customer customer: allCustomer){
            DtoCustomer dto = new DtoCustomer();
            BeanUtils.copyProperties(customer, dto);
            dtoCustomers.add(dto);
        }
        return dtoCustomers;
    }
    @Override
    public Customer getCustumerById(Long id) {
        Optional<Customer> optional= customerRepository.findById(id);
        if(optional.isPresent()){
            Customer customer= optional.get();
            return customer;
        }
        return null;
    }
    
}