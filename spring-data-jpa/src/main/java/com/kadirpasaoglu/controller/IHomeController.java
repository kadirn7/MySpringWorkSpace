package com.kadirpasaoglu.controller;

import java.util.List;

import com.kadirpasaoglu.dto.DtoHome;


public interface IHomeController {
    public List<DtoHome> getAllHomes();
    public DtoHome getHomeById(Long id);
}
