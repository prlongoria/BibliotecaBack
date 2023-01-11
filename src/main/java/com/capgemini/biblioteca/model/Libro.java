package com.capgemini.biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="libros")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nombreLibro;
	
	@Column
	private String genero;
	
	@Column
	private String editorial;
	
	@Column
	private String anyo;
	
	@Column
	private String autor;
	
	@Column
	private int numeroCopias;
	
	//Constructores:
	public Libro() {
		super();
	}

	public Libro(Long id, String nombreLibro, String genero, String editorial, String anyo, String autor, int numeroCopias) {
		this.id = id;
		this.nombreLibro = nombreLibro;
		this.genero = genero;
		this.editorial = editorial;
		this.anyo = anyo;
		this.autor = autor;
		this.numeroCopias = numeroCopias;
	}

	//Getters, setters:
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getAnyo() {
		return anyo;
	}

	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroCopias() {
		return numeroCopias;
	}

	public void setNumeroCopias(int numeroCopias) {
		this.numeroCopias = numeroCopias;
	}

	
}
