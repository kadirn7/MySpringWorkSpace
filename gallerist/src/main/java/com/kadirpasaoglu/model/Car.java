package com.kadirpasaoglu.model;

import java.math.BigDecimal;

import com.kadirpasaoglu.enums.CarStatusType;
import com.kadirpasaoglu.enums.CurrencyType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "car")
public class Car extends BaseEntitiy {
    private String plaka;
    private String brand;
    private String model;
    @Column(name="production_year")
    private Integer productionYear;
    private BigDecimal price;
    @Column(name="currency_type")
    @Enumerated(EnumType.STRING)
    private CurrencyType currencyType;
    @Column(name="damage_price")
    private BigDecimal damagePrice;

    @Column(name="car_status_type")
    @Enumerated(EnumType.STRING)
    private CarStatusType carStatusType;
}
