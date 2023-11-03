package com.project.easystock.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Date;
import java.util.ResourceBundle;

import com.project.easystock.model.Pedido;
import com.project.easystock.dao.PedidoDao;

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
  	
  	// table
  	@FXML
    private TableView<Pedido> tablePedidos;
  	
  	// date
  	@FXML
    private DatePicker dtaAreaDtEntregaEstAdicionar;

    @FXML
    private DatePicker dtaAreaDtEntregaEstEditar;

    @FXML
    private DatePicker dtaAreaDtEntregaEstPesquisar;

    @FXML
    private DatePicker dtaAreaDtPedidoAdicionar;

    @FXML
    private DatePicker dtaAreaDtPedidoEditar;

    @FXML
    private DatePicker dtaAreaDtPedidoPesquisar;

    @FXML
    private DatePicker dtaAreaEntregaRealAdicionar;

    @FXML
    private DatePicker dtaAreaEntregaRealEditar;

    @FXML
    private DatePicker dtaAreaEntregaRealPesquisar;
    
    // AnchorPanes

    @FXML
    private AnchorPane paneCRUDadicionar;

    @FXML
    private AnchorPane paneCRUDeditar;

    @FXML
    private AnchorPane paneCRUDexcluir;

    @FXML
    private AnchorPane paneCRUDpesquisar;
    
    // text status error

    @FXML
    private Text status;

    @FXML
    private Text statusAdicao;

    @FXML
    private Text statusEdicao;

    @FXML
    private Text statusPesquisa;
    
    // text field - entrada de dados
    
    @FXML
    private TextField txtAreaCodRastreioAdicionar;

    @FXML
    private TextField txtAreaCodRastreioEditar;

    @FXML
    private TextField txtAreaCodRastreioPesquisar;

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
    private TextField txtAreaIDPesquisar;

    @FXML
    private TextField txtAreaIDadicionar;

    @FXML
    private TextField txtAreaIDeditar;

    @FXML
    private TextField txtAreaIDexcluir;

    @FXML
    private TextField txtAreaIdClienteAdicionar;

    @FXML
    private TextField txtAreaIdClienteEditar;

    @FXML
    private TextField txtAreaIdClientePesquisar;

    @FXML
    private TextField txtAreaIdProdutoAdicionar;

    @FXML
    private TextField txtAreaIdProdutoEditar;

    @FXML
    private TextField txtAreaIdProdutoPesquisar;

    @FXML
    private TextField txtAreaMetdEnvioAdicionar;

    @FXML
    private TextField txtAreaMetdEnvioEditar;

    @FXML
    private TextField txtAreaMetdEnvioPesquisar;

    @FXML
    private TextField txtAreaPrecoUniAdicionar;

    @FXML
    private TextField txtAreaPrecoUniEditar;

    @FXML
    private TextField txtAreaPrecoUniPesquisar;

    @FXML
    private TextField txtAreaQuantidadeAdicionar;

    @FXML
    private TextField txtAreaQuantidadeEditar;

    @FXML
    private TextField txtAreaQuantidadePesquisar;

    @FXML
    private TextField txtAreaStsPagamentoAdicionar;

    @FXML
    private TextField txtAreaStsPagamentoEditar;

    @FXML
    private TextField txtAreaStsPagamentoPesquisar;

    @FXML
    private TextField txtAreaStsPedidoAdicionar;

    @FXML
    private TextField txtAreaStsPedidoEditar;

    @FXML
    private TextField txtAreaStsPedidoPesquisar;

    @FXML
    private TextField txtAreaTotalPedidoAdicionar;

    @FXML
    private TextField txtAreaTotalPedidoEditar;

    @FXML
    private TextField txtAreaTotalPedidoPesquisar;

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
        Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/sales.fxml"));
        Scene scene = new Scene(root);
        Image applicationIcon = new Image(getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
        novoStage.getIcons().add(applicationIcon);
        novoStage.setTitle("EasyStock");
        novoStage.setResizable(false);
        novoStage.setScene(scene);
        novoStage.show();
    }

    // exibição de informações da tabela
    public void preencherTableView() {
        // Obtém a lista de pedidos
        PedidoDao pedidoDao = new PedidoDao();
        List<Pedido> pedidos = pedidoDao.listarPedidos();

        // Cria as colunas da tabela e define o valor de exibição baseado nos campos do Pedido
        TableColumn<Pedido, Integer> colunaId = new TableColumn<>("ID");
        colunaId.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Pedido, Integer> colunaIdCliente = new TableColumn<>("ID Cliente");
        colunaIdCliente.setCellValueFactory(new PropertyValueFactory<>("idCliente"));

        TableColumn<Pedido, Integer> colunaIdProduto = new TableColumn<>("ID Produto");
        colunaIdProduto.setCellValueFactory(new PropertyValueFactory<>("idProduto"));

        TableColumn<Pedido, Date> colunaDataPedido = new TableColumn<>("Data Pedido");
        colunaDataPedido.setCellValueFactory(new PropertyValueFactory<>("dataPedido"));

        TableColumn<Pedido, Date> colunaDataEntregaEstimada = new TableColumn<>("Data Entrega Estimada");
        colunaDataEntregaEstimada.setCellValueFactory(new PropertyValueFactory<>("dataEntregaEstimada"));

        TableColumn<Pedido, Date> colunaDataEntregaReal = new TableColumn<>("Data Entrega Real");
        colunaDataEntregaReal.setCellValueFactory(new PropertyValueFactory<>("dataEntregaReal"));

        TableColumn<Pedido, Integer> colunaQuantidade = new TableColumn<>("Quantidade");
        colunaQuantidade.setCellValueFactory(new PropertyValueFactory<>("quantidade"));

        TableColumn<Pedido, String> colunaStatusPedido = new TableColumn<>("Status Pedido");
        colunaStatusPedido.setCellValueFactory(new PropertyValueFactory<>("statusPedido"));

        TableColumn<Pedido, Double> colunaPrecoUnitario = new TableColumn<>("Preço Unitário");
        colunaPrecoUnitario.setCellValueFactory(new PropertyValueFactory<>("precoUnitario"));

        TableColumn<Pedido, Double> colunaTotalPedido = new TableColumn<>("Total Pedido");
        colunaTotalPedido.setCellValueFactory(new PropertyValueFactory<>("totalPedido"));

        TableColumn<Pedido, String> colunaEnderecoEntrega = new TableColumn<>("Endereço Entrega");
        colunaEnderecoEntrega.setCellValueFactory(new PropertyValueFactory<>("enderecoEntrega"));

        TableColumn<Pedido, Double> colunaCustoEnvio = new TableColumn<>("Custo Envio");
        colunaCustoEnvio.setCellValueFactory(new PropertyValueFactory<>("custoEnvio"));

        TableColumn<Pedido, String> colunaStatusPagamento = new TableColumn<>("Status Pagamento");
        colunaStatusPagamento.setCellValueFactory(new PropertyValueFactory<>("statusPagamento"));

        TableColumn<Pedido, String> colunaMetodoEnvio = new TableColumn<>("Método Envio");
        colunaMetodoEnvio.setCellValueFactory(new PropertyValueFactory<>("metodoEnvio"));

        TableColumn<Pedido, String> colunaCodigoRastreio = new TableColumn<>("Código Rastreio");
        colunaCodigoRastreio.setCellValueFactory(new PropertyValueFactory<>("codigoRastreio"));

        // Adiciona as colunas à TableView
        tablePedidos.getColumns().add(colunaId);
        tablePedidos.getColumns().add(colunaIdCliente);
        tablePedidos.getColumns().add(colunaIdProduto);
        tablePedidos.getColumns().add(colunaDataPedido);
        tablePedidos.getColumns().add(colunaDataEntregaEstimada);
        tablePedidos.getColumns().add(colunaDataEntregaReal);
        tablePedidos.getColumns().add(colunaQuantidade);
        tablePedidos.getColumns().add(colunaStatusPedido);
        tablePedidos.getColumns().add(colunaPrecoUnitario);
        tablePedidos.getColumns().add(colunaTotalPedido);
        tablePedidos.getColumns().add(colunaEnderecoEntrega);
        tablePedidos.getColumns().add(colunaCustoEnvio);
        tablePedidos.getColumns().add(colunaStatusPagamento);
        tablePedidos.getColumns().add(colunaMetodoEnvio);
        tablePedidos.getColumns().add(colunaCodigoRastreio);

       // Converte a lista de pedidos para um ObservableList
       ObservableList<Pedido> pedidosObservable = FXCollections.observableArrayList(pedidos);

       // Define os itens da TableView
       tablePedidos.setItems(pedidosObservable);
    }

    // btn opens setvisible -> AnchorPanes 
    
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
  	
  	// anchorpanes btn CRUD
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
    	
    	assert btnCRUDadicionar != null : "fx:id=\"btnCRUDadicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnCRUDeditar != null : "fx:id=\"btnCRUDeditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnCRUDexcluir != null : "fx:id=\"btnCRUDexcluir\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnCRUDpesquisar != null : "fx:id=\"btnCRUDpesquisar\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnClientpage != null : "fx:id=\"btnClientpage\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnDashbord != null : "fx:id=\"btnDashbord\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnFornecedoresPage != null : "fx:id=\"btnFornecedoresPage\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnProductPage != null : "fx:id=\"btnProductPage\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnSalespage != null : "fx:id=\"btnSalespage\" was not injected: check your FXML file 'requests.fxml'.";
        assert dtaAreaDtEntregaEstAdicionar != null : "fx:id=\"dtaAreaDtEntregaEstAdicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert dtaAreaDtEntregaEstEditar != null : "fx:id=\"dtaAreaDtEntregaEstEditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert dtaAreaDtEntregaEstPesquisar != null : "fx:id=\"dtaAreaDtEntregaEstPesquisar\" was not injected: check your FXML file 'requests.fxml'.";
        assert dtaAreaDtPedidoAdicionar != null : "fx:id=\"dtaAreaDtPedidoAdicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert dtaAreaDtPedidoEditar != null : "fx:id=\"dtaAreaDtPedidoEditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert dtaAreaDtPedidoPesquisar != null : "fx:id=\"dtaAreaDtPedidoPesquisar\" was not injected: check your FXML file 'requests.fxml'.";
        assert dtaAreaEntregaRealAdicionar != null : "fx:id=\"dtaAreaEntregaRealAdicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert dtaAreaEntregaRealEditar != null : "fx:id=\"dtaAreaEntregaRealEditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert dtaAreaEntregaRealPesquisar != null : "fx:id=\"dtaAreaEntregaRealPesquisar\" was not injected: check your FXML file 'requests.fxml'.";
        assert paneCRUDadicionar != null : "fx:id=\"paneCRUDadicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert paneCRUDeditar != null : "fx:id=\"paneCRUDeditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert paneCRUDexcluir != null : "fx:id=\"paneCRUDexcluir\" was not injected: check your FXML file 'requests.fxml'.";
        assert paneCRUDpesquisar != null : "fx:id=\"paneCRUDpesquisar\" was not injected: check your FXML file 'requests.fxml'.";
        assert status != null : "fx:id=\"status\" was not injected: check your FXML file 'requests.fxml'.";
        assert statusAdicao != null : "fx:id=\"statusAdicao\" was not injected: check your FXML file 'requests.fxml'.";
        assert statusEdicao != null : "fx:id=\"statusEdicao\" was not injected: check your FXML file 'requests.fxml'.";
        assert statusPesquisa != null : "fx:id=\"statusPesquisa\" was not injected: check your FXML file 'requests.fxml'.";
        assert tablePedidos != null : "fx:id=\"tablePedidos\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaCodRastreioAdicionar != null : "fx:id=\"txtAreaCodRastreioAdicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaCodRastreioEditar != null : "fx:id=\"txtAreaCodRastreioEditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaCodRastreioPesquisar != null : "fx:id=\"txtAreaCodRastreioPesquisar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaCustoEnvioAdicionar != null : "fx:id=\"txtAreaCustoEnvioAdicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaCustoEnvioEditar != null : "fx:id=\"txtAreaCustoEnvioEditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaCustoEnvioPesquisar != null : "fx:id=\"txtAreaCustoEnvioPesquisar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaEnderecoEntregaAdicionar != null : "fx:id=\"txtAreaEnderecoEntregaAdicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaEnderecoEntregaEditar != null : "fx:id=\"txtAreaEnderecoEntregaEditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaEnderecoEntregaPesquisar != null : "fx:id=\"txtAreaEnderecoEntregaPesquisar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaIDPesquisar != null : "fx:id=\"txtAreaIDPesquisar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaIDadicionar != null : "fx:id=\"txtAreaIDadicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaIDeditar != null : "fx:id=\"txtAreaIDeditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaIDexcluir != null : "fx:id=\"txtAreaIDexcluir\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaIdClienteAdicionar != null : "fx:id=\"txtAreaIdClienteAdicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaIdClienteEditar != null : "fx:id=\"txtAreaIdClienteEditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaIdClientePesquisar != null : "fx:id=\"txtAreaIdClientePesquisar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaIdProdutoAdicionar != null : "fx:id=\"txtAreaIdProdutoAdicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaIdProdutoEditar != null : "fx:id=\"txtAreaIdProdutoEditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaIdProdutoPesquisar != null : "fx:id=\"txtAreaIdProdutoPesquisar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaMetdEnvioAdicionar != null : "fx:id=\"txtAreaMetdEnvioAdicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaMetdEnvioEditar != null : "fx:id=\"txtAreaMetdEnvioEditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaMetdEnvioPesquisar != null : "fx:id=\"txtAreaMetdEnvioPesquisar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaPrecoUniAdicionar != null : "fx:id=\"txtAreaPrecoUniAdicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaPrecoUniEditar != null : "fx:id=\"txtAreaPrecoUniEditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaPrecoUniPesquisar != null : "fx:id=\"txtAreaPrecoUniPesquisar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaQuantidadeAdicionar != null : "fx:id=\"txtAreaQuantidadeAdicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaQuantidadeEditar != null : "fx:id=\"txtAreaQuantidadeEditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaQuantidadePesquisar != null : "fx:id=\"txtAreaQuantidadePesquisar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaStsPagamentoAdicionar != null : "fx:id=\"txtAreaStsPagamentoAdicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaStsPagamentoEditar != null : "fx:id=\"txtAreaStsPagamentoEditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaStsPagamentoPesquisar != null : "fx:id=\"txtAreaStsPagamentoPesquisar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaStsPedidoAdicionar != null : "fx:id=\"txtAreaStsPedidoAdicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaStsPedidoEditar != null : "fx:id=\"txtAreaStsPedidoEditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaStsPedidoPesquisar != null : "fx:id=\"txtAreaStsPedidoPesquisar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaTotalPedidoAdicionar != null : "fx:id=\"txtAreaTotalPedidoAdicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaTotalPedidoEditar != null : "fx:id=\"txtAreaTotalPedidoEditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert txtAreaTotalPedidoPesquisar != null : "fx:id=\"txtAreaTotalPedidoPesquisar\" was not injected: check your FXML file 'requests.fxml'.";

    }

}
