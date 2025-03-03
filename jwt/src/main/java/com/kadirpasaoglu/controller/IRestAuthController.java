package com.kadirpasaoglu.controller;

import com.kadirpasaoglu.dto.DtoUser;
import com.kadirpasaoglu.jwt.AuthRequest;

public interface IRestAuthController {
    public DtoUser register(AuthRequest request);
}
