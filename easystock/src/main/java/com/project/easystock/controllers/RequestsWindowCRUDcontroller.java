package com.project.easystock.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class RequestsWindowCRUDcontroller {
	
	 	@FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private Button btnAplicar;

	    @FXML
	    private Button btnCancelar;

	    @FXML
	    private Button btnLimpar;

	    @FXML
	    private DatePicker dataAreaEntregaReal;

	    @FXML
	    private DatePicker dateAreaPedido;

	    @FXML
	    private DatePicker dtaAreaEntregaEstimada;

	    @FXML
	    private TextField txtAreaCodRastreio;

	    @FXML
	    private TextField txtAreaCustoEnvio;

	    @FXML
	    private TextField txtAreaEndEntrega;

	    @FXML
	    private TextField txtAreaID;

	    @FXML
	    private TextField txtAreaIDcliente;

	    @FXML
	    private TextField txtAreaIDproduto;

	    @FXML
	    private TextField txtAreaMetEnvio;

	    @FXML
	    private TextField txtAreaPrecoUnitario;

	    @FXML
	    private TextField txtAreaQuantidade;

	    @FXML
	    private TextField txtAreaStatusPagamento;

	    @FXML
	    private TextField txtAreaStatusPedido;

	    @FXML
	    private TextField txtAreaTotalPedido;

	    @FXML
	    void btnAplicarAcao(ActionEvent event) {

	    }

	    @FXML
	    void btnCancelarAcao(ActionEvent event) {

	    }

	    @FXML
	    void btnLimparCampos(ActionEvent event) {

	    }

	    @FXML
	    void initialize() {
	        assert btnAplicar != null : "fx:id=\"btnAplicar\" was not injected: check your FXML file 'requestsWindowCRUD.fxml'.";
	        assert btnCancelar != null : "fx:id=\"btnCancelar\" was not injected: check your FXML file 'requestsWindowCRUD.fxml'.";
	        assert btnLimpar != null : "fx:id=\"btnLimpar\" was not injected: check your FXML file 'requestsWindowCRUD.fxml'.";
	        assert dataAreaEntregaReal != null : "fx:id=\"dataAreaEntregaReal\" was not injected: check your FXML file 'requestsWindowCRUD.fxml'.";
	        assert dateAreaPedido != null : "fx:id=\"dateAreaPedido\" was not injected: check your FXML file 'requestsWindowCRUD.fxml'.";
	        assert dtaAreaEntregaEstimada != null : "fx:id=\"dtaAreaEntregaEstimada\" was not injected: check your FXML file 'requestsWindowCRUD.fxml'.";
	        assert txtAreaCodRastreio != null : "fx:id=\"txtAreaCodRastreio\" was not injected: check your FXML file 'requestsWindowCRUD.fxml'.";
	        assert txtAreaCustoEnvio != null : "fx:id=\"txtAreaCustoEnvio\" was not injected: check your FXML file 'requestsWindowCRUD.fxml'.";
	        assert txtAreaEndEntrega != null : "fx:id=\"txtAreaEndEntrega\" was not injected: check your FXML file 'requestsWindowCRUD.fxml'.";
	        assert txtAreaID != null : "fx:id=\"txtAreaID\" was not injected: check your FXML file 'requestsWindowCRUD.fxml'.";
	        assert txtAreaIDcliente != null : "fx:id=\"txtAreaIDcliente\" was not injected: check your FXML file 'requestsWindowCRUD.fxml'.";
	        assert txtAreaIDproduto != null : "fx:id=\"txtAreaIDproduto\" was not injected: check your FXML file 'requestsWindowCRUD.fxml'.";
	        assert txtAreaMetEnvio != null : "fx:id=\"txtAreaMetEnvio\" was not injected: check your FXML file 'requestsWindowCRUD.fxml'.";
	        assert txtAreaPrecoUnitario != null : "fx:id=\"txtAreaPrecoUnitario\" was not injected: check your FXML file 'requestsWindowCRUD.fxml'.";
	        assert txtAreaQuantidade != null : "fx:id=\"txtAreaQuantidade\" was not injected: check your FXML file 'requestsWindowCRUD.fxml'.";
	        assert txtAreaStatusPagamento != null : "fx:id=\"txtAreaStatusPagamento\" was not injected: check your FXML file 'requestsWindowCRUD.fxml'.";
	        assert txtAreaStatusPedido != null : "fx:id=\"txtAreaStatusPedido\" was not injected: check your FXML file 'requestsWindowCRUD.fxml'.";
	        assert txtAreaTotalPedido != null : "fx:id=\"txtAreaTotalPedido\" was not injected: check your FXML file 'requestsWindowCRUD.fxml'.";

	    }
	    
}
