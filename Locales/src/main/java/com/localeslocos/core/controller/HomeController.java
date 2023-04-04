package com.localeslocos.core.controller;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.localeslocos.core.model.PlatilloLocalDTO;
import com.localeslocos.core.model.PlatillosDTO;
import com.localeslocos.core.repository.PlatilloLocalId;
import com.localeslocos.core.service.LocalesService;
import com.localeslocos.core.service.PlatilloService;
import com.localeslocos.core.service.PlatillosLocalesService;

@Controller
public class HomeController {
	

	@Autowired
	private PlatilloService platillo;
	
	@Autowired
	private LocalesService locales;
	
	@Autowired
	private PlatillosLocalesService platillosLocales;
	
	private LocalTime horaActual = LocalTime.now();
	
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView model = new ModelAndView("/index");
		List<Object[]> platos =  platillosLocales.obtenerPlatillosDisponibles();
		List<PlatillosDTO> platillosLocales = new ArrayList<>();
	    for (Object[] obj : platos) {
	    	PlatillosDTO dto = new PlatillosDTO();
	        dto.setIdPlatillo((Long) obj[0]);
	        dto.setNombrePlatillo((String) obj[1]); 
	        platillosLocales.add(dto);
	    }
		model.addObject("platillo",platillo.buscarPorNombre("Tortillas"));
		model.addObject("locales",locales.obtenerDisponibles(horaActual));
		model.addObject("platillos",platillosLocales);
		return model;
	}
	
	@GetMapping("/localesPlatillos")
	public ModelAndView otraPagina(@RequestParam(defaultValue = "1") Long id, @ModelAttribute PlatilloLocalId idPlatillo, Model model) {
		ModelAndView mav = new ModelAndView("localesPlatillos");
		idPlatillo.setIdPlatillo(id);
		List<Object[]> platos =  platillosLocales.obtenerLocalesByPlatillo(idPlatillo.getIdPlatillo());
		List<PlatilloLocalDTO> platillosLocales = new ArrayList<>();
	    for (Object[] obj : platos) {
	        PlatilloLocalDTO dto = new PlatilloLocalDTO();
	        dto.setNombreLocal((String) obj[0]);
	        dto.setNombrePlatillo((String) obj[1]);
	        dto.setPrecio((BigDecimal) obj[2]);
	        dto.setExpress((Boolean) obj[3]);
	        dto.setTelefono((String) obj[4]);
	        dto.setTiempoEntrega((Integer) obj[5]);
	        dto.setTiempoCerrar((Long) obj[6]);   
	        platillosLocales.add(dto);
	    }
	    mav.addObject("platillosLocales", platillosLocales);
	    return mav;
	}
	
	
//	@GetMapping("/localesPlatillos")
//	public ModelAndView otraPagina(@RequestParam(defaultValue = "1") Long id, @ModelAttribute PlatilloLocalId idPlatillo) {
//	    idPlatillo.setIdPlatillo(id);
//	    List<Object[]> platos = platillosLocales.obtenerLocalesByPlatillo(idPlatillo.getIdPlatillo());
//	    ModelAndView modelAndView = new ModelAndView("localesPlatillos");
//	    modelAndView.addObject("platillosLocales", platos);
//	    return modelAndView;
//	}
	
}
