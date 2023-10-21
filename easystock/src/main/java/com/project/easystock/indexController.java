package com.project.easystock;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import javafx.scene.Node;

public class indexController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem btnLogOutSystem;

    @FXML
    void LogOut(ActionEvent event) {
    	Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void initialize() {
        assert btnLogOutSystem != null : "fx:id=\"btnLogOutSystem\" was not injected: check your FXML file 'index.fxml'.";
 
    }

}