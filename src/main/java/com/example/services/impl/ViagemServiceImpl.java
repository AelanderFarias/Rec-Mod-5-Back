package com.example.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.ResourceNotFoundException;
import com.example.model.entities.Viagem;
import com.example.repositories.ViagemRepository;
import com.example.services.ViagemService;



@Service
public class ViagemServiceImpl implements ViagemService{
	
	@Autowired
	private ViagemRepository viagemRepository;

	
	@Override
	public Viagem saveViagem(Viagem viagem) {
		return viagemRepository.save(viagem);
	}
	
	@Override
	public List<Viagem> getAllViagens() {
		return viagemRepository.findAll();
	}
	
	@Override
	public Viagem getViagemById(long id) {
		return viagemRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Viagens", "id", id));
	}
	
	
	@Override
	public Viagem updateViagem(Viagem viagem, long id) {
		
		
		Viagem existingViagem = viagemRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Viagem", "id", id));
		
		existingViagem.setDestino(viagem.getDestino());
		existingViagem.setPartida(viagem.getPartida());
		existingViagem.setValor(viagem.getValor());
		existingViagem.setTransporte(viagem.getTransporte());
		
		viagemRepository.save(existingViagem);
		return existingViagem;
	}
	
	
	@Override
	public void deleteViagem(long id) {
		viagemRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Viagem", "id", id));
		
		viagemRepository.deleteById(id);
	}

}
