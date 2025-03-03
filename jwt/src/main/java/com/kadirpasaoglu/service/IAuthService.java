package com.kadirpasaoglu.service;

import com.kadirpasaoglu.dto.DtoUser;
import com.kadirpasaoglu.jwt.AuthRequest;
import com.kadirpasaoglu.jwt.AuthResponse;

public interface IAuthService {
    public DtoUser register(AuthRequest request);

    public AuthResponse authenticate(AuthRequest request);
    
}
