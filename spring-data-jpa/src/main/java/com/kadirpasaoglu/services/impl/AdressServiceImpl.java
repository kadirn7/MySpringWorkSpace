package com.kadirpasaoglu.services.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadirpasaoglu.dto.DtoAddress;
import com.kadirpasaoglu.dto.DtoCustomer;
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

    @Override
    public DtoAddress getAddressById(Long id) {
        DtoAddress dtoAddress= new DtoAddress();
        DtoCustomer dtoCustomer=new DtoCustomer();

        Optional<Address> optional=addressRepository.findById(id);
        
       if(optional.isPresent()){
         Address address =optional.get();
         
         BeanUtils.copyProperties(address, dtoAddress);
         
         dtoCustomer.setId(address.getCustomer().getId());
         dtoCustomer.setName(address.getCustomer().getName());
         
         dtoAddress.setCustomer(dtoCustomer);
         return dtoAddress;
       }
         return null;
       
    }
    

}
