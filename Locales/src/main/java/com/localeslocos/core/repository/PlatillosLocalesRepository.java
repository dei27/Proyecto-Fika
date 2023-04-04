package com.localeslocos.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.localeslocos.core.model.PlatillosLocales;

public interface PlatillosLocalesRepository extends JpaRepository<PlatillosLocales, PlatilloLocalId> {

	@Query("SELECT l.nombreLocal, p.nombrePlatillo, pl.precio, l.express, l.telefono, l.tiempoEntrega, TIMESTAMPDIFF(MINUTE, CURTIME(), l.horarioCierre) AS tiempoCerrar " +
	           "FROM PlatillosLocales pl " +
	           "INNER JOIN pl.local l " +
	           "INNER JOIN pl.platillo p " +
	           "WHERE pl.id.idPlatillo = :idPlatillo AND l.estaAbierto = true")
	List<Object[]> obtenerInformacionPlatillo(@Param("idPlatillo") Long idPlatillo);
	
	@Query("SELECT DISTINCT p.id, p.nombrePlatillo FROM PlatillosLocales pl "
            + "JOIN pl.local l "
            + "JOIN pl.platillo p "
            + "WHERE l.estaAbierto = true")
    List<Object[]> obtenerPlatillosDisponibles();

}
