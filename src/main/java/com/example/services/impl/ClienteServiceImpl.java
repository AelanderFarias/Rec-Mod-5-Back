package com.example.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.ResourceNotFoundException;
import com.example.model.entities.Cliente;
import com.example.repositories.ClienteRepository;
import com.example.services.ClienteService;




@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository;

	
	@Override
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@Override
	public List<Cliente> getAllClientes() {
		return clienteRepository.findAll();
	}
	
	@Override
	public Cliente getClienteById(long id) {
		return clienteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Clientes", "id", id));
	}
	
	
	@Override
	public Cliente updateCliente(Cliente cliente, long id) {
		
		
		Cliente existingCliente = clienteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Cliente", "id", id));
		
		existingCliente.setPrimeiroNome(cliente.getPrimeiroNome());
		existingCliente.setUltimoNome(cliente.getUltimoNome());
		existingCliente.setEmail(cliente.getEmail());
		
		clienteRepository.save(existingCliente);
		return existingCliente;
	}
	
	
	@Override
	public void deleteCliente(long id) {
		clienteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Cliente", "id", id));
		
		clienteRepository.deleteById(id);
	}
	
}
