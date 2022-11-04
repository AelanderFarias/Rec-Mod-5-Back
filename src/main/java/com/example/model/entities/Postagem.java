package com.example.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "postagens")
@Data

public class Postagem {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String titulo;
	
	private String descricao;
}
