package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Usuario {
	
	
	@Id
	@GeneratedValue
	@Column(length=11)
	private int id;
	@Column(length=30)
	private String nombre;
	@Column(length=50)
	private String apellidos;
	@Column(length=10)
	private String telefono;
	@Column(length=30)
	private String username;
	@Column()
	private String password;
	
	private String Role;
	private Boolean Activado;
	@OneToMany
	private List <Mascota> ListaMascota;
	
	public Usuario() {
		super();
	}

	public Usuario(int id, String nombre, String apellidos, String telefono, String username, String password,
			String role, Boolean activado, List<Mascota> listaMascota) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.username = username;
		this.password = password;
		Role = role;
		Activado = activado;
		ListaMascota = listaMascota;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public Boolean getActivado() {
		return Activado;
	}

	public void setActivado(Boolean activado) {
		Activado = activado;
	}

	public List<Mascota> getListaMascota() {
		return ListaMascota;
	}

	public void setListaMascota(List<Mascota> listaMascota) {
		ListaMascota = listaMascota;
	}
}
