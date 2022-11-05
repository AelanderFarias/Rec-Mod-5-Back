package com.example.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="viagem")
public class Viagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "destino", nullable = false)
	private String destino;
	
	@Column(name = "partida", nullable = false)
	private String partida;
	
	@Column(name = "valor", nullable = false)
	private String valor;
	
	@Column(name = "transporte", nullable = false)
	private String transporte;

}
