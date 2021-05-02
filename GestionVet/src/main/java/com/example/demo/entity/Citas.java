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

public class Citas {
	
	
	public Citas() {
		super();
	}
	public Citas(int id, Mascota idMascota, Usuario idVeterinario, Date fecha, String motivo, String informe,
			Boolean realizada) {
		super();
		this.id = id;
		this.idMascota = idMascota;
		this.idVeterinario = idVeterinario;
		this.fecha = fecha;
		this.motivo = motivo;
		this.informe = informe;
		this.realizada = realizada;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Mascota getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(Mascota idMascota) {
		this.idMascota = idMascota;
	}
	public Usuario getIdVeterinario() {
		return idVeterinario;
	}
	public void setIdVeterinario(Usuario idVeterinario) {
		this.idVeterinario = idVeterinario;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getInforme() {
		return informe;
	}
	public void setInforme(String informe) {
		this.informe = informe;
	}
	public Boolean getRealizada() {
		return realizada;
	}
	public void setRealizada(Boolean realizada) {
		this.realizada = realizada;
	}
	@Id
	@GeneratedValue
	@Column(length=11)
	private int id;
	@ManyToOne
	@JoinColumn(name="idMascota",foreignKey=@ForeignKey(name="idMascota_FK"),nullable=false)
	private Mascota idMascota;
	@ManyToOne
	@JoinColumn(name="idVeterinario",foreignKey=@ForeignKey(name="idVeterinario_FK"),nullable=false)
	private Usuario idVeterinario;
	@Column(length=11)
	private Date fecha;
	@Column(length=100)
	private String motivo;
	@Column(length=100)
	private String informe;
	@Column(length=11)
	private Boolean realizada;

	
	
}
