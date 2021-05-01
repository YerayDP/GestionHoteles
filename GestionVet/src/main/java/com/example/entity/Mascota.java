package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Mascota {
	
	
	public Mascota() {
		super();
	}
	public Mascota(int id, String nombre, String tipo, String raza, Date fechaNacimiento, String foto,
			String idCliente) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.raza = raza;
		this.fechaNacimiento = fechaNacimiento;
		this.foto = foto;
		this.idCliente = idCliente;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	@Id
	@GeneratedValue
	@Column(length=11)
	private int id;
	@Column(length=30)
	private String nombre;
	@Column(length=30)
	private String tipo;
	@Column(length=30)
	private String raza;
	@Column(length=11)
	private Date fechaNacimiento;
	@Column(length=100)
	private String foto;
	@Column(length=11)
	private String idCliente;
	
	
	
}
