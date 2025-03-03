package com.kadirpasaoglu.controller.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kadirpasaoglu.controller.IRestAuthController;
import com.kadirpasaoglu.dto.DtoUser;
import com.kadirpasaoglu.jwt.AuthRequest;
import com.kadirpasaoglu.jwt.AuthResponse;
import com.kadirpasaoglu.service.IAuthService;

import jakarta.validation.Valid;

@RestController
public class RestAuthControllerImpl implements IRestAuthController{

    @Autowired
    private IAuthService authService;

    
    @PostMapping("/register")
	@Override
	public DtoUser register(@Valid @RequestBody AuthRequest request) {
		return authService.register(request);
	}


	@PostMapping("/authenticate")
	@Override
	public AuthResponse authenticate(@Valid  @RequestBody AuthRequest request) {
		return authService.authenticate(request);
	}
    
}
