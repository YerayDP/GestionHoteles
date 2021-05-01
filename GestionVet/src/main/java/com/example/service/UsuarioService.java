package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.entity.Usuario;
import com.example.repository.UsuarioRepository;
@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository Repositorio;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	public Usuario Registrar(Usuario Usu) {
		
		
		
		
		return Repositorio.save(Usu);

	}
	
	public void Borrar(int B) {
		
		
		Repositorio.deleteById(B);
	}
	public void Borrar(Usuario Usu) {
		
		
		Repositorio.delete(Usu);
	}
	
	public Usuario FindByID(int id) {
		
		
		
		return Repositorio.findById(id).orElse(null);
	}
	
}
