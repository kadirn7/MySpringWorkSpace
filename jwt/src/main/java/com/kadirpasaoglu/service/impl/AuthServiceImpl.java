package com.kadirpasaoglu.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.kadirpasaoglu.dto.DtoUser;
import com.kadirpasaoglu.jwt.AuthRequest;
import com.kadirpasaoglu.jwt.AuthResponse;
import com.kadirpasaoglu.jwt.JwtService;
import com.kadirpasaoglu.model.User;
import com.kadirpasaoglu.repository.UserRepository;
import com.kadirpasaoglu.service.IAuthService;


@Service
public class AuthServiceImpl implements IAuthService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationProvider authenticationProvider;

    @Autowired
    private JwtService jwtService;
    

    @Override
    public AuthResponse authenticate(AuthRequest request) {
        try {

          UsernamePasswordAuthenticationToken auth=
          new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword());
          authenticationProvider.authenticate(auth);  //arka planda verdiğimiz kullanıcı adı ve şifreyi database ile karşılaştırıyor.

          Optional<User> optionalUser= userRepository.findByUsername(request.getUsername());
          String token=  jwtService.generateToken(optionalUser.get());
          if(token.isEmpty()){
            return new AuthResponse("Token oluşturulamadı");
          }

          return new AuthResponse(token);
        } catch (Exception e) {
          System.out.println("Kullanıcı adı veya şifre hatalı");
        }

      throw new RuntimeException("Kullanıcı adı veya şifre hatalı");
    }

    @Override
    public DtoUser register(AuthRequest request) { 
        DtoUser dtoUser= new DtoUser();
        User user= new User();
        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        User savedUser= userRepository.save(user);
        BeanUtils.copyProperties(savedUser,dtoUser);

      return dtoUser;
    }

  
}
