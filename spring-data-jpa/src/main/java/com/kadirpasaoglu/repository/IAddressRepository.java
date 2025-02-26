package com.kadirpasaoglu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kadirpasaoglu.entities.Address;

@Repository
public interface IAddressRepository extends JpaRepository<Address, Long> {

    
} 