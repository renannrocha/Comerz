package com.project.easystock.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import com.project.easystock.dao.FornecedorDao;
import com.project.easystock.model.Fornecedor;

public class SuppliersController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Button btnClientpage;

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
	
	// table 
	@FXML
    private TableView<Fornecedor> tableFornecedor;

	// navegação principal
	
	@FXML
	private void btnOpenClientPage(ActionEvent event) throws IOException {
		Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
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
		Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
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
	private void btnOpenProductPage(ActionEvent event) throws IOException {
		Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
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
	private void btnOpenRequestPage(ActionEvent event) throws IOException {
		Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
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
		Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
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
	// fim navegação principal

	// navegação CRUD
	public void preencherTableView() {
	    // Obtém a lista de produtos
	    FornecedorDao fornecedorDao = new FornecedorDao();
	    List<Fornecedor> fornecedor = fornecedorDao.listarFornecedores();

	    // Cria as colunas da tabela e define o valor de exibição baseado nos campos do Produto
	    TableColumn<Fornecedor, Integer> colunaId = new TableColumn<>("ID");
	    colunaId.setCellValueFactory(new PropertyValueFactory<>("id"));

	    TableColumn<Fornecedor, String> colunaNome = new TableColumn<>("Nome");
	    colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));

	    TableColumn<Fornecedor, String> colunaTipo = new TableColumn<>("Tipo");
	    colunaTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));

	    TableColumn<Fornecedor, String> colunaTelefone = new TableColumn<>("Telefone");
	    colunaTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));

	    TableColumn<Fornecedor, String> colunaEmail = new TableColumn<>("Email");
	    colunaEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

	    TableColumn<Fornecedor, String> colunaProdutos = new TableColumn<>("Produtos");
	    colunaProdutos.setCellValueFactory(new PropertyValueFactory<>("produtos"));

	    TableColumn<Fornecedor, String> colunaTempoEntrega = new TableColumn<>("Tempo de Entrega");
	    colunaTempoEntrega.setCellValueFactory(new PropertyValueFactory<>("tempoEntrega"));

	    TableColumn<Fornecedor, String> colunaCnpj = new TableColumn<>("CNPJ");
	    colunaCnpj.setCellValueFactory(new PropertyValueFactory<>("cnpj"));

	    TableColumn<Fornecedor, String> colunaMetodoEnvio = new TableColumn<>("Método de Envio");
	    colunaMetodoEnvio.setCellValueFactory(new PropertyValueFactory<>("metodoEnvio"));

	    // Adiciona as colunas à TableView
	    tableFornecedor.getColumns().add(colunaId);
	    tableFornecedor.getColumns().add(colunaNome);
	    tableFornecedor.getColumns().add(colunaTipo);
	    tableFornecedor.getColumns().add(colunaTelefone);
	    tableFornecedor.getColumns().add(colunaEmail);
	    tableFornecedor.getColumns().add(colunaProdutos);
	    tableFornecedor.getColumns().add(colunaTempoEntrega);
	    tableFornecedor.getColumns().add(colunaCnpj);
	    tableFornecedor.getColumns().add(colunaMetodoEnvio);

	    // Converte a lista de produtos para um ObservableList
	    ObservableList<Fornecedor> fornecedoresObservable = FXCollections.observableArrayList(fornecedor);

	    // Define os itens da TableView
	    tableFornecedor.setItems(fornecedoresObservable);
	}

	
	@FXML
	private void gerenciarAdicoes(ActionEvent event) throws IOException {
		
	}

	@FXML
	private void gerenciarEditar(ActionEvent event) throws IOException {
		
	}

	@FXML
	private void gerenciarExcluir(ActionEvent event) throws IOException {
		
	}

	@FXML
	private void gerenciarPesquisa(ActionEvent event) throws IOException {
		
	}
	// fim navegação CRUD

	@FXML
	void initialize() {
		preencherTableView();
		
		assert btnClientpage != null
				: "fx:id=\"btnClientpage\" was not injected: check your FXML file 'suppliers.fxml'.";
		assert btnDashbord != null : "fx:id=\"btnDashbord\" was not injected: check your FXML file 'suppliers.fxml'.";
		assert btnProductPage != null
				: "fx:id=\"btnProductPage\" was not injected: check your FXML file 'suppliers.fxml'.";
		assert btnRequestPage != null
				: "fx:id=\"btnRequestPage\" was not injected: check your FXML file 'suppliers.fxml'.";
		assert btnSalespage != null : "fx:id=\"btnSalespage\" was not injected: check your FXML file 'suppliers.fxml'.";

		assert btnCRUDadicionar != null
				: "fx:id=\"btnCRUDadicionar\" was not injected: check your FXML file 'suppliers.fxml'.";
		assert btnCRUDeditar != null
				: "fx:id=\"btnCRUDeditar\" was not injected: check your FXML file 'suppliers.fxml'.";
		assert btnCRUDexcluir != null
				: "fx:id=\"btnCRUDexcluir\" was not injected: check your FXML file 'suppliers.fxml'.";
		assert btnCRUDpesquisar != null
				: "fx:id=\"btnCRUDpesquisar\" was not injected: check your FXML file 'suppliers.fxml'.";
		
		assert tableFornecedor != null : "fx:id=\"tableFornecedor\" was not injected: check your FXML file 'suppliers.fxml'.";

	}

}
