package com.kadirpasaoglu.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kadirpasaoglu.controller.IAddressController;
import com.kadirpasaoglu.entities.Address;
import com.kadirpasaoglu.services.IAddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/rest/api/address")
public class AdressControllerImpl implements IAddressController{
    
    @Autowired
    private IAddressService addressService;
  
    @GetMapping("list")
    @Override
    public List<Address> getAllAdress() {
        return addressService.getAllAdress();
    }
    @GetMapping("save")
    @Override
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAdress(address);
    }

}
