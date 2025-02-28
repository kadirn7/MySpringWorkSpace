package com.kadirpasaoglu.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kadirpasaoglu.config.GlobalProperties;
import com.kadirpasaoglu.config.GlobalProperties2;
import com.kadirpasaoglu.config.Server;
import com.kadirpasaoglu.dto.DtoDataSource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/rest/api/property")
public class PropertySourceController {
    @Autowired
    private GlobalProperties globalProperties ;
    @Autowired
    private GlobalProperties2 globalProperties2;
    @GetMapping("/dataSource")
    public DtoDataSource getDataSource() {
        DtoDataSource dataSource= new DtoDataSource();
        dataSource.setUrl(globalProperties.getUrl());
        dataSource.setUserName(globalProperties.getUsername());
        dataSource.setPassword(globalProperties.getPassword());

        return dataSource;
    }
    
    @GetMapping("/servers")
    public List<Server> getServers() {
        System.out.println("Key değerim"+globalProperties2.getKey());
        return globalProperties2.getServers();
    }
}
