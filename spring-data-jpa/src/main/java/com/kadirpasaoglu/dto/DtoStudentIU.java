package com.kadirpasaoglu.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DtoStudentIU {
	
	@NotEmpty(message = "Firstname alani bos birakilamaz.")
    @Size(min= 3,max=10 , message = "boyutu 3ten kucuk olamaz.ve 10 dan kucuk olamaz ")
    private String firstName;
    @Size(min= 3,max=30)
    private String lastName;
    private Date birthOfDate;
    @Email(message = "Lutfen gecerli bir email giriniz")
    private String email;
}
