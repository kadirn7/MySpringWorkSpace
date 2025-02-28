package com.kadirpasaoglu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoDataSource {
    public String url;
    public String userName;
    public String password;
}
