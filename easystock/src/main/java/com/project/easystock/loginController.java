package com.project.easystock;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

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
	private Button btnLogin;

	@FXML
    void btnLogin(MouseEvent event) {
		String user = txtUsernameArea.getText();
		String password = txtPasswordArea.getText();
		
		if ("admin@mail.com".equals(user) && "104030".equals(password)) {
			Stage stage = (Stage) btnLogin.getScene().getWindow();
	        stage.close();
	        
	        try {
	            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("index.fxml"));
	            Parent root = fxmlLoader.load();
	            Stage appStage = new Stage();
	            appStage.setResizable(false);
	            appStage.setMaximized(true);
	            appStage.getIcons().add(new Image("file:C:\\diretorios\\EasyStock\\easystock\\assets\\logo-easystock2.png"));
	            appStage.setTitle("EasyStock");
	            appStage.setScene(new Scene(root));
	            appStage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}
		// adicionar mensagem de erro caso login estiver errado
    }

	@FXML
	void initialize() {
		assert txtPasswordArea != null : "fx:id=\"txtPasswordArea\" was not injected: check your FXML file 'Untitled'.";
		assert txtUsernameArea != null : "fx:id=\"txtUsernameArea\" was not injected: check your FXML file 'Untitled'.";

	}

}
