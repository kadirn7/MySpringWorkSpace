package com.kadirpasaoglu.handler;

import lombok.Data;

@Data
public class ApiError<T> {
    private Integer status;
    private Exception<T> exception;
}
