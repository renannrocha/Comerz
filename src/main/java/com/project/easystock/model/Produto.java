package com.project.easystock.model;

import java.io.Serializable;
import java.util.Date;

public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String categoria;
	private Double precoVenda;
	private Double precoCusto;
	private Integer quantidadeEstoque;
	private String fornecedor;
	private Date dataEntrada; // ajustado para Date
	
	private String localizacao;
	private String codigoBarras;
	private Double peso; // ajustado para Double
	private String dimensoes;
	private String statusProduto;
	private String sku;
	private String marca;
	public Produto(Long id, String nome, String categoria, Double precoVenda, Double precoCusto,
			Integer quantidadeEstoque, String fornecedor, Date dataEntrada, String localizacao, String codigoBarras,
			Double peso, String dimensoes, String statusProduto, String sku, String marca) {

		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.precoVenda = precoVenda;
		this.precoCusto = precoCusto;
		this.quantidadeEstoque = quantidadeEstoque;
		this.fornecedor = fornecedor;
		this.dataEntrada = dataEntrada;
		this.localizacao = localizacao;
		this.codigoBarras = codigoBarras;
		this.peso = peso;
		this.dimensoes = dimensoes;
		this.statusProduto = statusProduto;
		this.sku = sku;
		this.marca = marca;
	}
	
	public Produto() {
		
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public Double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(Double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(String dimensoes) {
		this.dimensoes = dimensoes;
	}

	public String getStatusProduto() {
		return statusProduto;
	}

	public void setStatusProduto(String statusProduto) {
		this.statusProduto = statusProduto;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
}