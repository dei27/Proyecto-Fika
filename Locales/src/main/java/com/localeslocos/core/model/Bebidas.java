package com.localeslocos.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bebidas")
public class Bebidas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_bebida")
	private Long id;

	@Column(name = "nombre_bebida", nullable = false, unique = true)
	private String nombreBebida;

	public Bebidas() {}
	
	public Bebidas(String nombreBebida) {
		this.nombreBebida = nombreBebida;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreBebida() {
		return nombreBebida;
	}

	public void setNombreBebida(String nombreBebida) {
		this.nombreBebida = nombreBebida;
	}
	
	

}
