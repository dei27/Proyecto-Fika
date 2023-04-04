package com.localeslocos.core.model;

import java.math.BigDecimal;

import com.localeslocos.core.repository.BebidaLocalId;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bebidaslocales")
public class BebidasLocales {

	@EmbeddedId
	private BebidaLocalId id;

	@Column(name = "precio", precision = 10, scale = 2)
	private BigDecimal precio;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_local", insertable = false, updatable = false)
	private Locales local;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_bebida", insertable = false, updatable = false)
	private Bebidas bebida;

	public BebidasLocales(BigDecimal precio, Locales local, Bebidas bebida) {
		this.precio = precio;
		this.local = local;
		this.bebida = bebida;
	}

	public BebidasLocales() {}

	public BebidaLocalId getId() {
		return id;
	}

	public void setId(BebidaLocalId id) {
		this.id = id;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Locales getLocal() {
		return local;
	}

	public void setLocal(Locales local) {
		this.local = local;
	}

	public Bebidas getBebida() {
		return bebida;
	}

	public void setBebida(Bebidas bebida) {
		this.bebida = bebida;
	}
	
	

}
