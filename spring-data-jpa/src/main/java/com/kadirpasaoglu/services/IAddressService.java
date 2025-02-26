package com.kadirpasaoglu.services;

import java.util.List;

import com.kadirpasaoglu.dto.DtoAddress;
import com.kadirpasaoglu.entities.Address;

public interface IAddressService {

    public List<Address> getAllAdress();
    public Address createAdress(Address address);
    public DtoAddress getAddressById(Long id);
}
