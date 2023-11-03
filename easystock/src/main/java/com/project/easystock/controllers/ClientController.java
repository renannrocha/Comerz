package com.project.easystock.controllers;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import com.project.easystock.dao.ClienteDao;
import com.project.easystock.model.Cliente;

public class ClientController {
	
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnDashbord;

    @FXML
    private Button btnFornecedoresPage;

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
    private TableView<Cliente> clientTable;

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
    
    // navegação CRUD
    public void preencherTableView() {
        // Obtém a lista de clientes
        ClienteDao clienteDao = new ClienteDao();
        List<Cliente> clientes = clienteDao.listarClientes();

        // Cria as colunas da tabela e define o valor de exibição baseado nos campos do Cliente
        TableColumn<Cliente, Integer> colunaId = new TableColumn<>("ID");
        colunaId.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Cliente, String> colunaNome = new TableColumn<>("Nome");
        colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));

        TableColumn<Cliente, String> colunaTipo = new TableColumn<>("Tipo");
        colunaTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));

        TableColumn<Cliente, String> colunaEndereco = new TableColumn<>("Endereço");
        colunaEndereco.setCellValueFactory(new PropertyValueFactory<>("endereco"));

        TableColumn<Cliente, String> colunaCpfCnpj = new TableColumn<>("CPF/CNPJ");
        colunaCpfCnpj.setCellValueFactory(new PropertyValueFactory<>("cpfCnpj"));

        TableColumn<Cliente, String> colunaContato = new TableColumn<>("Contato");
        colunaContato.setCellValueFactory(new PropertyValueFactory<>("contato"));

        TableColumn<Cliente, String> colunaStatusPedido = new TableColumn<>("Status Pedido");
        colunaStatusPedido.setCellValueFactory(new PropertyValueFactory<>("statusPedido"));

        TableColumn<Cliente, String> colunaStatusCliente = new TableColumn<>("Status Cliente");
        colunaStatusCliente.setCellValueFactory(new PropertyValueFactory<>("statusCliente"));

        // Adiciona as colunas à TableView
        clientTable.getColumns().add(colunaId);
        clientTable.getColumns().add(colunaNome);
        clientTable.getColumns().add(colunaTipo);
        clientTable.getColumns().add(colunaEndereco);
        clientTable.getColumns().add(colunaCpfCnpj);
        clientTable.getColumns().add(colunaContato);
        clientTable.getColumns().add(colunaStatusPedido);
        clientTable.getColumns().add(colunaStatusCliente);

        // Converte a lista de clientes para um ObservableList
        ObservableList<Cliente> clientesObservable = FXCollections.observableArrayList(clientes);

        // Define os itens da TableView
        clientTable.setItems(clientesObservable);
    }
    
    // CRUD Buttons
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
    	
    	assert clientTable != null : "fx:id=\"clientTable\" was not injected: check your FXML file 'client.fxml'.";
    	
        assert btnDashbord != null : "fx:id=\"btnDashbord\" was not injected: check your FXML file 'client.fxml'.";
        assert btnFornecedoresPage != null : "fx:id=\"btnFornecedoresPage\" was not injected: check your FXML file 'client.fxml'.";
        assert btnProductPage != null : "fx:id=\"btnProductPage\" was not injected: check your FXML file 'client.fxml'.";
        assert btnRequestPage != null : "fx:id=\"btnRequestPage\" was not injected: check your FXML file 'client.fxml'.";
        assert btnSalespage != null : "fx:id=\"btnSalespage\" was not injected: check your FXML file 'client.fxml'.";
        
        assert btnCRUDadicionar != null : "fx:id=\"btnCRUDadicionar\" was not injected: check your FXML file 'client.fxml'.";
        assert btnCRUDeditar != null : "fx:id=\"btnCRUDeditar\" was not injected: check your FXML file 'client.fxml'.";
        assert btnCRUDexcluir != null : "fx:id=\"btnCRUDexcluir\" was not injected: check your FXML file 'client.fxml'.";
        assert btnCRUDpesquisar != null : "fx:id=\"btnCRUDpesquisar\" was not injected: check your FXML file 'client.fxml'.";
        
    }

	
}
