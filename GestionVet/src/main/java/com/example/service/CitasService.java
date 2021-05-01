package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.CitasRepository;
@Service
public class CitasService {
	
	@Autowired
	CitasRepository Repositorio;
	
	
	
}
