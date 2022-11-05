package com.example.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.model.entities.Usuario;

public interface UsuarioService {
	
	BCryptPasswordEncoder sennhaEncoder();
	
	Usuario save(Usuario usuario);
}
