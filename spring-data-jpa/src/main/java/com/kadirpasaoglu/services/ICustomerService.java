package com.kadirpasaoglu.services;

import com.kadirpasaoglu.dto.DtoCustomer;
import com.kadirpasaoglu.entities.Customer;
import java.util.List;
public interface ICustomerService {
    public DtoCustomer createCustomer(DtoCustomer customer);
    public List<DtoCustomer> getAllCustomer();
    public Customer getCustumerById(Long id);
}
