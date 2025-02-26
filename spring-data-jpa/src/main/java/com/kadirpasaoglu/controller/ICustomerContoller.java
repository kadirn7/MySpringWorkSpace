package com.kadirpasaoglu.controller;

import com.kadirpasaoglu.dto.DtoCustomer;
import java.util.List;
public interface ICustomerContoller {
    public DtoCustomer createCustomer(DtoCustomer dtoCustomer);
    public List<DtoCustomer> getAllCustomer();
    public DtoCustomer getCustomerById(Long id);
}
