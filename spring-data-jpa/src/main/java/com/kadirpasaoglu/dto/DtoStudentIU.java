package com.kadirpasaoglu.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DtoStudentIU {
	
	@NotEmpty(message = "Firstname alani bos birakilamaz.")
    @Size(min= 3, max=10, message = "boyutu 3ten kucuk olamaz ve 10 dan buyuk olamaz")
    private String firstName;
    @NotEmpty(message = "Lastname alani bos birakilamaz.")
    @Size(min= 3, max=30, message = "Soyad 3-30 karakter arasında olmalıdır")
    private String lastName;
    @NotNull(message = "Doğum tarihi boş bırakılamaz")
    private Date birthOfDate;
    @NotEmpty(message = "Email alani bos birakilamaz")
    @Email(message = "Lutfen gecerli bir email giriniz")
    private String email;
}
