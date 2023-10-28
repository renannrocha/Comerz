package com.project.easystock.controllers;

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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Node;

public class ProductController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    // nav bar buttons
    @FXML
    private Button btnClientpage;

    @FXML
    private Button btnDashbord;

    @FXML
    private Button btnFornecedoresPage;

    @FXML
    private Button btnRequestPage;

    @FXML
    private Button btnSalespage;
    
    
    // CRUD buttons
    
    @FXML
    private Button btnCRUDadicionar;

    @FXML
    private Button btnCRUDeditar;

    @FXML
    private Button btnCRUDexcluir;

    @FXML
    private Button btnCRUDpesquisar;
    
    
    // navegação
    @FXML
    private void btnOpenClientPage(ActionEvent event) throws IOException {
    	// Obtém o Stage atual.
        Stage stageAtual = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        // Fecha a janela atual.
        stageAtual.close();
        
        // Cria um novo Stage.
        Stage novoStage = new Stage();
        
        // Carrega a nova janela.
        Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/client.fxml"));
        
        // Define a Scene para o novo Stage.
        Scene scene = new Scene(root);
        Image applicationIcon = new Image(getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
        novoStage.getIcons().add(applicationIcon);
        novoStage.setTitle("EasyStock");
        novoStage.setResizable(false);
        novoStage.setScene(scene);
        
        // Mostra o novo Stage.
        novoStage.show();
    }

    @FXML
    private void btnOpenDashbord(ActionEvent event) throws IOException {
    	Stage stageAtual = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageAtual.close();
        Stage novoStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/index.fxml"));
        Scene scene = new Scene(root);
        Image applicationIcon = new Image(getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
        novoStage.getIcons().add(applicationIcon);
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
        Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/suppliers.fxml"));
        Scene scene = new Scene(root);
        Image applicationIcon = new Image(getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
        novoStage.getIcons().add(applicationIcon);
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
        Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/requests.fxml"));
        Scene scene = new Scene(root);
        Image applicationIcon = new Image(getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
        novoStage.getIcons().add(applicationIcon);
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
        Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/sales.fxml"));
        Scene scene = new Scene(root);
        Image applicationIcon = new Image(getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
        novoStage.getIcons().add(applicationIcon);
        novoStage.setTitle("EasyStock");
        novoStage.setResizable(false);
        novoStage.setScene(scene);
        novoStage.show();
    }
    // fim navegação
    
    
    // navegação CRUD


    @FXML
    private void gerenciarAdicoes(ActionEvent event) throws IOException {
    	Stage novoStage = new Stage();
  		Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/productWindowCRUD.fxml"));
        Scene scene = new Scene(root);
        Image applicationIcon = new Image(getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
        novoStage.getIcons().add(applicationIcon);
        novoStage.setTitle("EasyStock");
        novoStage.setResizable(false);
        novoStage.setScene(scene);
        novoStage.initModality(Modality.APPLICATION_MODAL);
        novoStage.showAndWait();
    }

    @FXML
    private void gerenciarEditar(ActionEvent event) throws IOException {
    	Stage novoStage = new Stage();
  		Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/productWindowCRUD.fxml"));
        Scene scene = new Scene(root);
        Image applicationIcon = new Image(getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
        novoStage.getIcons().add(applicationIcon);
        novoStage.setTitle("EasyStock");
        novoStage.setResizable(false);
        novoStage.setScene(scene);
        novoStage.initModality(Modality.APPLICATION_MODAL);
        novoStage.showAndWait();
    }

    @FXML
    private void gerenciarExcluir(ActionEvent event) throws IOException {
    	Stage novoStage = new Stage();
  		Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/productWindowCRUD.fxml"));
        Scene scene = new Scene(root);
        Image applicationIcon = new Image(getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
        novoStage.getIcons().add(applicationIcon);
        novoStage.setTitle("EasyStock");
        novoStage.setResizable(false);
        novoStage.setScene(scene);
        novoStage.initModality(Modality.APPLICATION_MODAL);
        novoStage.showAndWait();
    }

    @FXML
    private void gerenciarPesquisa(ActionEvent event) throws IOException {
    	Stage novoStage = new Stage();
  		Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/productWindowCRUD.fxml"));
        Scene scene = new Scene(root);
        Image applicationIcon = new Image(getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
        novoStage.getIcons().add(applicationIcon);
        novoStage.setTitle("EasyStock");
        novoStage.setResizable(false);
        novoStage.setScene(scene);
        novoStage.initModality(Modality.APPLICATION_MODAL);
        novoStage.showAndWait();
    }
    //fim navegação CRUD

    @FXML
    void initialize() {
    	
        // nav buttons principal
    	assert btnClientpage != null : "fx:id=\"btnClientpage\" was not injected: check your FXML file 'product.fxml'.";
        assert btnDashbord != null : "fx:id=\"btnDashbord\" was not injected: check your FXML file 'product.fxml'.";
        assert btnFornecedoresPage != null : "fx:id=\"btnFornecedoresPage\" was not injected: check your FXML file 'product.fxml'.";
        assert btnRequestPage != null : "fx:id=\"btnRequestPage\" was not injected: check your FXML file 'product.fxml'.";
        assert btnSalespage != null : "fx:id=\"btnSalespage\" was not injected: check your FXML file 'product.fxml'.";
        // crud buttons
        assert btnCRUDadicionar != null : "fx:id=\"btnCRUDadicionar\" was not injected: check your FXML file 'product.fxml'.";
        assert btnCRUDeditar != null : "fx:id=\"btnCRUDeditar\" was not injected: check your FXML file 'product.fxml'.";
        assert btnCRUDexcluir != null : "fx:id=\"btnCRUDexcluir\" was not injected: check your FXML file 'product.fxml'.";
        assert btnCRUDpesquisar != null : "fx:id=\"btnCRUDpesquisar\" was not injected: check your FXML file 'product.fxml'.";
   
    }
	
}
