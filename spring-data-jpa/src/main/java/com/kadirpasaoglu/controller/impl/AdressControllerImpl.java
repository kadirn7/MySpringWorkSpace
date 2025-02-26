package com.kadirpasaoglu.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kadirpasaoglu.controller.IAddressController;
import com.kadirpasaoglu.dto.DtoAddress;
import com.kadirpasaoglu.entities.Address;
import com.kadirpasaoglu.services.IAddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




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
    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    @GetMapping("list/{id}")
    @Override
    public DtoAddress getDtoAddress(@PathVariable Long id) {
        return addressService.getAddressById(id);
    }

}
