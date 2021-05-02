package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Mascota;
import com.example.demo.repository.MascotaRepository;
@Service
public class MascotaService {
	
	@Autowired
	MascotaRepository Repositorio;
	
	public Mascota Insertar(Mascota Masco) {
		
		
		return Repositorio.save(Masco);
		
	}
	public void Borrar(int B) {
		
		
		Repositorio.deleteById(B);
	}
	public void Borrar(Mascota Masco) {
		
		
		Repositorio.delete(Masco);
	}
	
	public Mascota FindByID(int id) {
		
		
		
		return Repositorio.findById(id).orElse(null);
	}
	
}
