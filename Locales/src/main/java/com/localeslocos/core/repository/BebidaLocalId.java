package com.localeslocos.core.repository;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class BebidaLocalId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "id_local")
	private Long idLocal;

	@Column(name = "id_bebida")
	private Long idBebida;

	public Long getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(Long idLocal) {
		this.idLocal = idLocal;
	}

	public Long getIdBebida() {
		return idBebida;
	}

	public void setIdBebida(Long idBebida) {
		this.idBebida = idBebida;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
