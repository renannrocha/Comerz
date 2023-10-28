package com.project.easystock.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ConfirmController {
	 	@FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private Button btnCancelar;

	    @FXML
	    private Button btnConfirmar;

	    @FXML
	    void btnCancelarAcao(ActionEvent event) {

	    }

	    @FXML
	    void btnConfirmarAcao(ActionEvent event) {

	    }

	    @FXML
	    void initialize() {
	        assert btnCancelar != null : "fx:id=\"btnCancelar\" was not injected: check your FXML file 'confirm.fxml'.";
	        assert btnConfirmar != null : "fx:id=\"btnConfirmar\" was not injected: check your FXML file 'confirm.fxml'.";

	    }

}
