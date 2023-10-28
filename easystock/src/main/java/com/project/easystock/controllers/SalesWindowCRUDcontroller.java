package com.project.easystock.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class SalesWindowCRUDcontroller {

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
    private DatePicker dtaAreaEntregaEstimada;

    @FXML
    private DatePicker dtaAreaEntregaExata;

    @FXML
    private DatePicker dtaAreaVenda;

    @FXML
    private TextField txtAreaCustoEnvio;

    @FXML
    private TextField txtAreaEndereco;

    @FXML
    private TextField txtAreaID;

    @FXML
    private TextField txtAreaIDcliente;

    @FXML
    private TextField txtAreaIDproduto;

    @FXML
    private TextField txtAreaPrecoUnitario;

    @FXML
    private TextField txtAreaQuantidade;

    @FXML
    private TextField txtAreaStatsEntrega;

    @FXML
    private TextField txtAreaStatsPag;

    @FXML
    private TextField txtAreaTotalVenda;

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
        assert btnAplicar != null : "fx:id=\"btnAplicar\" was not injected: check your FXML file 'salesWindowCRUD.fxml'.";
        assert btnCancelar != null : "fx:id=\"btnCancelar\" was not injected: check your FXML file 'salesWindowCRUD.fxml'.";
        assert btnLimpar != null : "fx:id=\"btnLimpar\" was not injected: check your FXML file 'salesWindowCRUD.fxml'.";
        assert dtaAreaEntregaEstimada != null : "fx:id=\"dtaAreaEntregaEstimada\" was not injected: check your FXML file 'salesWindowCRUD.fxml'.";
        assert dtaAreaEntregaExata != null : "fx:id=\"dtaAreaEntregaExata\" was not injected: check your FXML file 'salesWindowCRUD.fxml'.";
        assert dtaAreaVenda != null : "fx:id=\"dtaAreaVenda\" was not injected: check your FXML file 'salesWindowCRUD.fxml'.";
        assert txtAreaCustoEnvio != null : "fx:id=\"txtAreaCustoEnvio\" was not injected: check your FXML file 'salesWindowCRUD.fxml'.";
        assert txtAreaEndereco != null : "fx:id=\"txtAreaEndereco\" was not injected: check your FXML file 'salesWindowCRUD.fxml'.";
        assert txtAreaID != null : "fx:id=\"txtAreaID\" was not injected: check your FXML file 'salesWindowCRUD.fxml'.";
        assert txtAreaIDcliente != null : "fx:id=\"txtAreaIDcliente\" was not injected: check your FXML file 'salesWindowCRUD.fxml'.";
        assert txtAreaIDproduto != null : "fx:id=\"txtAreaIDproduto\" was not injected: check your FXML file 'salesWindowCRUD.fxml'.";
        assert txtAreaPrecoUnitario != null : "fx:id=\"txtAreaPrecoUnitario\" was not injected: check your FXML file 'salesWindowCRUD.fxml'.";
        assert txtAreaQuantidade != null : "fx:id=\"txtAreaQuantidade\" was not injected: check your FXML file 'salesWindowCRUD.fxml'.";
        assert txtAreaStatsEntrega != null : "fx:id=\"txtAreaStatsEntrega\" was not injected: check your FXML file 'salesWindowCRUD.fxml'.";
        assert txtAreaStatsPag != null : "fx:id=\"txtAreaStatsPag\" was not injected: check your FXML file 'salesWindowCRUD.fxml'.";
        assert txtAreaTotalVenda != null : "fx:id=\"txtAreaTotalVenda\" was not injected: check your FXML file 'salesWindowCRUD.fxml'.";

    }
	
}
