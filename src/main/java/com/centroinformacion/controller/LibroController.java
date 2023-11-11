package com.centroinformacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centroinformacion.entity.Libro;
import com.centroinformacion.service.LibroService;

@RestController
@RequestMapping("/rest/libro")
public class LibroController {


	@Autowired
	private LibroService service;
	
	@GetMapping()
	public List<Libro> lista(){
		return service.listaLibro();
	}
}
