package com.kadirpasaoglu.model;



import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="customer")

public class Customer extends BaseEntitiy {
    @Column(name="first_name")
    private String firstName;
    private String lastName;
    private String tckn;
    private Date birtOfDate;

    @ManyToMany
    private Address address;
    
    @ManyToOne
    private Account account;
}
