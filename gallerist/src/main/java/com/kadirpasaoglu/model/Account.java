package com.kadirpasaoglu.model;

import java.math.BigDecimal;

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
@Table(name = "account")
public class Account extends BaseEntitiy {
    @Column(name="account_no")
    private String accountNo;
    private String iban;
    private BigDecimal amount;

    @Column(name="currency_type")
    @Enumerated(EnumType.STRING)
    private CurrencyType currencyType;
}
