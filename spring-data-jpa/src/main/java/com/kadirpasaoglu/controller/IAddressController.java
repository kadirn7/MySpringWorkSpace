package com.kadirpasaoglu.controller;

import java.util.List;

import com.kadirpasaoglu.entities.Address;


public interface IAddressController {
   public List<Address> getAllAdress() ;
   public Address createAddress(Address address);
}
