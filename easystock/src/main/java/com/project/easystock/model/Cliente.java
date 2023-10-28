package com.project.easystock.model;

import java.io.Serializable;

public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String tipo;
	private String endereco;
	private String cpf_cnpj;
	private String contato;
	private String statusPedido;
	private String statusCliente;
	
	public Cliente(Long id, String nome, String tipo, String endereco, String cpf_cnpj, String contato,
			String statusPedido, String statusCliente) {

		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.endereco = endereco;
		this.cpf_cnpj = cpf_cnpj;
		this.contato = contato;
		this.statusPedido = statusPedido;
		this.statusCliente = statusCliente;
		
	}
	
	public Cliente(){
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}

	public String getStatusCliente() {
		return statusCliente;
	}

	public void setStatusCliente(String statusCliente) {
		this.statusCliente = statusCliente;
	}
		
}
