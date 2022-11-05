package com.example.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.entities.Usuario;
import com.example.repositories.UsuarioRepository;
import com.example.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	UsuarioRepository userRepository;
	
	@Override
	public Usuario save(Usuario usuario) {
		
		Usuario existsUsuario = userRepository.findByEmail(usuario.getEmail());
		
		if (existsUsuario != null) {
			throw new Error ("Usuario existente.");
		}
		
		Usuario usuarioCriado = userRepository.save(usuario);
		
		return usuarioCriado;
	}
	
}
