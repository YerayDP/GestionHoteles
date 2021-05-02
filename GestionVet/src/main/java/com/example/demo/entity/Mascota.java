package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class Mascota {
	
	
	public Mascota() {
		super();
	}
	public Mascota(int id, String nombre, String tipo, String raza, Date fechaNacimiento, String foto,
			Usuario idCliente) {
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
	public Usuario getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Usuario idCliente) {
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
	@ManyToOne
	@JoinColumn(name="idCliente",foreignKey=@ForeignKey(name="idCliente_FK"),nullable=false)
	private Usuario idCliente;
	
	
	
	
}
