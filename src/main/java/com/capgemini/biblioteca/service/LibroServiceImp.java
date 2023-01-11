package com.capgemini.biblioteca.service;

import java.util.List;
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

//		@Override
//		public Libro getLibroById(Long id) { //este es exclusivo para mostrar el detalle del item equivale al show de php)
//			
//			Optional<Libro> optionalLibro=this.libroRepository.findById(id);
//			//asi de este objeto Optional puedo crear un curso nulo para poder hacer una carga:
//			Libro libro = null;
//			if (optionalLibro.isPresent()) {
//				libro=optionalLibro.get();
//			}else {
//				throw new RuntimeException("El curso" + id + "no se encuentra");
//			}
//			return libro;
//		}
//
//		@Override
//		public void saveLibro(Libro libro) {
//			
//			this.libroRepository.save(libro);  //viene de CrudRepository
//			
//		}
//
//		@Override
//		public void deleteLibroById(Long id) {
//			
//			this.libroRepository.deleteById(id); //viene de CrudRepository
//			
//		}
		
}
