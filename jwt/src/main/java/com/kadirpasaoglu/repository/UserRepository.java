package com.kadirpasaoglu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.kadirpasaoglu.model.User;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    
 //   @Query(value="from User where username= :username")
    Optional<User> findByUsername(String username);
}
