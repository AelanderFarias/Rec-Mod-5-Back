package com.example.model.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "clientes")

public class Cliente {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private String senha;
	
	@ManyToMany
	private List<Acesso> acessos;
}
