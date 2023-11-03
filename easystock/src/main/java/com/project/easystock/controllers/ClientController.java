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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

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
 	
 	// AnchorPanes
 	@FXML
    private AnchorPane paneCRUDadicionar;

    @FXML
    private AnchorPane paneCRUDeditar;

    @FXML
    private AnchorPane paneCRUDpesquisar;

    @FXML
    private AnchorPane paneCRUDexcluir;
    
    // Text status
    @FXML
    private Text statusAdicao;

    @FXML
    private Text statusEdicao;

    @FXML
    private Text statusExclusao;

    @FXML
    private Text statusPesquisa;
    
    // Text Field - entrada de dados
    @FXML
    private TextField txtAreaContatoAdicionar;

    @FXML
    private TextField txtAreaContatoEditar;

    @FXML
    private TextField txtAreaContatoPesquisar;

    @FXML
    private TextField txtAreaCpfCnpjAdicionar;

    @FXML
    private TextField txtAreaCpfCnpjEditar;

    @FXML
    private TextField txtAreaCpfCnpjPesquisar;

    @FXML
    private TextField txtAreaEnderecoAdicionar;

    @FXML
    private TextField txtAreaEnderecoEditar;

    @FXML
    private TextField txtAreaEnderecoPesquisar;

    @FXML
    private TextField txtAreaIDAdicionar;

    @FXML
    private TextField txtAreaIDExcluir;

    @FXML
    private TextField txtAreaIDeditar;

    @FXML
    private TextField txtAreaIDpesquisar;

    @FXML
    private TextField txtAreaNomeAdicionar;

    @FXML
    private TextField txtAreaNomeEditar;

    @FXML
    private TextField txtAreaNomePesquisar;

    @FXML
    private TextField txtAreaStsClienteAdicionar;

    @FXML
    private TextField txtAreaStsClienteEditar;

    @FXML
    private TextField txtAreaStsClientePesquisar;

    @FXML
    private TextField txtAreaStsPedidoAdicionar;

    @FXML
    private TextField txtAreaStsPedidoEditar;

    @FXML
    private TextField txtAreaStsPedidoPesquisar;

    @FXML
    private TextField txtAreaTipoAdicionar;

    @FXML
    private TextField txtAreaTipoEditar;

    @FXML
    private TextField txtAreaTipoPesquisar;

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
 	private void gerenciarEditar(ActionEvent event) throws IOException {
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
 	private void gerenciarExcluir(ActionEvent event) throws IOException {
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
 	private void gerenciarPesquisa(ActionEvent event) throws IOException {
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
 	
 	
 	// btn anchorPanes CRUD
 	@FXML
    void btnAplicarAdicao(ActionEvent event) {

    }

    @FXML
    void btnAplicarEdicao(ActionEvent event) {

    }

    @FXML
    void btnAplicarExclusao(ActionEvent event) {

    }

    @FXML
    void btnAplicarPesquisa(ActionEvent event) {

    }

    @FXML
    void btnCancelarAdicao(ActionEvent event) {

    }

    @FXML
    void btnCancelarEdicao(ActionEvent event) {

    }

    @FXML
    void btnCancelarExclusao(ActionEvent event) {

    }

    @FXML
    void btnCancelarPesquisa(ActionEvent event) {

    }

    @FXML
    void btnLimparAdicao(ActionEvent event) {

    }

    @FXML
    void btnLimparEdicao(ActionEvent event) {

    }

    @FXML
    void btnLimparExclusao(ActionEvent event) {

    }

    @FXML
    void btnLimparPesquisa(ActionEvent event) {

    }
    
    
    @FXML
    void initialize() {
    	preencherTableView();
    	
    	assert btnCRUDadicionar != null : "fx:id=\"btnCRUDadicionar\" was not injected: check your FXML file 'client.fxml'.";
        assert btnCRUDeditar != null : "fx:id=\"btnCRUDeditar\" was not injected: check your FXML file 'client.fxml'.";
        assert btnCRUDexcluir != null : "fx:id=\"btnCRUDexcluir\" was not injected: check your FXML file 'client.fxml'.";
        assert btnCRUDpesquisar != null : "fx:id=\"btnCRUDpesquisar\" was not injected: check your FXML file 'client.fxml'.";
        assert btnDashbord != null : "fx:id=\"btnDashbord\" was not injected: check your FXML file 'client.fxml'.";
        assert btnFornecedoresPage != null : "fx:id=\"btnFornecedoresPage\" was not injected: check your FXML file 'client.fxml'.";
        assert btnProductPage != null : "fx:id=\"btnProductPage\" was not injected: check your FXML file 'client.fxml'.";
        assert btnRequestPage != null : "fx:id=\"btnRequestPage\" was not injected: check your FXML file 'client.fxml'.";
        assert btnSalespage != null : "fx:id=\"btnSalespage\" was not injected: check your FXML file 'client.fxml'.";
        assert clientTable != null : "fx:id=\"clientTable\" was not injected: check your FXML file 'client.fxml'.";
        assert paneCRUDadicionar != null : "fx:id=\"paneCRUDadicionar\" was not injected: check your FXML file 'client.fxml'.";
        assert paneCRUDeditar != null : "fx:id=\"paneCRUDeditar\" was not injected: check your FXML file 'client.fxml'.";
        assert paneCRUDpesquisar != null : "fx:id=\"paneCRUDpesquisar\" was not injected: check your FXML file 'client.fxml'.";
        assert paneCRUDexcluir != null : "fx:id=\"paneCRUDexcluir\" was not injected: check your FXML file 'client.fxml'.";
        assert statusAdicao != null : "fx:id=\"statusAdicao\" was not injected: check your FXML file 'client.fxml'.";
        assert statusEdicao != null : "fx:id=\"statusEdicao\" was not injected: check your FXML file 'client.fxml'.";
        assert statusExclusao != null : "fx:id=\"statusExclusao\" was not injected: check your FXML file 'client.fxml'.";
        assert statusPesquisa != null : "fx:id=\"statusPesquisa\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaContatoAdicionar != null : "fx:id=\"txtAreaContatoAdicionar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaContatoEditar != null : "fx:id=\"txtAreaContatoEditar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaContatoPesquisar != null : "fx:id=\"txtAreaContatoPesquisar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaCpfCnpjAdicionar != null : "fx:id=\"txtAreaCpfCnpjAdicionar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaCpfCnpjEditar != null : "fx:id=\"txtAreaCpfCnpjEditar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaCpfCnpjPesquisar != null : "fx:id=\"txtAreaCpfCnpjPesquisar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaEnderecoAdicionar != null : "fx:id=\"txtAreaEnderecoAdicionar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaEnderecoEditar != null : "fx:id=\"txtAreaEnderecoEditar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaEnderecoPesquisar != null : "fx:id=\"txtAreaEnderecoPesquisar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaIDAdicionar != null : "fx:id=\"txtAreaIDAdicionar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaIDExcluir != null : "fx:id=\"txtAreaIDExcluir\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaIDeditar != null : "fx:id=\"txtAreaIDeditar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaIDpesquisar != null : "fx:id=\"txtAreaIDpesquisar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaNomeAdicionar != null : "fx:id=\"txtAreaNomeAdicionar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaNomeEditar != null : "fx:id=\"txtAreaNomeEditar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaNomePesquisar != null : "fx:id=\"txtAreaNomePesquisar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaStsClienteAdicionar != null : "fx:id=\"txtAreaStsClienteAdicionar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaStsClienteEditar != null : "fx:id=\"txtAreaStsClienteEditar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaStsClientePesquisar != null : "fx:id=\"txtAreaStsClientePesquisar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaStsPedidoAdicionar != null : "fx:id=\"txtAreaStsPedidoAdicionar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaStsPedidoEditar != null : "fx:id=\"txtAreaStsPedidoEditar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaStsPedidoPesquisar != null : "fx:id=\"txtAreaStsPedidoPesquisar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaTipoAdicionar != null : "fx:id=\"txtAreaTipoAdicionar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaTipoEditar != null : "fx:id=\"txtAreaTipoEditar\" was not injected: check your FXML file 'client.fxml'.";
        assert txtAreaTipoPesquisar != null : "fx:id=\"txtAreaTipoPesquisar\" was not injected: check your FXML file 'client.fxml'.";
        
    }

	
}
