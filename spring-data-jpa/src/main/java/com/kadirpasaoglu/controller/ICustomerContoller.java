package com.kadirpasaoglu.controller;

import com.kadirpasaoglu.dto.DtoCustomer;
import com.kadirpasaoglu.entities.Customer;
import java.util.List;
public interface ICustomerContoller {
    public DtoCustomer createCustomer(DtoCustomer dtoCustomer);
    public List<DtoCustomer> getAllCustomer();
    public Customer getCustomerById(Long id);
}
