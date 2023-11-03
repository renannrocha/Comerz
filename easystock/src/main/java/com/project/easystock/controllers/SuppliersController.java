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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
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
	
	// panes
	@FXML
	private AnchorPane paneCRUDadicionar;

	@FXML
	private AnchorPane paneCRUDeditar;

	@FXML
	private AnchorPane paneCRUDexcluir;

	@FXML
	private AnchorPane paneCRUDpesquisar;
	
	// text
	@FXML
	private Text statusAdicao;

	@FXML
	private Text statusEdicao;

	@FXML
	private Text statusExclusao;

	@FXML
	private Text statusPesquisa;
	
	// text field
	
	@FXML
    private TextField txtAreaCNPJEditar;

    @FXML
    private TextField txtAreaCNPJPesquisa;

    @FXML
    private TextField txtAreaCNPJadicionar;

    @FXML
    private TextField txtAreaEmailAdicionar;

    @FXML
    private TextField txtAreaEmailEditar;

    @FXML
    private TextField txtAreaEmailPesquisa;

    @FXML
    private TextField txtAreaExcluir;

    @FXML
    private TextField txtAreaIDadicionar;

    @FXML
    private TextField txtAreaIDeditar;

    @FXML
    private TextField txtAreaIDpesquisa;

    @FXML
    private TextField txtAreaMtdEnvioAdicionar;

    @FXML
    private TextField txtAreaMtdEnvioEditar;

    @FXML
    private TextField txtAreaMtdEnvioPesquisa;

    @FXML
    private TextField txtAreaNomeAdicionar;

    @FXML
    private TextField txtAreaNomeEditar;

    @FXML
    private TextField txtAreaNomePesquisa;

    @FXML
    private TextField txtAreaProdFornecidosAdicionar;

    @FXML
    private TextField txtAreaProdFornecidosEditar;

    @FXML
    private TextField txtAreaProdFornecidosPesquisa;

    @FXML
    private TextField txtAreaTelefoneAdicionar;

    @FXML
    private TextField txtAreaTelefoneEditar;

    @FXML
    private TextField txtAreaTelefonePesquisa;

    @FXML
    private TextField txtAreaTipoAdicionar;

    @FXML
    private TextField txtAreaTipoEditar;

    @FXML
    private TextField txtAreaTipoPesquisa;

    @FXML
    private TextField txtAreaTpEntregaAdicionar;

    @FXML
    private TextField txtAreaTpEntregaEditar;

    @FXML
    private TextField txtAreaTpEntregaPesquisa;

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
	private void gerenciarAdicoes(ActionEvent event){
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
	private void gerenciarEditar(ActionEvent event){
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
	private void gerenciarExcluir(ActionEvent event){
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
	private void gerenciarPesquisa(ActionEvent event){
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

	// btm pane crud
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
		
		assert btnCRUDadicionar != null : "fx:id=\"btnCRUDadicionar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert btnCRUDeditar != null : "fx:id=\"btnCRUDeditar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert btnCRUDexcluir != null : "fx:id=\"btnCRUDexcluir\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert btnCRUDpesquisar != null : "fx:id=\"btnCRUDpesquisar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert btnClientpage != null : "fx:id=\"btnClientpage\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert btnDashbord != null : "fx:id=\"btnDashbord\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert btnProductPage != null : "fx:id=\"btnProductPage\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert btnRequestPage != null : "fx:id=\"btnRequestPage\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert btnSalespage != null : "fx:id=\"btnSalespage\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert paneCRUDadicionar != null : "fx:id=\"paneCRUDadicionar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert paneCRUDeditar != null : "fx:id=\"paneCRUDeditar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert paneCRUDexcluir != null : "fx:id=\"paneCRUDexcluir\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert paneCRUDpesquisar != null : "fx:id=\"paneCRUDpesquisar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert statusAdicao != null : "fx:id=\"statusAdicao\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert statusEdicao != null : "fx:id=\"statusEdicao\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert statusExclusao != null : "fx:id=\"statusExclusao\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert statusPesquisa != null : "fx:id=\"statusPesquisa\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert tableFornecedor != null : "fx:id=\"tableFornecedor\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaCNPJEditar != null : "fx:id=\"txtAreaCNPJEditar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaCNPJPesquisa != null : "fx:id=\"txtAreaCNPJPesquisa\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaCNPJadicionar != null : "fx:id=\"txtAreaCNPJadicionar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaEmailAdicionar != null : "fx:id=\"txtAreaEmailAdicionar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaEmailEditar != null : "fx:id=\"txtAreaEmailEditar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaEmailPesquisa != null : "fx:id=\"txtAreaEmailPesquisa\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaExcluir != null : "fx:id=\"txtAreaExcluir\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaIDadicionar != null : "fx:id=\"txtAreaIDadicionar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaIDeditar != null : "fx:id=\"txtAreaIDeditar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaIDpesquisa != null : "fx:id=\"txtAreaIDpesquisa\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaMtdEnvioAdicionar != null : "fx:id=\"txtAreaMtdEnvioAdicionar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaMtdEnvioEditar != null : "fx:id=\"txtAreaMtdEnvioEditar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaMtdEnvioPesquisa != null : "fx:id=\"txtAreaMtdEnvioPesquisa\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaNomeAdicionar != null : "fx:id=\"txtAreaNomeAdicionar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaNomeEditar != null : "fx:id=\"txtAreaNomeEditar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaNomePesquisa != null : "fx:id=\"txtAreaNomePesquisa\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaProdFornecidosAdicionar != null : "fx:id=\"txtAreaProdFornecidosAdicionar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaProdFornecidosEditar != null : "fx:id=\"txtAreaProdFornecidosEditar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaProdFornecidosPesquisa != null : "fx:id=\"txtAreaProdFornecidosPesquisa\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaTelefoneAdicionar != null : "fx:id=\"txtAreaTelefoneAdicionar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaTelefoneEditar != null : "fx:id=\"txtAreaTelefoneEditar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaTelefonePesquisa != null : "fx:id=\"txtAreaTelefonePesquisa\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaTipoAdicionar != null : "fx:id=\"txtAreaTipoAdicionar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaTipoEditar != null : "fx:id=\"txtAreaTipoEditar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaTipoPesquisa != null : "fx:id=\"txtAreaTipoPesquisa\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaTpEntregaAdicionar != null : "fx:id=\"txtAreaTpEntregaAdicionar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaTpEntregaEditar != null : "fx:id=\"txtAreaTpEntregaEditar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert txtAreaTpEntregaPesquisa != null : "fx:id=\"txtAreaTpEntregaPesquisa\" was not injected: check your FXML file 'suppliers.fxml'.";

	}

}
