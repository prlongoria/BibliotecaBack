package com.capgemini.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.biblioteca.model.Lector;

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
}
