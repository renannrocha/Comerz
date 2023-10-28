package com.project.easystock.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class RequestsController {
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnClientpage;

    @FXML
    private Button btnDashbord;

    @FXML
    private Button btnFornecedoresPage;

    @FXML
    private Button btnProductPage;

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

    @FXML
    private void btnOpenClientPage(ActionEvent event) throws IOException {
    	Stage stageAtual = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageAtual.close();
        Stage novoStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/client.fxml"));
        Scene scene = new Scene(root);
        Image applicationIcon = new Image(getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
        novoStage.getIcons().add(applicationIcon);
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
    private void btnOpenProductPage(ActionEvent event) throws IOException {
    	Stage stageAtual = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stageAtual.close();
        Stage novoStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/product.fxml"));
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
        Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/requestsWindowCRUD.fxml"));
        Scene scene = new Scene(root);
        Image applicationIcon = new Image(getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
        novoStage.getIcons().add(applicationIcon);
        novoStage.setTitle("EasyStock");
        novoStage.setResizable(false);
        novoStage.setScene(scene);
        novoStage.show();
    }

    // navegação CRUD
    
  	@FXML
  	private void gerenciarAdicoes(ActionEvent event) throws IOException {
  		Stage novoStage = new Stage();
  		Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/requestsWindowCRUD.fxml"));
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
  		Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/requestsWindowCRUD.fxml"));
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
  		Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/requestsWindowCRUD.fxml"));
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
  		Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/requestsWindowCRUD.fxml"));
        Scene scene = new Scene(root);
        Image applicationIcon = new Image(getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
        novoStage.getIcons().add(applicationIcon);
        novoStage.setTitle("EasyStock");
        novoStage.setResizable(false);
        novoStage.setScene(scene);
        novoStage.initModality(Modality.APPLICATION_MODAL);
        novoStage.showAndWait();
  	}
  	// fim navegação CRUD

    @FXML
    void initialize() {
    	
    	assert btnCRUDadicionar != null : "fx:id=\"btnCRUDadicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnCRUDeditar != null : "fx:id=\"btnCRUDeditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnCRUDexcluir != null : "fx:id=\"btnCRUDexcluir\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnCRUDpesquisar != null : "fx:id=\"btnCRUDpesquisar\" was not injected: check your FXML file 'requests.fxml'.";
    	
    	assert btnClientpage != null : "fx:id=\"btnClientpage\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnDashbord != null : "fx:id=\"btnDashbord\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnFornecedoresPage != null : "fx:id=\"btnFornecedoresPage\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnProductPage != null : "fx:id=\"btnProductPage\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnSalespage != null : "fx:id=\"btnSalespage\" was not injected: check your FXML file 'requests.fxml'.";

    }

}
