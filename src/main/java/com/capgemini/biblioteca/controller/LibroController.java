package com.capgemini.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.biblioteca.model.Libro;
import com.capgemini.biblioteca.service.LibroServiceImp;

@CrossOrigin //conecta Angular sin problema de CORS
@RestController //para hacer ApiRest
@RequestMapping("/api")
public class LibroController {

	@Autowired 
	LibroServiceImp libroService;
	
	@GetMapping(value="/libros")
	public List<Libro> getAllLibros(){
		return libroService.getAllLibros();
	}
	
	
}
