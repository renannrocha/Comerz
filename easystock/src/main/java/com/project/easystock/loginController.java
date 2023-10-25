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
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;


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
    private Text txtStatusPassword;

    @FXML
    private Text txtStatusUsername;
    
    @FXML
    private Pane imagePane;


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
	            appStage.setMaximized(false);
	            Image applicationIcon = new Image(getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
	            appStage.getIcons().add(applicationIcon);
	            appStage.setTitle("EasyStock");
	            appStage.setScene(new Scene(root));
	            appStage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		} else {
			txtStatusPassword.setVisible(true);
			txtStatusUsername.setVisible(true);
			txtUsernameArea.setText("");
			txtPasswordArea.setText("");
		}
    }

	@FXML
	void initialize() {
		
		Image image = new Image(getClass().getResourceAsStream("/com/project/easystock/img/EasyStock.png"));
        ImageView imageView = new ImageView(image);
        imagePane.getChildren().add(imageView);
		
		assert txtPasswordArea != null : "fx:id=\"txtPasswordArea\" was not injected: check your FXML file 'Untitled'.";
		assert txtUsernameArea != null : "fx:id=\"txtUsernameArea\" was not injected: check your FXML file 'Untitled'.";
		assert txtStatusPassword != null : "fx:id=\"txtStatusPassword\" was not injected: check your FXML file 'login.fxml'.";
        assert txtStatusUsername != null : "fx:id=\"txtStatusUsername\" was not injected: check your FXML file 'login.fxml'.";
	}

}
