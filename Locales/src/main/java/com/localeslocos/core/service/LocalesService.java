package com.localeslocos.core.service;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.localeslocos.core.model.Locales;
import com.localeslocos.core.repository.LocalesRepository;

@Service
public class LocalesService {

	@Autowired
	private LocalesRepository localRepo;
	
//	public List<Locales> obtenerLocalesAbiertos(){
//		LocalTime now = LocalTime.now();
//        LocalTime maxHorarioCierre = LocalTime.of(4, 0);
//        return localRepo.findByHorarioAperturaLessThanEqualAndHorarioCierreGreaterThanAndHorarioCierreLessThan(now, now, maxHorarioCierre);
//	}
	
	public List<Locales> obtenerTodos(){
		return localRepo.findAll();
	}
	
	public List<Locales> obtenerDisponibles(@Param("horaActual") LocalTime horaActual){
		
		List<Locales> locales = localRepo.findAll();
        
        for (Locales local : locales) {
            local.setEstaAbierto(false);
            localRepo.save(local);
        }
		
		locales = localRepo.findLocalesAbiertosEnHora(horaActual);
        
        for (Locales local : locales) {
            local.setEstaAbierto(true);
            localRepo.save(local);
        }
        
		return localRepo.findLocalesAbiertosEnHora(horaActual);
	}
}
