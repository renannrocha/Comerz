package com.project.easystock.model;

import java.io.Serializable;

public class Pedido implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long idCliente;
	private Long idProduto;
	private String dtaPedido; // ajustar date
	private String dtaEntregaEx; // ajustar date
	private String dtaEntregaReal; // ajustar date
	private Integer quantidade;
	private String statusPedido;
	private Double precoUnitario;
	private Double TotalPedido;
	private String enderecoEntrega;
	private Double custoEnvio;
	private String statusPag;
	private String metodEnvio;
	private String codRastreio;
	
	public Pedido(Long id, Long idCliente, Long idProduto, String dtaPedido, String dtaEntregaEx, String dtaEntregaReal,
			Integer quantidade, String statusPedido, Double precoUnitario, Double totalPedido, String enderecoEntrega,
			Double custoEnvio, String statusPag, String metodEnvio, String codRastreio) {
		
		this.id = id;
		this.idCliente = idCliente;
		this.idProduto = idProduto;
		this.dtaPedido = dtaPedido;
		this.dtaEntregaEx = dtaEntregaEx;
		this.dtaEntregaReal = dtaEntregaReal;
		this.quantidade = quantidade;
		this.statusPedido = statusPedido;
		this.precoUnitario = precoUnitario;
		TotalPedido = totalPedido;
		this.enderecoEntrega = enderecoEntrega;
		this.custoEnvio = custoEnvio;
		this.statusPag = statusPag;
		this.metodEnvio = metodEnvio;
		this.codRastreio = codRastreio;
	}
	
	public Pedido() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getDtaPedido() {
		return dtaPedido;
	}

	public void setDtaPedido(String dtaPedido) {
		this.dtaPedido = dtaPedido;
	}

	public String getDtaEntregaEx() {
		return dtaEntregaEx;
	}

	public void setDtaEntregaEx(String dtaEntregaEx) {
		this.dtaEntregaEx = dtaEntregaEx;
	}

	public String getDtaEntregaReal() {
		return dtaEntregaReal;
	}

	public void setDtaEntregaReal(String dtaEntregaReal) {
		this.dtaEntregaReal = dtaEntregaReal;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}

	public Double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Double getTotalPedido() {
		return TotalPedido;
	}

	public void setTotalPedido(Double totalPedido) {
		TotalPedido = totalPedido;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public Double getCustoEnvio() {
		return custoEnvio;
	}

	public void setCustoEnvio(Double custoEnvio) {
		this.custoEnvio = custoEnvio;
	}

	public String getStatusPag() {
		return statusPag;
	}

	public void setStatusPag(String statusPag) {
		this.statusPag = statusPag;
	}

	public String getMetodEnvio() {
		return metodEnvio;
	}

	public void setMetodEnvio(String metodEnvio) {
		this.metodEnvio = metodEnvio;
	}

	public String getCodRastreio() {
		return codRastreio;
	}

	public void setCodRastreio(String codRastreio) {
		this.codRastreio = codRastreio;
	}
	
}
