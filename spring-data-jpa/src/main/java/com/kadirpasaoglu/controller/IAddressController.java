package com.kadirpasaoglu.controller;

import java.util.List;

import com.kadirpasaoglu.dto.DtoAddress;
import com.kadirpasaoglu.entities.Address;


public interface IAddressController {
   public List<Address> getAllAdress() ;
   public Address createAddress(Address address);
   public DtoAddress getDtoAddress(Long id);
}
