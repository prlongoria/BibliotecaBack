package com.capgemini.biblioteca.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping(value="/libros")
	public Libro addLibro(@RequestBody Libro libroNuevo) {
		Libro libro = libroService.addLibro(libroNuevo);
		return libro;
	}
	
	@DeleteMapping(path = "/libros/{id}")
	public Map<String, String> deleteLibroById(@PathVariable Long id){
		Map<String, String> message = libroService.deleteLibroById(id);
		return message;
	}
	
	@PutMapping(path = "/libros/{id}")
	public Libro updateLibroById(@PathVariable Long id, @RequestBody Libro libro) {
		return libroService.updateLibroById(id, libro);
	}
}
