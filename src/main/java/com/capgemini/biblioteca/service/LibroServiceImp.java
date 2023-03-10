package com.capgemini.biblioteca.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.biblioteca.model.Libro;
import com.capgemini.biblioteca.repository.LibroRepository;

@Service
public class LibroServiceImp {

	// Hago el patron de DEPENDENCY INJECTION

	@Autowired
	private LibroRepository libroRepository;

	public List<Libro> getAllLibros() {

		return this.libroRepository.findAll(); // viene de JpaRepository
	}

	public Libro getLibro(Long id) {
		return this.libroRepository.findById(id).orElse(null);
	}

	public Libro addLibro(Libro libro) {
		return this.libroRepository.save(libro);

	}

	public Map<String, String> deleteLibroById(Long id) {

		Map<String, String> message = new HashMap<>();
		if (libroRepository.findById(id).isPresent()) {
			libroRepository.deleteById(id);
			message.put("message", "OK");
			return message;
		}
		message.put("message", "Error");
		return message;
	}

	public Libro updateLibroById(Long id, Libro libroUpdated) {

		Libro libro = libroRepository.findById(id).get();
		libro.setNombreLibro(libroUpdated.getNombreLibro());
		libro.setGenero(libroUpdated.getGenero());
		libro.setEditorial(libroUpdated.getEditorial());
		libro.setAnyo(libroUpdated.getAnyo());
		libro.setAutor(libroUpdated.getAutor());
		libro.setNumeroCopias(libroUpdated.getNumeroCopias());

		return libroRepository.save(libro);
	}

}
