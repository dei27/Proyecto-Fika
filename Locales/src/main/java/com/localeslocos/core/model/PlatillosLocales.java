package com.localeslocos.core.model;

import java.math.BigDecimal;

import com.localeslocos.core.repository.PlatilloLocalId;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "platillos_Locales")
public class PlatillosLocales {

	@EmbeddedId
	private PlatilloLocalId id;

	@Column(name = "precio", precision = 10, scale = 2)
	private BigDecimal precio;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_local", insertable = false, updatable = false)
	private Locales local;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_platillo", insertable = false, updatable = false)
	private Platillos platillo;
	
	public PlatillosLocales() {}

	public PlatillosLocales(BigDecimal precio, Locales local, Platillos platillo) {
		this.precio = precio;
		this.local = local;
		this.platillo = platillo;
	}

	public PlatilloLocalId getId() {
		return id;
	}

	public void setId(PlatilloLocalId id) {
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

	public Platillos getPlatillo() {
		return platillo;
	}

	public void setPlatillo(Platillos platillo) {
		this.platillo = platillo;
	}
	
}
