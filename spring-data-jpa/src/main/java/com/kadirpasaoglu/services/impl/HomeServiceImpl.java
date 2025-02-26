package com.kadirpasaoglu.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadirpasaoglu.entities.Home;
import com.kadirpasaoglu.repository.IHomeRepository;
import com.kadirpasaoglu.services.IHomeService;

@Service
public class HomeServiceImpl implements IHomeService {

    @Autowired
    IHomeRepository homeRepository;

    @Override
    public List<Home> getAllHomes() {
        return homeRepository.findAll();
    }

}
