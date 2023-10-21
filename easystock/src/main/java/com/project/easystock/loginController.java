package com.project.easystock;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class loginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField txtPasswordArea;

    @FXML
    private TextField txtUsernameArea;

    @FXML
    void btnLogin(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert txtPasswordArea != null : "fx:id=\"txtPasswordArea\" was not injected: check your FXML file 'Untitled'.";
        assert txtUsernameArea != null : "fx:id=\"txtUsernameArea\" was not injected: check your FXML file 'Untitled'.";

    }

}

