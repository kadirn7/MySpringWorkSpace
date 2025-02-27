package com.kadirpasaoglu.services;

import java.util.List;

import com.kadirpasaoglu.dto.DtoHome;


public interface IHomeService {
    public List<DtoHome> getAllHomes();
    public DtoHome getHomeByID(Long id);
}
