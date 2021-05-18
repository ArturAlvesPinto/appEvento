package com.eventoapp.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Criação de uma entidade com @Entity
@Entity
@Table(name="Evento")
public class Evento implements Serializable{
	
	private static final long serialVersionUID = 1L; // Identifica se a versão do objeto é compatível com a versão da classe que serializou este objetos
	
	// Primary Key da table
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // Gera ID automaticamente.
	private long id;
		
	// Atributos da class Evento
	private String nome;
	private String local;
	private String data;
	private String horario;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
}
