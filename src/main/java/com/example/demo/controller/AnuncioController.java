package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Anuncios;
import com.example.demo.entity.Usuarios;
import com.example.demo.service.AnunciosService;



public class AnuncioController {
	
	@Controller
	@RequestMapping(value = "/anuncios") 

	public class CourseController {
	private static final String ANUNCIO_VIEW="anuncio";
	@Autowired
	@Qualifier("AnunciosServiceImpl")
	private AnunciosService anuncioServices;
	//Métodos para listar
	@GetMapping("/listanuncio")
	public ModelAndView listAllAnuncio() {
	ModelAndView mav=new ModelAndView(ANUNCIO_VIEW);
	mav.addObject("anuncio", new Anuncios());
	mav.addObject("anuncios	", anuncioServices.listAllAnuncios());
	return mav;
	}
	//Método para añadir curso
	@PostMapping("/addanuncio")
	public String addAnuncios(@ModelAttribute("anuncio") Anuncios anuncio) {
	anuncioServices.addAnuncios(anuncio);
	return "redirect:/anuncio/listanuncio";
	}


}
}
