package com.capgemini.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.biblioteca.model.Lector;
import com.capgemini.biblioteca.repository.LectorRepository;

@Service
public class LectorServiceImp {

	@Autowired
	private LectorRepository lectorRepository;
	
	public List<Lector> getAllLectores() {
		
		return this.lectorRepository.findAll();  
	}
}
