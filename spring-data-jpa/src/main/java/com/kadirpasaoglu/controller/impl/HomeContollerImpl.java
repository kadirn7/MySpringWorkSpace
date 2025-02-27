package com.kadirpasaoglu.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kadirpasaoglu.controller.IHomeController;
import com.kadirpasaoglu.dto.DtoHome;

import com.kadirpasaoglu.services.IHomeService;

@RestController
@RequestMapping("/rest/api/home")
public class HomeContollerImpl implements IHomeController{

    @Autowired
    IHomeService homeService;

    @Override
    @GetMapping("list")
    public List<DtoHome> getAllHomes() {
        return homeService.getAllHomes();
    }
    @GetMapping("list/{id}")
    @Override
    public DtoHome getHomeById(@PathVariable Long id) {
        return homeService.getHomeByID(id);
    }

}
