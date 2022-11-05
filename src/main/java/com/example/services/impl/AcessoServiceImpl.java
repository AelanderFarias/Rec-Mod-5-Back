package com.example.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.dto.UsuarioAcessoDTO;
import com.example.model.entities.Acesso;
import com.example.model.entities.Usuario;
import com.example.repositories.UsuarioRepository;
import com.example.services.AcessoService;

@Service
public class AcessoServiceImpl implements AcessoService{
	
	@Autowired
	UsuarioRepository clienteRepository; 
	
	@Override
	public Usuario save(UsuarioAcessoDTO clienteAcessoDTO) {
		
		Optional<Usuario> clienteExists = clienteRepository.findById(clienteAcessoDTO.getIdUser());
		
		List<Acesso> acessos = new ArrayList<>();
		
		if (clienteExists.isEmpty()) {
			throw new Error ("Cliente não encontrado.");
		}
		
		acessos = clienteAcessoDTO.getIdsAcesso() .stream() .map(acesso -> {return new Acesso(acesso);}).collect(Collectors.toList());
				
		Usuario cliente = clienteExists.get();
		
		cliente.setAcessos(acessos);
		
		clienteRepository.save(cliente);
		
		return null;
	}
	
}
