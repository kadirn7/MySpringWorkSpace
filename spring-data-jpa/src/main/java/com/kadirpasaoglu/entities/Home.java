package com.kadirpasaoglu.entities;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="home")
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   Long id;
    @Column(name="price")
    private   BigDecimal price;
    @OneToMany
    private List<Room> rooms;
}
