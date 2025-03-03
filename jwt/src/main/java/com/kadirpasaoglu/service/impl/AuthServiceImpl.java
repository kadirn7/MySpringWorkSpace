package com.kadirpasaoglu.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadirpasaoglu.dto.DtoUser;
import com.kadirpasaoglu.jwt.AuthRequest;
import com.kadirpasaoglu.model.User;
import com.kadirpasaoglu.repository.UserRepository;
import com.kadirpasaoglu.service.IAuthService;


@Service
public class AuthServiceImpl implements IAuthService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public DtoUser register(AuthRequest request) {
        
        DtoUser dtoUser= new DtoUser();
        User user= new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        

        User savedUser= userRepository.save(user);
        BeanUtils.copyProperties(savedUser,dtoUser);

      return dtoUser;
    }
   
}
