package com.project.easystock.model;

import java.io.Serializable;

public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
    private String nome;
    private String tipo;
    private String endereco;
    private String cpfCnpj;
    private String contato;
    private String statusPedido;
    private String statusCliente;
    
	public Cliente(int id, String nome, String tipo, String endereco, String cpfCnpj, String contato,
			String statusPedido, String statusCliente) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.endereco = endereco;
		this.cpfCnpj = cpfCnpj;
		this.contato = contato;
		this.statusPedido = statusPedido;
		this.statusCliente = statusCliente;
	}
	
	public Cliente() {
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
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
