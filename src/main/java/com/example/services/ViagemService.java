package com.example.services;

import java.util.List;

import com.example.model.entities.Viagem;

public interface ViagemService {
	
	Viagem saveViagem(Viagem viagem);
	List<Viagem> getAllViagens();
	Viagem getViagemById(long id);
	Viagem updateViagem(Viagem viagem, long id);
	void deleteViagem(long id);

}
