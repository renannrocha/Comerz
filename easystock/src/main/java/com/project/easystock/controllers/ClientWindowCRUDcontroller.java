package com.project.easystock.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ClientWindowCRUDcontroller {
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
	private TextField txtAreaCPFCNPJ;

	@FXML
	private TextField txtAreaContato;

	@FXML
	private TextField txtAreaEndereco;

	@FXML
	private TextField txtAreaID;

	@FXML
	private TextField txtAreaNome;

	@FXML
	private TextField txtAreaStatsCliente;

	@FXML
	private TextField txtAreaStatsPedido;

	@FXML
	private TextField txtAreaTipo;

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
		assert btnAplicar != null
				: "fx:id=\"btnAplicar\" was not injected: check your FXML file 'clientWindowCRUD.fxml'.";
		assert btnCancelar != null
				: "fx:id=\"btnCancelar\" was not injected: check your FXML file 'clientWindowCRUD.fxml'.";
		assert btnLimpar != null
				: "fx:id=\"btnLimpar\" was not injected: check your FXML file 'clientWindowCRUD.fxml'.";
		assert txtAreaCPFCNPJ != null
				: "fx:id=\"txtAreaCPFCNPJ\" was not injected: check your FXML file 'clientWindowCRUD.fxml'.";
		assert txtAreaContato != null
				: "fx:id=\"txtAreaContato\" was not injected: check your FXML file 'clientWindowCRUD.fxml'.";
		assert txtAreaEndereco != null
				: "fx:id=\"txtAreaEndereco\" was not injected: check your FXML file 'clientWindowCRUD.fxml'.";
		assert txtAreaID != null
				: "fx:id=\"txtAreaID\" was not injected: check your FXML file 'clientWindowCRUD.fxml'.";
		assert txtAreaNome != null
				: "fx:id=\"txtAreaNome\" was not injected: check your FXML file 'clientWindowCRUD.fxml'.";
		assert txtAreaStatsCliente != null
				: "fx:id=\"txtAreaStatsCliente\" was not injected: check your FXML file 'clientWindowCRUD.fxml'.";
		assert txtAreaStatsPedido != null
				: "fx:id=\"txtAreaStatsPedido\" was not injected: check your FXML file 'clientWindowCRUD.fxml'.";
		assert txtAreaTipo != null
				: "fx:id=\"txtAreaTipo\" was not injected: check your FXML file 'clientWindowCRUD.fxml'.";

	}
}
