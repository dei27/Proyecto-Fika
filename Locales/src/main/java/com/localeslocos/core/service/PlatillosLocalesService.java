package com.localeslocos.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.localeslocos.core.repository.PlatillosLocalesRepository;

@Service
public class PlatillosLocalesService {

	@Autowired
    private PlatillosLocalesRepository platillosLocalesRepository;
	
	public List<Object[]> obtenerLocalesByPlatillo(Long idPlatillo) {
		 return platillosLocalesRepository.obtenerInformacionPlatillo(idPlatillo);
    }
	
	public List<Object[]> obtenerPlatillosDisponibles() {
		 return platillosLocalesRepository.obtenerPlatillosDisponibles();
		
		}
	}