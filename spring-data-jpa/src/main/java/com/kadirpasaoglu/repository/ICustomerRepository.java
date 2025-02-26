package com.kadirpasaoglu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kadirpasaoglu.entities.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

}
