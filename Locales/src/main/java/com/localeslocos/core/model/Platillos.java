package com.localeslocos.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "platillos")
public class Platillos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_platillo")
	private Long id;

	@Column(name = "nombre_platillo", nullable = false, unique = true)
	private String nombrePlatillo;

	public Platillos() {}

	public Platillos(String nombrePlatillo) {
		this.nombrePlatillo = nombrePlatillo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombrePlatillo() {
		return nombrePlatillo;
	}

	public void setNombrePlatillo(String nombrePlatillo) {
		this.nombrePlatillo = nombrePlatillo;
	}
	
	
}
