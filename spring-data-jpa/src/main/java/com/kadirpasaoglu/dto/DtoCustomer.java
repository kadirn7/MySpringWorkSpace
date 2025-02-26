package com.kadirpasaoglu.dto;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoCustomer {
    private Long id;
    private String name;
    
    private DtoAddress address;
}
