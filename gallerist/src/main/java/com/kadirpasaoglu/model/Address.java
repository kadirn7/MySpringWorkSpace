package com.kadirpasaoglu.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address")
public class Address extends BaseEntitiy {
	private String city;
	private String	district;

	private String neighbordhood;
	private String street;
	
}
