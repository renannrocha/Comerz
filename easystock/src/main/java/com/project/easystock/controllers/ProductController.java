package com.project.easystock.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Date;
import java.util.ResourceBundle;

import com.project.easystock.model.Produto;
import com.project.easystock.dao.ProdutoDao;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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

	// table
	@FXML
	private TableView<Produto> tableProdutos;

	// navegação
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
		Image applicationIcon = new Image(
				getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
		novoStage.getIcons().add(applicationIcon);
		novoStage.setTitle("EasyStock");
		novoStage.setResizable(false);
		novoStage.setScene(scene);
		novoStage.show();
	}

	@FXML
	private void btnOpenFonecedoresPage(ActionEvent event) throws IOException {
		Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stageAtual.close();
		Stage novoStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/suppliers.fxml"));
		Scene scene = new Scene(root);
		Image applicationIcon = new Image(
				getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
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
		Image applicationIcon = new Image(
				getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
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
		Image applicationIcon = new Image(
				getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
		novoStage.getIcons().add(applicationIcon);
		novoStage.setTitle("EasyStock");
		novoStage.setResizable(false);
		novoStage.setScene(scene);
		novoStage.show();
	}
	// fim navegação

	// navegação CRUD
	
	// Stage novoStage = new Stage();
	// Parent root =
	// FXMLLoader.load(getClass().getResource("/com/project/easystock/productWindowCRUD.fxml"));
	// Scene scene = new Scene(root);
	// Image applicationIcon = new
	// Image(getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
	// novoStage.getIcons().add(applicationIcon);
	// novoStage.setTitle("EasyStock");
	// novoStage.setResizable(false);
	// novoStage.setScene(scene);
	// novoStage.initModality(Modality.APPLICATION_MODAL);
	// novoStage.showAndWait();
	
	public void preencherTableView() {
		// Obtém a lista de produtos
		ProdutoDao produtoDao = new ProdutoDao();
		List<Produto> produtos = produtoDao.listarProdutos();

		// Cria as colunas da tabela e define o valor de exibição baseado nos campos do
		
		// Produto
		TableColumn<Produto, Long> colunaId = new TableColumn<>("ID");
		colunaId.setCellValueFactory(new PropertyValueFactory<>("id"));
		
		TableColumn<Produto, String> colunaNome = new TableColumn<>("Nome");
		colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));

		TableColumn<Produto, String> colunaCategoria = new TableColumn<>("Categoria");
		colunaCategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));

		TableColumn<Produto, Double> colunaPrecoVenda = new TableColumn<>("Preço de Venda");
		colunaPrecoVenda.setCellValueFactory(new PropertyValueFactory<>("precoVenda"));

		TableColumn<Produto, Double> colunaPrecoCusto = new TableColumn<>("Preço de Custo");
		colunaPrecoCusto.setCellValueFactory(new PropertyValueFactory<>("precoCusto"));

		TableColumn<Produto, Integer> colunaQuantidadeEstoque = new TableColumn<>("Quantidade em Estoque");
		colunaQuantidadeEstoque.setCellValueFactory(new PropertyValueFactory<>("quantidadeEstoque"));

		TableColumn<Produto, String> colunaFornecedor = new TableColumn<>("Fornecedor");
		colunaFornecedor.setCellValueFactory(new PropertyValueFactory<>("fornecedor"));

		TableColumn<Produto, Date> colunaDataEntrada = new TableColumn<>("Data de Entrada");
		colunaDataEntrada.setCellValueFactory(new PropertyValueFactory<>("dataEntrada"));

		TableColumn<Produto, String> colunaLocalizacaoArmazem = new TableColumn<>("Localização no Armazém");
		colunaLocalizacaoArmazem.setCellValueFactory(new PropertyValueFactory<>("localizacao"));

		TableColumn<Produto, String> colunaCodigoBarras = new TableColumn<>("Código de Barras");
		colunaCodigoBarras.setCellValueFactory(new PropertyValueFactory<>("codigoBarras"));

		TableColumn<Produto, Double> colunaPeso = new TableColumn<>("Peso");
		colunaPeso.setCellValueFactory(new PropertyValueFactory<>("peso"));

		TableColumn<Produto, String> colunaDimensoes = new TableColumn<>("Dimensões");
		colunaDimensoes.setCellValueFactory(new PropertyValueFactory<>("dimensoes"));

		TableColumn<Produto, String> colunaStatusProduto = new TableColumn<>("Status do Produto");
		colunaStatusProduto.setCellValueFactory(new PropertyValueFactory<>("statusProduto"));

		TableColumn<Produto, String> colunaSku = new TableColumn<>("SKU");
		colunaSku.setCellValueFactory(new PropertyValueFactory<>("sku"));

		TableColumn<Produto, String> colunaMarca = new TableColumn<>("Marca");
		colunaMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));

		// Adiciona as colunas à TableView
		tableProdutos.getColumns().add(colunaId);
		tableProdutos.getColumns().add(colunaNome);
		tableProdutos.getColumns().add(colunaCategoria);
		tableProdutos.getColumns().add(colunaPrecoVenda);
		tableProdutos.getColumns().add(colunaPrecoCusto);
		tableProdutos.getColumns().add(colunaQuantidadeEstoque);
		tableProdutos.getColumns().add(colunaFornecedor);
		tableProdutos.getColumns().add(colunaDataEntrada);
		tableProdutos.getColumns().add(colunaLocalizacaoArmazem);
		tableProdutos.getColumns().add(colunaCodigoBarras);
		tableProdutos.getColumns().add(colunaPeso);
		tableProdutos.getColumns().add(colunaDimensoes);
		tableProdutos.getColumns().add(colunaStatusProduto);
		tableProdutos.getColumns().add(colunaSku);
		tableProdutos.getColumns().add(colunaMarca);

		// Converte a lista de produtos para um ObservableList
		ObservableList<Produto> produtosObservable = FXCollections.observableArrayList(produtos);

		// Define os itens da TableView
		tableProdutos.setItems(produtosObservable);
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
		// abre a janela de pesquisa por ID - searchWindow.fxml
		Stage novoStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/searchWindow.fxml"));
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
		preencherTableView();

		// nav buttons principal
		assert btnClientpage != null : "fx:id=\"btnClientpage\" was not injected: check your FXML file 'product.fxml'.";
		assert btnDashbord != null : "fx:id=\"btnDashbord\" was not injected: check your FXML file 'product.fxml'.";
		assert btnFornecedoresPage != null
				: "fx:id=\"btnFornecedoresPage\" was not injected: check your FXML file 'product.fxml'.";
		assert btnRequestPage != null
				: "fx:id=\"btnRequestPage\" was not injected: check your FXML file 'product.fxml'.";
		assert btnSalespage != null : "fx:id=\"btnSalespage\" was not injected: check your FXML file 'product.fxml'.";
		// crud buttons
		assert btnCRUDadicionar != null
				: "fx:id=\"btnCRUDadicionar\" was not injected: check your FXML file 'product.fxml'.";
		assert btnCRUDeditar != null : "fx:id=\"btnCRUDeditar\" was not injected: check your FXML file 'product.fxml'.";
		assert btnCRUDexcluir != null
				: "fx:id=\"btnCRUDexcluir\" was not injected: check your FXML file 'product.fxml'.";
		assert btnCRUDpesquisar != null
				: "fx:id=\"btnCRUDpesquisar\" was not injected: check your FXML file 'product.fxml'.";
		// table
		assert tableProdutos != null : "fx:id=\"tableProdutos\" was not injected: check your FXML file 'product.fxml'.";

	}

}
