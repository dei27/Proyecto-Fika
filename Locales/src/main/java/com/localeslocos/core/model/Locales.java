package com.localeslocos.core.model;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "locales")
public class Locales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_local")
	private Long id;

	@Column(name = "nombre_local", nullable = false, unique = true)
	private String nombreLocal;

	@Column(name = "horario_apertura", nullable = false)
	private LocalTime horarioApertura;

	@Column(name = "horario_cierre", nullable = false)
	private LocalTime horarioCierre;

	@Column(name = "direccion", nullable = false)
	private String direccion;

	@Column(name = "express", nullable = false)
	private Boolean express;

	@Column(name = "tipo_cocina", nullable = false)
	private String tipoCocina;

	@Column(name = "telefono", nullable = false, unique = true)
	private String telefono;

	@Column(name = "tiempo_entrega", nullable = false)
	private Integer tiempoEntrega;
	
	@Column(name = "esta_Abierto", nullable = false)
	private Boolean estaAbierto;
	
	public Locales() {}

	public Locales(String nombreLocal, LocalTime horarioApertura, LocalTime horarioCierre, String direccion,
			Boolean express, String tipoCocina, String telefono, Integer tiempoEntrega, Boolean estaAbierto) {
		this.nombreLocal = nombreLocal;
		this.horarioApertura = horarioApertura;
		this.horarioCierre = horarioCierre;
		this.direccion = direccion;
		this.express = express;
		this.tipoCocina = tipoCocina;
		this.telefono = telefono;
		this.tiempoEntrega = tiempoEntrega;
		this.estaAbierto=estaAbierto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreLocal() {
		return nombreLocal;
	}

	public void setNombreLocal(String nombreLocal) {
		this.nombreLocal = nombreLocal;
	}

	public LocalTime getHorarioApertura() {
		return horarioApertura;
	}

	public void setHorarioApertura(LocalTime horarioApertura) {
		this.horarioApertura = horarioApertura;
	}

	public LocalTime getHorarioCierre() {
		return horarioCierre;
	}

	public void setHorarioCierre(LocalTime horarioCierre) {
		this.horarioCierre = horarioCierre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Boolean getExpress() {
		return express;
	}

	public void setExpress(Boolean express) {
		this.express = express;
	}

	public String getTipoCocina() {
		return tipoCocina;
	}

	public void setTipoCocina(String tipoCocina) {
		this.tipoCocina = tipoCocina;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Integer getTiempoEntrega() {
		return tiempoEntrega;
	}

	public void setTiempoEntrega(Integer tiempoEntrega) {
		this.tiempoEntrega = tiempoEntrega;
	}
	
	public Boolean getEstaAbierto() {
		return estaAbierto;
	}

	public void setEstaAbierto(Boolean estaAbierto) {
		this.estaAbierto = estaAbierto;
	}


	

}
