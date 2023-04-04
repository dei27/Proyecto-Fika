package com.localeslocos.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.localeslocos.core.model.Platillos;
import com.localeslocos.core.repository.PlatilloRepository;

@Service
public class PlatilloService {
	
	@Autowired
    private PlatilloRepository platilloRepository;

    public Platillos buscarPorId(Long id) {
        return platilloRepository.findById(id).orElse(null);
    }
    
    public Platillos buscarPorNombre(String nombrePlatillo) {
        return platilloRepository.findByNombrePlatillo(nombrePlatillo);
    }
    
    public List<Platillos> getAll() {
    	return platilloRepository.findAll();
    }
}
