package com.project.easystock;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

public class productController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnClientpage;

    @FXML
    private Button btnConfigPage;

    @FXML
    private Button btnDashbord;

    @FXML
    private Button btnFornecedoresPage;

    @FXML
    private Button btnRequestPage;

    @FXML
    private Button btnSalespage;

    @FXML
    private void btnOpenClientPage(ActionEvent event) throws IOException {
    	 // Obtém o Stage atual.
        Stage stageAtual = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        // Fecha a janela atual.
        stageAtual.close();
        
        // Cria um novo Stage.
        Stage novoStage = new Stage();
        
        // Carrega a nova janela.
        Parent root = FXMLLoader.load(getClass().getResource("client.fxml"));
        
        // Define a Scene para o novo Stage.
        Scene scene = new Scene(root);
        novoStage.getIcons().add(new Image("file:C:\\diretorios\\EasyStock\\easystock\\assets\\logo-easystock2.png"));
        novoStage.setTitle("EasyStock");
        novoStage.setResizable(false);
        novoStage.setScene(scene);
        
        // Mostra o novo Stage.
        novoStage.show();
    }

    @FXML
    private void btnOpenConfigPage(ActionEvent event) throws IOException {
    	Stage stageAtual = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageAtual.close();
        Stage novoStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("config.fxml"));
        Scene scene = new Scene(root);
        novoStage.getIcons().add(new Image("file:C:\\diretorios\\EasyStock\\easystock\\assets\\logo-easystock2.png"));
        novoStage.setTitle("EasyStock");
        novoStage.setResizable(false);
        novoStage.setScene(scene);
        novoStage.show();
    }

    @FXML
    private void btnOpenDashbord(ActionEvent event) throws IOException {
        Stage stageAtual = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageAtual.close();
        Stage novoStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("index.fxml"));
        Scene scene = new Scene(root);
        novoStage.getIcons().add(new Image("file:C:\\diretorios\\EasyStock\\easystock\\assets\\logo-easystock2.png"));
        novoStage.setTitle("EasyStock");
        novoStage.setResizable(false);
        novoStage.setScene(scene);
        novoStage.show();
    }

    @FXML
    private void btnOpenFonecedoresPage(ActionEvent event) throws IOException {
    	Stage stageAtual = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageAtual.close();
        Stage novoStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("suppliers.fxml"));
        Scene scene = new Scene(root);
        novoStage.getIcons().add(new Image("file:C:\\diretorios\\EasyStock\\easystock\\assets\\logo-easystock2.png"));
        novoStage.setTitle("EasyStock");
        novoStage.setResizable(false);
        novoStage.setScene(scene);
        novoStage.show();
    }

    @FXML
    private void btnOpenRequestPage(ActionEvent event) throws IOException {
    	Stage stageAtual = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageAtual.close();
        Stage novoStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("requests.fxml"));
        Scene scene = new Scene(root);
        novoStage.getIcons().add(new Image("file:C:\\diretorios\\EasyStock\\easystock\\assets\\logo-easystock2.png"));
        novoStage.setTitle("EasyStock");
        novoStage.setResizable(false);
        novoStage.setScene(scene);
        novoStage.show();
    }

    @FXML
    private void btnOpenSalesPage(ActionEvent event) throws IOException {
    	Stage stageAtual = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageAtual.close();
        Stage novoStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("sales.fxml"));
        Scene scene = new Scene(root);
        novoStage.getIcons().add(new Image("file:C:\\diretorios\\EasyStock\\easystock\\assets\\logo-easystock2.png"));
        novoStage.setTitle("EasyStock");
        novoStage.setResizable(false);
        novoStage.setScene(scene);
        novoStage.show();
    }

    @FXML
    void initialize() {
        assert btnClientpage != null : "fx:id=\"btnClientpage\" was not injected: check your FXML file 'product.fxml'.";
        assert btnConfigPage != null : "fx:id=\"btnConfigPage\" was not injected: check your FXML file 'product.fxml'.";
        assert btnDashbord != null : "fx:id=\"btnDashbord\" was not injected: check your FXML file 'product.fxml'.";
        assert btnFornecedoresPage != null : "fx:id=\"btnFornecedoresPage\" was not injected: check your FXML file 'product.fxml'.";
        assert btnRequestPage != null : "fx:id=\"btnRequestPage\" was not injected: check your FXML file 'product.fxml'.";
        assert btnSalespage != null : "fx:id=\"btnSalespage\" was not injected: check your FXML file 'product.fxml'.";
    }
	
}
