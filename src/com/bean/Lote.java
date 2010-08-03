package com.bean;

public class Lote {

	private int id;
	private String nome;
	private int proprietarioId;
	private int inquilinoId;
		
	public Lote() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getProprietarioId() {
		return proprietarioId;
	}

	public void setProprietarioId(int proprietarioId) {
		this.proprietarioId = proprietarioId;
	}

	public int getInquilinoId() {
		return inquilinoId;
	}

	public void setInquilinoId(int inquilinoId) {
		this.inquilinoId = inquilinoId;
	}
}
