package com.kadirpasaoglu.service;

import com.kadirpasaoglu.dto.DtoUser;
import com.kadirpasaoglu.jwt.AuthRequest;

public interface IAuthService {
    public DtoUser register(AuthRequest request);
}
