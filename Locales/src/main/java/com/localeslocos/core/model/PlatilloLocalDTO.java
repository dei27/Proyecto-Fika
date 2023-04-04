package com.localeslocos.core.model;

import java.math.BigDecimal;

public class PlatilloLocalDTO {

	private String nombreLocal;
	
    public String getNombreLocal() {
		return nombreLocal;
	}
	public void setNombreLocal(String nombreLocal) {
		this.nombreLocal = nombreLocal;
	}
	public String getNombrePlatillo() {
		return nombrePlatillo;
	}
	public void setNombrePlatillo(String nombrePlatillo) {
		this.nombrePlatillo = nombrePlatillo;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public Boolean getExpress() {
		return express;
	}
	public void setExpress(Boolean express) {
		this.express = express;
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
	
	public Long getTiempoCerrar() {
		return tiempoCerrar;
	}
	public void setTiempoCerrar(Long tiempoCerrar) {
		this.tiempoCerrar = tiempoCerrar;
	}
	private String nombrePlatillo;
    private BigDecimal precio;
    private Boolean express;
    private String telefono;
    private Integer tiempoEntrega;
    private Long tiempoCerrar;

	public PlatilloLocalDTO(String nombreLocal, String nombrePlatillo, BigDecimal precio, Boolean express,
			String telefono, Integer tiempoEntrega, Long tiempoCerrar) {
		super();
		this.nombreLocal = nombreLocal;
		this.nombrePlatillo = nombrePlatillo;
		this.precio = precio;
		this.express = express;
		this.telefono = telefono;
		this.tiempoEntrega = tiempoEntrega;
		this.tiempoCerrar = tiempoCerrar;
	}
    
	public PlatilloLocalDTO() {}
}
