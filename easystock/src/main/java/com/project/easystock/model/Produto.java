package com.project.easystock.model;

import java.io.Serializable;

public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;
    private Long id;
    private String nome;
    private String categoria;
    private Double precoVenda;
    private Double precoCusto;
    private Integer quantidadeEstoque;
    private String fornecedor;
    private String dataEntrada; //justar date
    private String dataValidade; // ajustar date
    private String LocArmazem;
    private String codBarras;
    private String Peso;
    private String dimensoes;
    private String statusProduto;
    private String sku;
    private String statusPedido;
    private String dataPedido; // ajustar date
    
    
	public Produto(Long id, String nome, String categoria, Double precoVenda, Double precoCusto,
			Integer quantidadeEstoque, String fornecedor, String dataEntrada, String dataValidade, String locArmazem,
			String codBarras, String peso, String dimensoes, String statusProduto, String sku, String statusPedido,
			String dataPedido) {
		
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.precoVenda = precoVenda;
		this.precoCusto = precoCusto;
		this.quantidadeEstoque = quantidadeEstoque;
		this.fornecedor = fornecedor;
		this.dataEntrada = dataEntrada;
		this.dataValidade = dataValidade;
		LocArmazem = locArmazem;
		this.codBarras = codBarras;
		Peso = peso;
		this.dimensoes = dimensoes;
		this.statusProduto = statusProduto;
		this.sku = sku;
		this.statusPedido = statusPedido;
		this.dataPedido = dataPedido;
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

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getLocArmazem() {
		return LocArmazem;
	}

	public void setLocArmazem(String locArmazem) {
		LocArmazem = locArmazem;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public String getPeso() {
		return Peso;
	}

	public void setPeso(String peso) {
		Peso = peso;
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

	public String getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}

	public String getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}
    
}
