package com.kadirpasaoglu.handler;


import java.sql.Date;

import lombok.Data;


@Data
public class Exception<T> {
    private String hostName;
    private String path;
    private Date createTime;
    private T message;

}
