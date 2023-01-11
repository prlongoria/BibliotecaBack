package com.capgemini.biblioteca.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.capgemini.biblioteca.model.Libro;
import com.capgemini.biblioteca.repository.LibroRepository;



@Service
public class LibroServiceImp {

	//Hago el patron de DEPENDENCY INJECTION	
	
		@Autowired
		private LibroRepository libroRepository;
		
		
		public List<Libro> getAllLibros() {
			
			return this.libroRepository.findAll();  //viene de JpaRepository
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
			
			//Optional<Libro> libroUpdate = libroRepository.findById(id);
			
			return libroRepository.findById(id).map(libro -> {
				libro.setNombreLibro(libroUpdated.getNombreLibro());
				libro.setGenero(libroUpdated.getGenero());
				libro.setEditorial(libroUpdated.getEditorial());
				libro.setAnyo(libroUpdated.getAnyo());
				libro.setAutor(libroUpdated.getAutor());
				libro.setNumeroCopias(libroUpdated.getNumeroCopias());
				
			}).orElseGet(() -> {
				
				return libroRepository.save(libroUpdated);
			});
			
					
		}
		

}
