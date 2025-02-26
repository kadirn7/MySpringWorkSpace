package com.kadirpasaoglu.services;

import com.kadirpasaoglu.dto.DtoCustomer;

import java.util.List;
public interface ICustomerService {
    public DtoCustomer createCustomer(DtoCustomer customer);
    public List<DtoCustomer> getAllCustomer();
    public DtoCustomer getCustumerById(Long id);
}
