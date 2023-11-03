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
import javafx.stage.Stage;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

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
	  	
	  	// entrada de data
	  	@FXML
	    private DatePicker dtaAreaEntregaEstimadaAdicionar;

	    @FXML
	    private DatePicker dtaAreaEntregaEstimadaEditar;

	    @FXML
	    private DatePicker dtaAreaEntregaEstimadaPesquisar;

	    @FXML
	    private DatePicker dtaAreaEntregaExataAdicionar;

	    @FXML
	    private DatePicker dtaAreaEntregaExataEditar;

	    @FXML
	    private DatePicker dtaAreaEntregaExataPesquisar;

	    @FXML
	    private DatePicker dtaAreaVendaAdicionar;

	    @FXML
	    private DatePicker dtaAreaVendaEditar;

	    @FXML
	    private DatePicker dtaAreaVendaPesquisar;
	    
	    // AnchorPanes
	    @FXML
	    private AnchorPane paneCRUDadicionar;

	    @FXML
	    private AnchorPane paneCRUDeditar;

	    @FXML
	    private AnchorPane paneCRUDexcluir;

	    @FXML
	    private AnchorPane paneCRUDpesquisar;
	    
	    // status error 
	    @FXML
	    private Text statusAdicao;

	    @FXML
	    private Text statusEdicao;

	    @FXML
	    private Text statusExclusao;

	    @FXML
	    private Text statusPesquisa;
	    
	    // entrada de dados -> text field
	    @FXML
	    private TextField txtAreaCustoEnvioAdicionar;

	    @FXML
	    private TextField txtAreaCustoEnvioEditar;

	    @FXML
	    private TextField txtAreaCustoEnvioPesquisar;

	    @FXML
	    private TextField txtAreaEnderecoEntregaAdicionar;

	    @FXML
	    private TextField txtAreaEnderecoEntregaEditar;

	    @FXML
	    private TextField txtAreaEnderecoEntregaPesquisar;

	    @FXML
	    private TextField txtAreaIdAdicionar;

	    @FXML
	    private TextField txtAreaIdClienteAdicionar;

	    @FXML
	    private TextField txtAreaIdClienteEditar;

	    @FXML
	    private TextField txtAreaIdClientePesquisar;

	    @FXML
	    private TextField txtAreaIdEditar;

	    @FXML
	    private TextField txtAreaIdExcluir;

	    @FXML
	    private TextField txtAreaIdPesquisar;

	    @FXML
	    private TextField txtAreaIdProdutoAdicionar;

	    @FXML
	    private TextField txtAreaIdProdutoEditar;

	    @FXML
	    private TextField txtAreaIdProdutoPesquisar;

	    @FXML
	    private TextField txtAreaPrUnitarioAdicionar;

	    @FXML
	    private TextField txtAreaPrUnitarioEditar;

	    @FXML
	    private TextField txtAreaPrUnitarioPesquisar;

	    @FXML
	    private TextField txtAreaQuantidadeAdicionar;

	    @FXML
	    private TextField txtAreaQuantidadeEditar;

	    @FXML
	    private TextField txtAreaQuantidadePesquisar;

	    @FXML
	    private TextField txtAreaStsEntregaAdicionar;

	    @FXML
	    private TextField txtAreaStsEntregaEditar;

	    @FXML
	    private TextField txtAreaStsEntregaPesquisar;

	    @FXML
	    private TextField txtAreaStsPagamentoAdicionar;

	    @FXML
	    private TextField txtAreaStsPagamentoEditar;

	    @FXML
	    private TextField txtAreaStsPagamentoPesquisar;

	    @FXML
	    private TextField txtAreaTotalVendaAdicionar;

	    @FXML
	    private TextField txtAreaTotalVendaEditar;

	    @FXML
	    private TextField txtAreaTotalVendaPesquisar;

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
	  	
	  	// AnchorPanes btn CRUD functions
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
	    	
	    	assert btnCRUDadicionar != null : "fx:id=\"btnCRUDadicionar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnCRUDeditar != null : "fx:id=\"btnCRUDeditar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnCRUDexcluir != null : "fx:id=\"btnCRUDexcluir\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnCRUDpesquisar != null : "fx:id=\"btnCRUDpesquisar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnClientpage != null : "fx:id=\"btnClientpage\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnDashbord != null : "fx:id=\"btnDashbord\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnFornecedoresPage != null : "fx:id=\"btnFornecedoresPage\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnProductPage != null : "fx:id=\"btnProductPage\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnRequestPage != null : "fx:id=\"btnRequestPage\" was not injected: check your FXML file 'sales.fxml'.";
	        assert dtaAreaEntregaEstimadaAdicionar != null : "fx:id=\"dtaAreaEntregaEstimadaAdicionar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert dtaAreaEntregaEstimadaEditar != null : "fx:id=\"dtaAreaEntregaEstimadaEditar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert dtaAreaEntregaEstimadaPesquisar != null : "fx:id=\"dtaAreaEntregaEstimadaPesquisar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert dtaAreaEntregaExataAdicionar != null : "fx:id=\"dtaAreaEntregaExataAdicionar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert dtaAreaEntregaExataEditar != null : "fx:id=\"dtaAreaEntregaExataEditar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert dtaAreaEntregaExataPesquisar != null : "fx:id=\"dtaAreaEntregaExataPesquisar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert dtaAreaVendaAdicionar != null : "fx:id=\"dtaAreaVendaAdicionar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert dtaAreaVendaEditar != null : "fx:id=\"dtaAreaVendaEditar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert dtaAreaVendaPesquisar != null : "fx:id=\"dtaAreaVendaPesquisar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert paneCRUDadicionar != null : "fx:id=\"paneCRUDadicionar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert paneCRUDeditar != null : "fx:id=\"paneCRUDeditar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert paneCRUDexcluir != null : "fx:id=\"paneCRUDexcluir\" was not injected: check your FXML file 'sales.fxml'.";
	        assert paneCRUDpesquisar != null : "fx:id=\"paneCRUDpesquisar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert statusAdicao != null : "fx:id=\"statusAdicao\" was not injected: check your FXML file 'sales.fxml'.";
	        assert statusEdicao != null : "fx:id=\"statusEdicao\" was not injected: check your FXML file 'sales.fxml'.";
	        assert statusExclusao != null : "fx:id=\"statusExclusao\" was not injected: check your FXML file 'sales.fxml'.";
	        assert statusPesquisa != null : "fx:id=\"statusPesquisa\" was not injected: check your FXML file 'sales.fxml'.";
	        assert tableVendas != null : "fx:id=\"tableVendas\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaCustoEnvioAdicionar != null : "fx:id=\"txtAreaCustoEnvioAdicionar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaCustoEnvioEditar != null : "fx:id=\"txtAreaCustoEnvioEditar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaCustoEnvioPesquisar != null : "fx:id=\"txtAreaCustoEnvioPesquisar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaEnderecoEntregaAdicionar != null : "fx:id=\"txtAreaEnderecoEntregaAdicionar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaEnderecoEntregaEditar != null : "fx:id=\"txtAreaEnderecoEntregaEditar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaEnderecoEntregaPesquisar != null : "fx:id=\"txtAreaEnderecoEntregaPesquisar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaIdAdicionar != null : "fx:id=\"txtAreaIdAdicionar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaIdClienteAdicionar != null : "fx:id=\"txtAreaIdClienteAdicionar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaIdClienteEditar != null : "fx:id=\"txtAreaIdClienteEditar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaIdClientePesquisar != null : "fx:id=\"txtAreaIdClientePesquisar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaIdEditar != null : "fx:id=\"txtAreaIdEditar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaIdExcluir != null : "fx:id=\"txtAreaIdExcluir\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaIdPesquisar != null : "fx:id=\"txtAreaIdPesquisar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaIdProdutoAdicionar != null : "fx:id=\"txtAreaIdProdutoAdicionar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaIdProdutoEditar != null : "fx:id=\"txtAreaIdProdutoEditar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaIdProdutoPesquisar != null : "fx:id=\"txtAreaIdProdutoPesquisar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaPrUnitarioAdicionar != null : "fx:id=\"txtAreaPrUnitarioAdicionar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaPrUnitarioEditar != null : "fx:id=\"txtAreaPrUnitarioEditar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaPrUnitarioPesquisar != null : "fx:id=\"txtAreaPrUnitarioPesquisar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaQuantidadeAdicionar != null : "fx:id=\"txtAreaQuantidadeAdicionar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaQuantidadeEditar != null : "fx:id=\"txtAreaQuantidadeEditar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaQuantidadePesquisar != null : "fx:id=\"txtAreaQuantidadePesquisar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaStsEntregaAdicionar != null : "fx:id=\"txtAreaStsEntregaAdicionar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaStsEntregaEditar != null : "fx:id=\"txtAreaStsEntregaEditar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaStsEntregaPesquisar != null : "fx:id=\"txtAreaStsEntregaPesquisar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaStsPagamentoAdicionar != null : "fx:id=\"txtAreaStsPagamentoAdicionar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaStsPagamentoEditar != null : "fx:id=\"txtAreaStsPagamentoEditar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaStsPagamentoPesquisar != null : "fx:id=\"txtAreaStsPagamentoPesquisar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaTotalVendaAdicionar != null : "fx:id=\"txtAreaTotalVendaAdicionar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaTotalVendaEditar != null : "fx:id=\"txtAreaTotalVendaEditar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert txtAreaTotalVendaPesquisar != null : "fx:id=\"txtAreaTotalVendaPesquisar\" was not injected: check your FXML file 'sales.fxml'.";
	    }
	
}
