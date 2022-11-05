package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.dto.UsuarioAcessoDTO;
import com.example.model.entities.Usuario;
import com.example.services.AcessoService;
import com.example.services.UsuarioService;

@RestController
@RequestMapping("/cliente")
public class UsuarioController {
	@Autowired
	UsuarioService clienteService;
	
	@Autowired
	AcessoService acessoService;
	
	@PostMapping("/create")
	public Usuario save(@RequestBody Usuario cliente) {
		return clienteService.save(cliente);
	}
	
	public Usuario acesso (@RequestBody UsuarioAcessoDTO clienteAcessoDTO) {
		return acessoService.save (clienteAcessoDTO); 
	}
}
