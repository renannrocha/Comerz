package com.project.easystock.model;

import java.io.Serializable;

public class Venda implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long idProduto;
	private Long idCliente;
	private Integer quantidade;
	private Double precoUnitario;
	private Double totalVenda;
	private String dataVenda; // ajustar date
	private String enderecoEntrega;
	private String dtaEntregaEx;
	private String dtaEntregaExata;
	private String statusPag;
	private String statusEntrega;
	private Double custoEnvio;
	
	public Venda(Long id, Long idProduto, Long idCliente, Integer quantidade, Double precoUnitario, Double totalVenda,
			String dataVenda, String enderecoEntrega, String dtaEntregaEx, String dtaEntregaExata, String statusPag,
			String statusEntrega, Double custoEnvio) {
		
		this.id = id;
		this.idProduto = idProduto;
		this.idCliente = idCliente;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
		this.totalVenda = totalVenda;
		this.dataVenda = dataVenda;
		this.enderecoEntrega = enderecoEntrega;
		this.dtaEntregaEx = dtaEntregaEx;
		this.dtaEntregaExata = dtaEntregaExata;
		this.statusPag = statusPag;
		this.statusEntrega = statusEntrega;
		this.custoEnvio = custoEnvio;
	}
	
	public Venda() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Double getTotalVenda() {
		return totalVenda;
	}

	public void setTotalVenda(Double totalVenda) {
		this.totalVenda = totalVenda;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public String getDtaEntregaEx() {
		return dtaEntregaEx;
	}

	public void setDtaEntregaEx(String dtaEntregaEx) {
		this.dtaEntregaEx = dtaEntregaEx;
	}

	public String getDtaEntregaExata() {
		return dtaEntregaExata;
	}

	public void setDtaEntregaExata(String dtaEntregaExata) {
		this.dtaEntregaExata = dtaEntregaExata;
	}

	public String getStatusPag() {
		return statusPag;
	}

	public void setStatusPag(String statusPag) {
		this.statusPag = statusPag;
	}

	public String getStatusEntrega() {
		return statusEntrega;
	}

	public void setStatusEntrega(String statusEntrega) {
		this.statusEntrega = statusEntrega;
	}

	public Double getCustoEnvio() {
		return custoEnvio;
	}

	public void setCustoEnvio(Double custoEnvio) {
		this.custoEnvio = custoEnvio;
	}
	
}
