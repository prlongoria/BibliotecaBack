package com.capgemini.biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="lectores")
public class Lector {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long nSocio;
	
	@Column
	private String nombreLector;
	
	@Column
	private int telefono;
	
	@Column
	private String direccion;
	
	@Column
	private int nLibrosPrestados;
	
	//Constructores;
	public Lector() {
		super();
	}

	public Lector(Long nSocio, String nombreLector, int telefono, String direccion, int nLibrosPrestados) {
		super();
		this.nSocio = nSocio;
		this.nombreLector = nombreLector;
		this.telefono = telefono;
		this.direccion = direccion;
		this.nLibrosPrestados = nLibrosPrestados;
	}

	//Getters, setters
	public Long getnSocio() {
		return nSocio;
	}

	public void setnSocio(Long nSocio) {
		this.nSocio = nSocio;
	}

	public String getNombreLector() {
		return nombreLector;
	}

	public void setNombreLector(String nombreLector) {
		this.nombreLector = nombreLector;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getnLibrosPrestados() {
		return nLibrosPrestados;
	}

	public void setnLibrosPrestados(int nLibrosPrestados) {
		this.nLibrosPrestados = nLibrosPrestados;
	}
	
}
