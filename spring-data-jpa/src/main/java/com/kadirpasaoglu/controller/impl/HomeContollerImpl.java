package com.kadirpasaoglu.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kadirpasaoglu.controller.IHomeController;
import com.kadirpasaoglu.entities.Home;
import com.kadirpasaoglu.services.IHomeService;

@RestController
@RequestMapping("/rest/api/home")
public class HomeContollerImpl implements IHomeController{

    @Autowired
    IHomeService homeService;

    @Override
    @GetMapping("list")
    public List<Home> getAllHomes() {
        return homeService.getAllHomes();
    }

}
