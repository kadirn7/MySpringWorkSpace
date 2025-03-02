package com.kadirpasaoglu.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="refresh_token")
public class RefreshToken extends BaseEntitiy{
    @Column(name="refresh_token")
    private String refreshToken;
    @Column(name="expired_date")
    private Date expiredDate;
    @ManyToOne
    private User user;
}
