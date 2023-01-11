package com.capgemini.biblioteca.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.biblioteca.model.Lector;
import com.capgemini.biblioteca.model.Libro;
import com.capgemini.biblioteca.service.LectorServiceImp;

@CrossOrigin
@RestController
@RequestMapping(path="/api")
public class LectorController {
	
	@Autowired
	 LectorServiceImp lectorService;
	
	@GetMapping(value="/lectores")
	public List<Lector> getAllLectores(){
		return lectorService.getAllLectores();
	}
	
	@PostMapping(value="/lectores")
	public Lector addLibro(@RequestBody Lector lectorNuevo) {
		Lector lector = lectorService.addLector(lectorNuevo);
		return lector;
	}
	
	@DeleteMapping(path = "/lectores/{id}")
	public Map<String, String> deleteLectorById(@PathVariable Long id){
		Map<String, String> message = lectorService.deleteLectorById(id);
		return message;
	}
}
