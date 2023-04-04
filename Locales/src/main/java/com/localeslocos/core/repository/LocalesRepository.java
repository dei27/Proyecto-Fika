package com.localeslocos.core.repository;


import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.localeslocos.core.model.Locales;

public interface LocalesRepository extends JpaRepository<Locales, Integer> {
	
//	List<Locales> findByHorarioAperturaLessThanEqualAndHorarioCierreGreaterThanAndHorarioCierreLessThan(
//            LocalTime now1, LocalTime now2, LocalTime maxHorarioCierre);
	
	@Query("SELECT l FROM Locales l " +
		       "WHERE (l.horarioApertura <= l.horarioCierre AND :horaActual BETWEEN l.horarioApertura AND l.horarioCierre) " +
		       "OR (l.horarioApertura > l.horarioCierre AND (:horaActual >= l.horarioApertura OR :horaActual <= l.horarioCierre))")
	List<Locales> findLocalesAbiertosEnHora(@Param("horaActual") LocalTime horaActual);



}
