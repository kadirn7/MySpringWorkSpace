package com.kadirpasaoglu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kadirpasaoglu.entities.Home;

@Repository
public interface IHomeRepository extends JpaRepository<Home,Long>{


}
