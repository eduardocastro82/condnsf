package com.bean;

public class Pessoa {

	private int id;
	private String nome;
	private String sobrenome;
	private String rg;
	private String cpf;
	private char categoria;
	
	public Pessoa() {
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
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public char getCategoria() {
		return categoria;
	}
	
	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}
}
