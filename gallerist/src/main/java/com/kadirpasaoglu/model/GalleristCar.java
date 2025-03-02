package com.kadirpasaoglu.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="gallerist_car")

public class GalleristCar extends BaseEntitiy {
    @ManyToOne
    private Gallerist galerist;
    
    private Car car;
}
