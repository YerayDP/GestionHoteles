package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Citas;
import com.example.demo.repository.CitasRepository;
@Service
public class CitasService {
	
	@Autowired
	CitasRepository Repositorio;
	
	public Citas Insertar(Citas Ci) {
		
		
		return Repositorio.save(Ci);
		
	}
	public void Borrar(int B) {
		
		
		Repositorio.deleteById(B);
	}
	public void Borrar(Citas Ci) {
		
		
		Repositorio.delete(Ci);
	}
	
	public Citas FindByID(int id) {
		
		
		
		return Repositorio.findById(id).orElse(null);
	}
	
}
