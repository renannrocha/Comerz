package com.project.easystock.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Date;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import com.project.easystock.model.Venda;
import com.project.easystock.dao.VendaDao;

public class SalesController {

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
	    private Button btnRequestPage;
	    
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
	    private TableView<Venda> tableVendas;

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
	    
	    public void preencherTableView() {
	        // Obtém a lista de vendas
	        VendaDao vendaDao = new VendaDao();
	        List<Venda> vendas = vendaDao.listarVendas();

	        // Cria as colunas da tabela e define o valor de exibição baseado nos campos do Venda
	        TableColumn<Venda, Integer> colunaId = new TableColumn<>("ID");
	        colunaId.setCellValueFactory(new PropertyValueFactory<>("id"));

	        TableColumn<Venda, Integer> colunaIdProduto = new TableColumn<>("ID Produto");
	        colunaIdProduto.setCellValueFactory(new PropertyValueFactory<>("idProduto"));

	        TableColumn<Venda, Integer> colunaIdCliente = new TableColumn<>("ID Cliente");
	        colunaIdCliente.setCellValueFactory(new PropertyValueFactory<>("idCliente"));

	        TableColumn<Venda, Integer> colunaQuantidade = new TableColumn<>("Quantidade");
	        colunaQuantidade.setCellValueFactory(new PropertyValueFactory<>("quantidade"));

	        TableColumn<Venda, Double> colunaPrecoUnitario = new TableColumn<>("Preço Unitário");
	        colunaPrecoUnitario.setCellValueFactory(new PropertyValueFactory<>("precoUnitario"));

	        TableColumn<Venda, Double> colunaTotalVenda = new TableColumn<>("Total da Venda");
	        colunaTotalVenda.setCellValueFactory(new PropertyValueFactory<>("totalVenda"));

	        TableColumn<Venda, Date> colunaDataVenda = new TableColumn<>("Data da Venda");
	        colunaDataVenda.setCellValueFactory(new PropertyValueFactory<>("dataVenda"));

	        TableColumn<Venda, String> colunaEnderecoEntrega = new TableColumn<>("Endereço de Entrega");
	        colunaEnderecoEntrega.setCellValueFactory(new PropertyValueFactory<>("enderecoEntrega"));

	        TableColumn<Venda, Date> colunaDataEntregaEstimada = new TableColumn<>("Data de Entrega Estimada");
	        colunaDataEntregaEstimada.setCellValueFactory(new PropertyValueFactory<>("dataEntregaEstimada"));

	        TableColumn<Venda, Date> colunaDataEntregaExata = new TableColumn<>("Data de Entrega Exata");
	        colunaDataEntregaExata.setCellValueFactory(new PropertyValueFactory<>("dataEntregaExata"));

	        TableColumn<Venda, String> colunaStatusPagamento = new TableColumn<>("Status Pagamento");
	        colunaStatusPagamento.setCellValueFactory(new PropertyValueFactory<>("statusPagamento"));

	        TableColumn<Venda, String> colunaStatusEntrega = new TableColumn<>("Status Entrega");
	        colunaStatusEntrega.setCellValueFactory(new PropertyValueFactory<>("statusEntrega"));

	        TableColumn<Venda, Double> colunaCustoEnvio = new TableColumn<>("Custo Envio");
	        colunaCustoEnvio.setCellValueFactory(new PropertyValueFactory<>("custoEnvio"));
	    	
	    	// Adiciona as colunas à TableView
	        tableVendas.getColumns().add(colunaId);
	        tableVendas.getColumns().add(colunaIdProduto);
	        tableVendas.getColumns().add(colunaIdCliente);
	        tableVendas.getColumns().add(colunaQuantidade);
	        tableVendas.getColumns().add(colunaPrecoUnitario);
	        tableVendas.getColumns().add(colunaTotalVenda);
	        tableVendas.getColumns().add(colunaDataVenda);
	        tableVendas.getColumns().add(colunaEnderecoEntrega);
	        tableVendas.getColumns().add(colunaDataEntregaEstimada);
	        tableVendas.getColumns().add(colunaDataEntregaExata);
	        tableVendas.getColumns().add(colunaStatusPagamento);
	        tableVendas.getColumns().add(colunaStatusEntrega);
	        tableVendas.getColumns().add(colunaCustoEnvio);

	        // Converte a lista de vendas para um ObservableList
	        ObservableList<Venda> vendasObservable = FXCollections.observableArrayList(vendas);

	        // Define os itens da TableView
	        tableVendas.setItems(vendasObservable);
	    }
	    
	    // navegação CRUD
	   
	    
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
	    	
	    	assert btnCRUDadicionar != null : "fx:id=\"btnCRUDadicionar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnCRUDeditar != null : "fx:id=\"btnCRUDeditar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnCRUDexcluir != null : "fx:id=\"btnCRUDexcluir\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnCRUDpesquisar != null : "fx:id=\"btnCRUDpesquisar\" was not injected: check your FXML file 'sales.fxml'.";
	    	
	        assert btnClientpage != null : "fx:id=\"btnClientpage\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnDashbord != null : "fx:id=\"btnDashbord\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnFornecedoresPage != null : "fx:id=\"btnFornecedoresPage\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnProductPage != null : "fx:id=\"btnProductPage\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnRequestPage != null : "fx:id=\"btnRequestPage\" was not injected: check your FXML file 'sales.fxml'.";
	        assert tableVendas != null : "fx:id=\"tableVendas\" was not injected: check your FXML file 'sales.fxml'.";
	    }
	
}
