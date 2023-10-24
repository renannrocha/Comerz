package com.project.easystock;

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
import javafx.stage.Stage;

public class suppliersController {

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
	private Button btnProductPage;

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

	// CRUD panes
	@FXML
	private AnchorPane paneCRUDadicionar;

	@FXML
	private AnchorPane paneCRUDeditar;

	@FXML
	private AnchorPane paneCRUDexcluir;

	@FXML
	private AnchorPane paneCRUDpesquisar;

	@FXML
	private void btnOpenClientPage(ActionEvent event) throws IOException {
		Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stageAtual.close();
		Stage novoStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("client.fxml"));
		Scene scene = new Scene(root);
		novoStage.getIcons().add(new Image("file:C:\\diretorios\\EasyStock\\easystock\\assets\\logo-easystock2.png"));
		novoStage.setTitle("EasyStock");
		novoStage.setResizable(false);
		novoStage.setScene(scene);
		novoStage.show();
	}

	@FXML
	private void btnOpenConfigPage(ActionEvent event) throws IOException {
		Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
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
		Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
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
	private void btnOpenProductPage(ActionEvent event) throws IOException {
		Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stageAtual.close();
		Stage novoStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("product.fxml"));
		Scene scene = new Scene(root);
		novoStage.getIcons().add(new Image("file:C:\\diretorios\\EasyStock\\easystock\\assets\\logo-easystock2.png"));
		novoStage.setTitle("EasyStock");
		novoStage.setResizable(false);
		novoStage.setScene(scene);
		novoStage.show();
	}

	@FXML
	private void btnOpenRequestPage(ActionEvent event) throws IOException {
		Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
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
		Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
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

	// navegação CRUD
	@FXML
	void gerenciarAdicoes(ActionEvent event) {
		if (paneCRUDeditar.isVisible()) {
			paneCRUDeditar.setVisible(false);
			paneCRUDadicionar.setVisible(true);
		} else if (paneCRUDexcluir.isVisible()) {
			paneCRUDexcluir.setVisible(false);
			paneCRUDadicionar.setVisible(true);
		} else {
			paneCRUDpesquisar.setVisible(false);
			paneCRUDadicionar.setVisible(true);
		}
	}

	@FXML
	void gerenciarEditar(ActionEvent event) {
		if (paneCRUDadicionar.isVisible()) {
			paneCRUDadicionar.setVisible(false);
			paneCRUDeditar.setVisible(true);
		} else if (paneCRUDexcluir.isVisible()) {
			paneCRUDexcluir.setVisible(false);
			paneCRUDeditar.setVisible(true);
		} else {
			paneCRUDpesquisar.setVisible(false);
			paneCRUDeditar.setVisible(true);
		}
	}

	@FXML
	void gerenciarExcluir(ActionEvent event) {
		if (paneCRUDadicionar.isVisible()) {
			paneCRUDadicionar.setVisible(false);
			paneCRUDexcluir.setVisible(true);
		} else if (paneCRUDeditar.isVisible()) {
			paneCRUDeditar.setVisible(false);
			paneCRUDexcluir.setVisible(true);
		} else {
			paneCRUDpesquisar.setVisible(false);
			paneCRUDexcluir.setVisible(true);
		}
	}

	@FXML
	void gerenciarPesquisa(ActionEvent event) {
		if (paneCRUDadicionar.isVisible()) {
			paneCRUDadicionar.setVisible(false);
			paneCRUDpesquisar.setVisible(true);
		} else if (paneCRUDeditar.isVisible()) {
			paneCRUDeditar.setVisible(false);
			paneCRUDpesquisar.setVisible(true);
		} else {
			paneCRUDexcluir.setVisible(false);
			paneCRUDpesquisar.setVisible(true);
		}
	}
	// fim navegação CRUD

	@FXML
	void initialize() {
		assert btnClientpage != null
				: "fx:id=\"btnClientpage\" was not injected: check your FXML file 'suppliers.fxml'.";
		assert btnConfigPage != null
				: "fx:id=\"btnConfigPage\" was not injected: check your FXML file 'suppliers.fxml'.";
		assert btnDashbord != null : "fx:id=\"btnDashbord\" was not injected: check your FXML file 'suppliers.fxml'.";
		assert btnProductPage != null
				: "fx:id=\"btnProductPage\" was not injected: check your FXML file 'suppliers.fxml'.";
		assert btnRequestPage != null
				: "fx:id=\"btnRequestPage\" was not injected: check your FXML file 'suppliers.fxml'.";
		assert btnSalespage != null : "fx:id=\"btnSalespage\" was not injected: check your FXML file 'suppliers.fxml'.";

		assert paneCRUDadicionar != null
				: "fx:id=\"paneCRUDadicionar\" was not injected: check your FXML file 'suppliers.fxml'.";
		assert paneCRUDeditar != null
				: "fx:id=\"paneCRUDeditar\" was not injected: check your FXML file 'suppliers.fxml'.";
		assert paneCRUDexcluir != null
				: "fx:id=\"paneCRUDexcluir\" was not injected: check your FXML file 'suppliers.fxml'.";
		assert paneCRUDpesquisar != null
				: "fx:id=\"paneCRUDpesquisar\" was not injected: check your FXML file 'suppliers.fxml'.";

		assert btnCRUDadicionar != null
				: "fx:id=\"btnCRUDadicionar\" was not injected: check your FXML file 'suppliers.fxml'.";
		assert btnCRUDeditar != null
				: "fx:id=\"btnCRUDeditar\" was not injected: check your FXML file 'suppliers.fxml'.";
		assert btnCRUDexcluir != null
				: "fx:id=\"btnCRUDexcluir\" was not injected: check your FXML file 'suppliers.fxml'.";
		assert btnCRUDpesquisar != null
				: "fx:id=\"btnCRUDpesquisar\" was not injected: check your FXML file 'suppliers.fxml'.";

	}

}
