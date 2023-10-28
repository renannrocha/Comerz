package com.project.easystock.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class ProductWindowCRUDcontroller {

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
    private DatePicker dtaAreaDtaEntrada;

    @FXML
    private DatePicker dtaAreaDtaValidade;

    @FXML
    private TextField txtAreaCategoria;

    @FXML
    private TextField txtAreaCodBarras;

    @FXML
    private TextField txtAreaDescDetalhada;

    @FXML
    private TextField txtAreaDimencoes;

    @FXML
    private TextField txtAreaFornecedor;

    @FXML
    private TextField txtAreaID;

    @FXML
    private TextField txtAreaLocArmazem;

    @FXML
    private TextField txtAreaMarca;

    @FXML
    private TextField txtAreaNome;

    @FXML
    private TextField txtAreaPeso;

    @FXML
    private TextField txtAreaPrecoCusto;

    @FXML
    private TextField txtAreaPrecoVenda;

    @FXML
    private TextField txtAreaQtdEstoque;

    @FXML
    private TextField txtAreaQtdMinima;

    @FXML
    private TextField txtAreaSKU;

    @FXML
    private TextField txtAreaSTSpedido;

    @FXML
    private TextField txtAreaSTSproduto;

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
        assert btnAplicar != null : "fx:id=\"btnAplicar\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert btnCancelar != null : "fx:id=\"btnCancelar\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert btnLimpar != null : "fx:id=\"btnLimpar\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        
        assert dtaAreaDtaEntrada != null : "fx:id=\"dtaAreaDtaEntrada\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert dtaAreaDtaValidade != null : "fx:id=\"dtaAreaDtaValidade\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        
        assert txtAreaCategoria != null : "fx:id=\"txtAreaCategoria\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert txtAreaCodBarras != null : "fx:id=\"txtAreaCodBarras\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert txtAreaDescDetalhada != null : "fx:id=\"txtAreaDescDetalhada\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert txtAreaDimencoes != null : "fx:id=\"txtAreaDimencoes\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert txtAreaFornecedor != null : "fx:id=\"txtAreaFornecedor\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert txtAreaID != null : "fx:id=\"txtAreaID\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert txtAreaLocArmazem != null : "fx:id=\"txtAreaLocArmazem\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert txtAreaMarca != null : "fx:id=\"txtAreaMarca\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert txtAreaNome != null : "fx:id=\"txtAreaNome\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert txtAreaPeso != null : "fx:id=\"txtAreaPeso\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert txtAreaPrecoCusto != null : "fx:id=\"txtAreaPrecoCusto\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert txtAreaPrecoVenda != null : "fx:id=\"txtAreaPrecoVenda\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert txtAreaQtdEstoque != null : "fx:id=\"txtAreaQtdEstoque\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert txtAreaQtdMinima != null : "fx:id=\"txtAreaQtdMinima\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert txtAreaSKU != null : "fx:id=\"txtAreaSKU\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert txtAreaSTSpedido != null : "fx:id=\"txtAreaSTSpedido\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";
        assert txtAreaSTSproduto != null : "fx:id=\"txtAreaSTSproduto\" was not injected: check your FXML file 'productWindowCRUD.fxml'.";

    }

}