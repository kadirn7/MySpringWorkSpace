package com.kadirpasaoglu.controller;

import com.kadirpasaoglu.dto.DtoUser;
import com.kadirpasaoglu.jwt.AuthRequest;
import com.kadirpasaoglu.jwt.AuthResponse;

public interface IRestAuthController {
    public DtoUser register(AuthRequest request);

    public AuthResponse authenticate(AuthRequest request);
}
