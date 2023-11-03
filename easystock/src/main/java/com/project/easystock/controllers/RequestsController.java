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
  	
  	// table
  	@FXML
    private TableView<Pedido> tablePedidos;

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

    }

}
