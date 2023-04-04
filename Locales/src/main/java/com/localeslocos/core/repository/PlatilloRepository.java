package com.localeslocos.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.localeslocos.core.model.Platillos;

public interface PlatilloRepository extends JpaRepository<Platillos, Long> {

	Platillos findByNombrePlatillo(String nombrePlatillo);
}
