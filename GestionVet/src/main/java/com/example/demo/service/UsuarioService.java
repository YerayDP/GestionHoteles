package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;
@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository Repositorio;

	@Autowired
    BCryptPasswordEncoder passwordEncoder;
	public Usuario Registrar(Usuario Usu) {
		
		Usu.setPassword(passwordEncoder.encode(Usu.getPassword()));

		
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
