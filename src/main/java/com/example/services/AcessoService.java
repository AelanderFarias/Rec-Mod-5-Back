package com.example.services;

import com.example.model.dto.ClienteAcessoDTO;
import com.example.model.entities.Cliente;

public interface AcessoService {

	
	Cliente save(ClienteAcessoDTO clienteAcessoDTO );	
}
