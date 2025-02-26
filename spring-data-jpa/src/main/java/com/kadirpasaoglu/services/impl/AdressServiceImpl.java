package com.kadirpasaoglu.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadirpasaoglu.entities.Address;
import com.kadirpasaoglu.repository.IAddressRepository;
import com.kadirpasaoglu.services.IAddressService;

@Service
public class AdressServiceImpl implements IAddressService{

    @Autowired
    private IAddressRepository addressRepository;

    @Override
    public List<Address> getAllAdress() {
        return addressRepository.findAll();
    }

    @Override
    public Address createAdress(Address address) {
        return addressRepository.save(address);
    }
    

}
