package com.project.easystock.model;

import java.io.Serializable;

public class Fornecedor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
    private String nome;
    private String tipo;
    private String telefone;
    private String email;
    private String produtos;
    private String tempoEntrega;
    private String cnpj;
    private String metodoEnvio;
    
	public Fornecedor(int id, String nome, String tipo, String telefone, String email, String produtos,
			String tempoEntrega, String cnpj, String metodoEnvio) {

		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.telefone = telefone;
		this.email = email;
		this.produtos = produtos;
		this.tempoEntrega = tempoEntrega;
		this.cnpj = cnpj;
		this.metodoEnvio = metodoEnvio;
	}
	
	public Fornecedor() {
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}

	public String getTempoEntrega() {
		return tempoEntrega;
	}

	public void setTempoEntrega(String tempoEntrega) {
		this.tempoEntrega = tempoEntrega;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getMetodoEnvio() {
		return metodoEnvio;
	}

	public void setMetodoEnvio(String metodoEnvio) {
		this.metodoEnvio = metodoEnvio;
	}
	
}
