package com.project.easystock.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SuppliersWindowCRUDcontroller {
	
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
    private TextField txtAreaCNPJ;

    @FXML
    private TextField txtAreaEmail;

    @FXML
    private TextField txtAreaEnvio;

    @FXML
    private TextField txtAreaID;

    @FXML
    private TextField txtAreaNome;

    @FXML
    private TextField txtAreaProdutosFornecidos;

    @FXML
    private TextField txtAreaTelefone;

    @FXML
    private TextField txtAreaTempoEntrega;

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
        assert btnAplicar != null : "fx:id=\"btnAplicar\" was not injected: check your FXML file 'suppliersWindowCRUD.fxml'.";
        assert btnCancelar != null : "fx:id=\"btnCancelar\" was not injected: check your FXML file 'suppliersWindowCRUD.fxml'.";
        assert btnLimpar != null : "fx:id=\"btnLimpar\" was not injected: check your FXML file 'suppliersWindowCRUD.fxml'.";
        assert txtAreaCNPJ != null : "fx:id=\"txtAreaCNPJ\" was not injected: check your FXML file 'suppliersWindowCRUD.fxml'.";
        assert txtAreaEmail != null : "fx:id=\"txtAreaEmail\" was not injected: check your FXML file 'suppliersWindowCRUD.fxml'.";
        assert txtAreaEnvio != null : "fx:id=\"txtAreaEnvio\" was not injected: check your FXML file 'suppliersWindowCRUD.fxml'.";
        assert txtAreaID != null : "fx:id=\"txtAreaID\" was not injected: check your FXML file 'suppliersWindowCRUD.fxml'.";
        assert txtAreaNome != null : "fx:id=\"txtAreaNome\" was not injected: check your FXML file 'suppliersWindowCRUD.fxml'.";
        assert txtAreaProdutosFornecidos != null : "fx:id=\"txtAreaProdutosFornecidos\" was not injected: check your FXML file 'suppliersWindowCRUD.fxml'.";
        assert txtAreaTelefone != null : "fx:id=\"txtAreaTelefone\" was not injected: check your FXML file 'suppliersWindowCRUD.fxml'.";
        assert txtAreaTempoEntrega != null : "fx:id=\"txtAreaTempoEntrega\" was not injected: check your FXML file 'suppliersWindowCRUD.fxml'.";
        assert txtAreaTipo != null : "fx:id=\"txtAreaTipo\" was not injected: check your FXML file 'suppliersWindowCRUD.fxml'.";

    }
}
