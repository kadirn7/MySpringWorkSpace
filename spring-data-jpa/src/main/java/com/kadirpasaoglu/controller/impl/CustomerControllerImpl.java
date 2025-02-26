package com.kadirpasaoglu.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import com.kadirpasaoglu.controller.ICustomerContoller;
import com.kadirpasaoglu.dto.DtoCustomer;

import com.kadirpasaoglu.services.ICustomerService;



@RestController
@RequestMapping("/rest/api/customer")
public class CustomerControllerImpl implements ICustomerContoller {

    @Autowired
    private ICustomerService customerService;

    @PostMapping("/save")
    @Override
    public DtoCustomer createCustomer(@RequestBody DtoCustomer dtoCustomer) {
        return customerService.createCustomer(dtoCustomer);
    }
    @GetMapping("/list")
    @Override
    public List<DtoCustomer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

   
    @GetMapping("/list/{id}")
    @Override
    public DtoCustomer getCustomerById(@PathVariable Long id) {
       return customerService.getCustumerById(id);
              
    }
}
