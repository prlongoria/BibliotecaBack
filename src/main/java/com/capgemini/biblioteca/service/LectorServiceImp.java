package com.capgemini.biblioteca.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	public Lector getLector(Long nSocio) {
		return this.lectorRepository.findById(nSocio).orElse(null);
	}

	public Lector addLector(Lector lector) {
		return this.lectorRepository.save(lector);
	}

	public Map<String, String> deleteLectorById(Long id) {

		Map<String, String> message = new HashMap<>();
		if (lectorRepository.findById(id).isPresent()) {
			lectorRepository.deleteById(id);
			message.put("message", "OK");
			return message;
		}
		message.put("message", "Error");
		return message;
	}

	public Lector updateLectorById(Long nSocio, Lector lectorUpdated) {

		Lector lector = lectorRepository.findById(nSocio).get();
		lector.setNombreLector(lectorUpdated.getNombreLector());
		lector.setTelefono(lectorUpdated.getTelefono());
		lector.setDireccion(lectorUpdated.getDireccion());
		lector.setnLibrosPrestados(lectorUpdated.getnLibrosPrestados());

		return lectorRepository.save(lector);
	}

}
