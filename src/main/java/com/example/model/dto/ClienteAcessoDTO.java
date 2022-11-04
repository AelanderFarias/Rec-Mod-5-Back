package com.example.model.dto;

import java.util.List;

import lombok.Data;

@Data

public class ClienteAcessoDTO {
	
	
	private Long idUser;
	
	private List<Long> idsAcesso;
}
