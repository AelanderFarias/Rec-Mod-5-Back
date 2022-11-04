package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.entities.Cliente;

@Repository

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	Cliente findByEmail(String email);
}
