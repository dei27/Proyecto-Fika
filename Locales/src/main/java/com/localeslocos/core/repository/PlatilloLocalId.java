package com.localeslocos.core.repository;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PlatilloLocalId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "id_local")
	private Long idLocal;

	@Column(name = "id_platillo")
	private Long idPlatillo;

	public Long getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(Long idLocal) {
		this.idLocal = idLocal;
	}

	public Long getIdPlatillo() {
		return idPlatillo;
	}

	public void setIdPlatillo(Long idPlatillo) {
		this.idPlatillo = idPlatillo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
