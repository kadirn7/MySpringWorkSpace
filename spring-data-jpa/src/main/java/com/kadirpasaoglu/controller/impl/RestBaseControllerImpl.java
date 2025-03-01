package com.kadirpasaoglu.controller.impl;

import org.springframework.web.bind.annotation.RestController;

import com.kadirpasaoglu.entities.RootEntity;

@RestController
public class RestBaseControllerImpl {
    public <T> RootEntity<T> ok(T data){
        return RootEntity.ok(data);
    }
    public <T> RootEntity<T> error(String message){
        return RootEntity.error(message);
    }

}
