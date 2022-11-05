package com.example.services;

import com.example.model.dto.UsuarioAcessoDTO;
import com.example.model.entities.Usuario;

public interface AcessoService {

	
	Usuario save(UsuarioAcessoDTO clienteAcessoDTO );	
}
