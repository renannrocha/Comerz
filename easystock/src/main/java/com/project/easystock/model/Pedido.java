package com.project.easystock.model;

import java.io.Serializable;
import java.util.Date;

public class Pedido implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
    private int idCliente;
    private int idProduto;
    private Date dataPedido;
    private Date dataEntregaEstimada;
    private Date dataEntregaReal;
    private int quantidade;
    private String statusPedido;
    private double precoUnitario;
    private double totalPedido;
    private String enderecoEntrega;
    private double custoEnvio;
    private String statusPagamento;
    private String metodoEnvio;
    private String codigoRastreio;
    
	public Pedido(int id, int idCliente, int idProduto, Date dataPedido, Date dataEntregaEstimada, Date dataEntregaReal,
			int quantidade, String statusPedido, double precoUnitario, double totalPedido, String enderecoEntrega,
			double custoEnvio, String statusPagamento, String metodoEnvio, String codigoRastreio) {

		this.id = id;
		this.idCliente = idCliente;
		this.idProduto = idProduto;
		this.dataPedido = dataPedido;
		this.dataEntregaEstimada = dataEntregaEstimada;
		this.dataEntregaReal = dataEntregaReal;
		this.quantidade = quantidade;
		this.statusPedido = statusPedido;
		this.precoUnitario = precoUnitario;
		this.totalPedido = totalPedido;
		this.enderecoEntrega = enderecoEntrega;
		this.custoEnvio = custoEnvio;
		this.statusPagamento = statusPagamento;
		this.metodoEnvio = metodoEnvio;
		this.codigoRastreio = codigoRastreio;
	}
	
	public Pedido() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Date getDataEntregaEstimada() {
		return dataEntregaEstimada;
	}

	public void setDataEntregaEstimada(Date dataEntregaEstimada) {
		this.dataEntregaEstimada = dataEntregaEstimada;
	}

	public Date getDataEntregaReal() {
		return dataEntregaReal;
	}

	public void setDataEntregaReal(Date dataEntregaReal) {
		this.dataEntregaReal = dataEntregaReal;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public double getTotalPedido() {
		return totalPedido;
	}

	public void setTotalPedido(double totalPedido) {
		this.totalPedido = totalPedido;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public double getCustoEnvio() {
		return custoEnvio;
	}

	public void setCustoEnvio(double custoEnvio) {
		this.custoEnvio = custoEnvio;
	}

	public String getStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	public String getMetodoEnvio() {
		return metodoEnvio;
	}

	public void setMetodoEnvio(String metodoEnvio) {
		this.metodoEnvio = metodoEnvio;
	}

	public String getCodigoRastreio() {
		return codigoRastreio;
	}

	public void setCodigoRastreio(String codigoRastreio) {
		this.codigoRastreio = codigoRastreio;
	}
	
	
}
