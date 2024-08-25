package com.project.easystock.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import com.project.easystock.model.Cliente;
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
  	
    // AnchorPanes

    @FXML
    private AnchorPane paneCRUDadicionar;

    @FXML
    private AnchorPane paneCRUDeditar;

    @FXML
    private AnchorPane paneCRUDexcluir;

    @FXML
    private AnchorPane paneCRUDpesquisar;
    
    @FXML
    private AnchorPane confirmationIDAnchorPane;
    
    // confirm ID - edição
    @FXML
    private TextField txtAreaIDconfirm;
    
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
    // ADICIONAR
    @FXML
    private TextField txtAreaCodRastreioAdicionar;
    
    @FXML
    private TextField txtAreaCustoEnvioAdicionar;
    
    @FXML
    private TextField txtAreaEnderecoEntregaAdicionar;
    
    @FXML
    private TextField txtAreaIDadicionar;
    
    @FXML
    private TextField txtAreaIdClienteAdicionar;
    
    @FXML
    private TextField txtAreaIdProdutoAdicionar;
    
    @FXML
    private TextField txtAreaMetdEnvioAdicionar;
    
    @FXML
    private TextField txtAreaPrecoUniAdicionar;
    
    @FXML
    private TextField txtAreaQuantidadeAdicionar;
    
    @FXML
    private TextField txtAreaStsPagamentoAdicionar;
    
    @FXML
    private TextField txtAreaStsPedidoAdicionar;
    
    @FXML
    private TextField txtAreaTotalPedidoAdicionar;
    
    
    // EDITAR
    @FXML
    private TextField txtAreaCodRastreioEditar;
    
    @FXML
    private TextField txtAreaCustoEnvioEditar;
    
    @FXML
    private TextField txtAreaEnderecoEntregaEditar;
    
    @FXML
    private TextField txtAreaIDeditar;
    
    @FXML
    private TextField txtAreaIdClienteEditar;
    
    @FXML
    private TextField txtAreaIdProdutoEditar;
    
    @FXML
    private TextField txtAreaMetdEnvioEditar;
    
    @FXML
    private TextField txtAreaPrecoUniEditar;
    
    @FXML
    private TextField txtAreaQuantidadeEditar;
    
    @FXML
    private TextField txtAreaStsPagamentoEditar;
    
    @FXML
    private TextField txtAreaStsPedidoEditar;
    
    @FXML
    private TextField txtAreaTotalPedidoEditar;
    
    
    // PESQUISAR
    @FXML
    private TextField txtAreaCodRastreioPesquisar;
    
    @FXML
    private TextField txtAreaCustoEnvioPesquisar;
    
    @FXML
    private TextField txtAreaEnderecoEntregaPesquisar;
    
    @FXML
    private TextField txtAreaIDPesquisar;
    
    @FXML
    private TextField txtAreaIdClientePesquisar;
    
    @FXML
    private TextField txtAreaIdProdutoPesquisar;
    
    @FXML
    private TextField txtAreaMetdEnvioPesquisar;
    
    @FXML
    private TextField txtAreaPrecoUniPesquisar;
    
    @FXML
    private TextField txtAreaQuantidadePesquisar;
    
    @FXML
    private TextField txtAreaStsPagamentoPesquisar;
    
    @FXML
    private TextField txtAreaStsPedidoPesquisar;
    
    @FXML
    private TextField txtAreaTotalPedidoPesquisar;
    
    
    // EXCLUIR
    @FXML
    private TextField txtAreaIDexcluir;
    
    
    // NAVEGAÇÃO
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
	private void gerenciarAdicoes(ActionEvent event){
		if (paneCRUDeditar.isVisible()) {
 			paneCRUDeditar.setVisible(false);
 			paneCRUDadicionar.setVisible(true);
 		} else if (paneCRUDexcluir.isVisible()) {
 			paneCRUDexcluir.setVisible(false);
 			paneCRUDadicionar.setVisible(true);
 		} else if(confirmationIDAnchorPane.isVisible()){
 			confirmationIDAnchorPane.setVisible(false);
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
 			confirmationIDAnchorPane.setVisible(true);
 		} else if (paneCRUDexcluir.isVisible()) {
 			paneCRUDexcluir.setVisible(false);
 			confirmationIDAnchorPane.setVisible(true);
 		} else if (paneCRUDeditar.isVisible()){ 
 			paneCRUDeditar.setVisible(false);
 			confirmationIDAnchorPane.setVisible(true);
 		} else {
 			paneCRUDpesquisar.setVisible(false);
 			confirmationIDAnchorPane.setVisible(true);
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
 		} else if(confirmationIDAnchorPane.isVisible()){
 			confirmationIDAnchorPane.setVisible(false);
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
 		} else if(confirmationIDAnchorPane.isVisible()){
 			confirmationIDAnchorPane.setVisible(false);
 			paneCRUDpesquisar.setVisible(true);
 		} else {
 			paneCRUDexcluir.setVisible(false);
 			paneCRUDpesquisar.setVisible(true);
 		}
	}
  	// fim navegação CRUD
  	
	
  	// anchorpanes btn CRUD
	// ADICIONAR
  	@FXML
  	void btnAplicarAdicao(ActionEvent event) {
  	    Pedido pedido = new Pedido();

  	    pedido.setId(Integer.parseInt(txtAreaIDadicionar.getText()));
  	    pedido.setIdCliente(Integer.parseInt(txtAreaIdClienteAdicionar.getText()));
  	    pedido.setIdProduto(Integer.parseInt(txtAreaIdProdutoAdicionar.getText()));
  	    pedido.setQuantidade(Integer.parseInt(txtAreaQuantidadeAdicionar.getText()));
  	    pedido.setStatusPedido(txtAreaStsPedidoAdicionar.getText());
  	    pedido.setPrecoUnitario(Double.parseDouble(txtAreaPrecoUniAdicionar.getText()));
  	    pedido.setTotalPedido(Double.parseDouble(txtAreaTotalPedidoAdicionar.getText()));
  	    pedido.setEnderecoEntrega(txtAreaEnderecoEntregaAdicionar.getText());
  	    pedido.setCustoEnvio(Double.parseDouble(txtAreaCustoEnvioAdicionar.getText()));
  	    pedido.setStatusPagamento(txtAreaStsPagamentoAdicionar.getText());
  	    pedido.setMetodoEnvio(txtAreaMetdEnvioAdicionar.getText());
  	    pedido.setCodigoRastreio(txtAreaCodRastreioAdicionar.getText());

  	    PedidoDao pedidoDao = new PedidoDao();
  	    if(pedidoDao.inserirPedido(pedido)) {
  	        System.out.println("Pedido adicionado com sucesso!");

  	        // Chama a função listarPedidos e atualiza a TableView com os resultados
  	        List<Pedido> pedidos = pedidoDao.listarPedidos();
  	        // Converte a lista de pedidos para um ObservableList
  	        ObservableList<Pedido> pedidosObservable = FXCollections.observableArrayList(pedidos);
  	        // Define os itens da TableView
  	        tablePedidos.setItems(pedidosObservable);
  	        
  	        txtAreaCodRastreioAdicionar.clear();
  	        txtAreaCustoEnvioAdicionar.clear();
  	        txtAreaEnderecoEntregaAdicionar.clear();
  	        txtAreaIDadicionar.clear();
  	        txtAreaIdClienteAdicionar.clear();
  	        txtAreaIdProdutoAdicionar.clear();
  	        txtAreaMetdEnvioAdicionar.clear();
  	        txtAreaPrecoUniAdicionar.clear();
  	        txtAreaQuantidadeAdicionar.clear();
  	        txtAreaStsPagamentoAdicionar.clear();
  	        txtAreaStsPedidoAdicionar.clear();
  	        txtAreaTotalPedidoAdicionar.clear();
  	        paneCRUDadicionar.setVisible(false);
  	    } else {
  	        System.out.println("Falha ao adicionar o pedido.");
  	        statusAdicao.setVisible(true);
  	    }
  	}

  	
  	@FXML
    void btnCancelarAdicao(ActionEvent event) {
  		txtAreaCodRastreioAdicionar.clear();
  		txtAreaCustoEnvioAdicionar.clear();
        txtAreaEnderecoEntregaAdicionar.clear();
        txtAreaIDadicionar.clear();
        txtAreaIdClienteAdicionar.clear();
        txtAreaIdProdutoAdicionar.clear();
        txtAreaMetdEnvioAdicionar.clear();
        txtAreaPrecoUniAdicionar.clear();
        txtAreaQuantidadeAdicionar.clear();
        txtAreaStsPagamentoAdicionar.clear();
        txtAreaStsPedidoAdicionar.clear();
        txtAreaTotalPedidoAdicionar.clear();
        paneCRUDadicionar.setVisible(false);
    }
  	
  	@FXML
    void btnLimparAdicao(ActionEvent event) {
  		txtAreaCodRastreioAdicionar.clear();
  		txtAreaCustoEnvioAdicionar.clear();
        txtAreaEnderecoEntregaAdicionar.clear();
        txtAreaIDadicionar.clear();
        txtAreaIdClienteAdicionar.clear();
        txtAreaIdProdutoAdicionar.clear();
        txtAreaMetdEnvioAdicionar.clear();
        txtAreaPrecoUniAdicionar.clear();
        txtAreaQuantidadeAdicionar.clear();
        txtAreaStsPagamentoAdicionar.clear();
        txtAreaStsPedidoAdicionar.clear();
        txtAreaTotalPedidoAdicionar.clear();
    }
  	
  	// EDITAR
    @FXML
    void btnAplicarEdicao(ActionEvent event) {
    	Pedido pedido = tablePedidos.getItems().stream().filter(p -> p.getId() == Integer.parseInt(txtAreaIDconfirm.getText())).collect(Collectors.toList()).get(0);
    	PedidoDao pedidoDao = new PedidoDao();

    	if (pedido.getIdCliente() != Integer.parseInt(txtAreaIdClienteEditar.getText())) {
    	    pedido.setIdCliente(Integer.parseInt(txtAreaIdClienteEditar.getText()));
    	}

    	if (pedido.getIdProduto() != Integer.parseInt(txtAreaIdProdutoEditar.getText())) {
    	    pedido.setIdProduto(Integer.parseInt(txtAreaIdProdutoEditar.getText()));
    	}

    	if (pedido.getQuantidade() != Integer.parseInt(txtAreaQuantidadeEditar.getText())) {
    	    pedido.setQuantidade(Integer.parseInt(txtAreaQuantidadeEditar.getText()));
    	}

    	if (!pedido.getStatusPedido().equals(txtAreaStsPedidoEditar.getText())) {
    	    pedido.setStatusPedido(txtAreaStsPedidoEditar.getText());
    	}

    	if (pedido.getPrecoUnitario() != Double.parseDouble(txtAreaPrecoUniEditar.getText())) {
    	    pedido.setPrecoUnitario(Double.parseDouble(txtAreaPrecoUniEditar.getText()));
    	}

    	if (pedido.getTotalPedido() != Double.parseDouble(txtAreaTotalPedidoEditar.getText())) {
    	    pedido.setTotalPedido(Double.parseDouble(txtAreaTotalPedidoEditar.getText()));
    	}

    	if (!pedido.getEnderecoEntrega().equals(txtAreaEnderecoEntregaEditar.getText())) {
    	    pedido.setEnderecoEntrega(txtAreaEnderecoEntregaEditar.getText());
    	}

    	if (pedido.getCustoEnvio() != Double.parseDouble(txtAreaCustoEnvioEditar.getText())) {
    	    pedido.setCustoEnvio(Double.parseDouble(txtAreaCustoEnvioEditar.getText()));
    	}

    	if (!pedido.getStatusPagamento().equals(txtAreaStsPagamentoEditar.getText())) {
    	    pedido.setStatusPagamento(txtAreaStsPagamentoEditar.getText());
    	}

    	if (!pedido.getMetodoEnvio().equals(txtAreaMetdEnvioEditar.getText())) {
    	    pedido.setMetodoEnvio(txtAreaMetdEnvioEditar.getText());
    	}

    	if (!pedido.getCodigoRastreio().equals(txtAreaCodRastreioEditar.getText())) {
    	    pedido.setCodigoRastreio(txtAreaCodRastreioEditar.getText());
    	}

    	if(pedidoDao.editarPedido(pedido)) {
    	    System.out.println("Pedido editado com sucesso!");

    	    // Chama a função buscarPedidos e atualiza a TableView com os resultados
    	    List<Pedido> pedidos = pedidoDao.buscarPedidos(pedido);
    	    // Converte a lista de pedidos para um ObservableList
    	    ObservableList<Pedido> pedidosObservable = FXCollections.observableArrayList(pedidos);
    	    // Define os itens da TableView
    	    tablePedidos.setItems(pedidosObservable);
    	    
    	    txtAreaCodRastreioEditar.clear();
    	    txtAreaCustoEnvioEditar.clear();
    	    txtAreaEnderecoEntregaEditar.clear();
    	    txtAreaIDeditar.clear();
    	    txtAreaIdClienteEditar.clear();
    	    txtAreaIdProdutoEditar.clear();
    	    txtAreaMetdEnvioEditar.clear();
    	    txtAreaPrecoUniEditar.clear();
    	    txtAreaQuantidadeEditar.clear();
    	    txtAreaStsPagamentoEditar.clear();
    	    txtAreaStsPedidoEditar.clear();
    	    txtAreaTotalPedidoEditar.clear();
    	    paneCRUDeditar.setVisible(false);

    	} else {
    	    System.out.println("Falha ao editar o pedido.");
    	    statusEdicao.setVisible(true); // Tornar statusEdicao visível aqui
    	}

    }
    
    @FXML
    void btnCancelarEdicao(ActionEvent event) {
    	txtAreaCodRastreioEditar.clear();
	    txtAreaCustoEnvioEditar.clear();
	    txtAreaEnderecoEntregaEditar.clear();
	    txtAreaIDeditar.clear();
	    txtAreaIdClienteEditar.clear();
	    txtAreaIdProdutoEditar.clear();
	    txtAreaMetdEnvioEditar.clear();
	    txtAreaPrecoUniEditar.clear();
	    txtAreaQuantidadeEditar.clear();
	    txtAreaStsPagamentoEditar.clear();
	    txtAreaStsPedidoEditar.clear();
	    txtAreaTotalPedidoEditar.clear();
	    paneCRUDeditar.setVisible(false);
    }
    
    @FXML
    void btnLimparEdicao(ActionEvent event) {
    	txtAreaCodRastreioEditar.clear();
	    txtAreaCustoEnvioEditar.clear();
	    txtAreaEnderecoEntregaEditar.clear();
	    txtAreaIDeditar.clear();
	    txtAreaIdClienteEditar.clear();
	    txtAreaIdProdutoEditar.clear();
	    txtAreaMetdEnvioEditar.clear();
	    txtAreaPrecoUniEditar.clear();
	    txtAreaQuantidadeEditar.clear();
	    txtAreaStsPagamentoEditar.clear();
	    txtAreaStsPedidoEditar.clear();
	    txtAreaTotalPedidoEditar.clear();
    }
    // CONFIRM EDITAR
    @FXML
    void btnCancelID(ActionEvent event) {
    	txtAreaIDconfirm.clear();
    	confirmationIDAnchorPane.setVisible(false);
    }
    
    @FXML
    void btnConfirmID(ActionEvent event) {
    	if (!txtAreaIDconfirm.getText().isEmpty()) {
    	    int id = Integer.parseInt(txtAreaIDconfirm.getText());
    	    Pedido pedido = tablePedidos.getItems().stream().filter(p -> p.getId() == id).collect(Collectors.toList()).get(0);
    	    
    	    confirmationIDAnchorPane.setVisible(false);
    	    paneCRUDeditar.setVisible(true);
    	    
    	    if (pedido != null) {
    	        txtAreaIdClienteEditar.setText(String.valueOf(pedido.getIdCliente()));
    	        txtAreaIdProdutoEditar.setText(String.valueOf(pedido.getIdProduto()));
    	        txtAreaQuantidadeEditar.setText(String.valueOf(pedido.getQuantidade()));
    	        txtAreaStsPedidoEditar.setText(pedido.getStatusPedido());
    	        txtAreaPrecoUniEditar.setText(String.valueOf(pedido.getPrecoUnitario()));
    	        txtAreaTotalPedidoEditar.setText(String.valueOf(pedido.getTotalPedido()));
    	        txtAreaEnderecoEntregaEditar.setText(pedido.getEnderecoEntrega());
    	        txtAreaCustoEnvioEditar.setText(String.valueOf(pedido.getCustoEnvio()));
    	        txtAreaStsPagamentoEditar.setText(pedido.getStatusPagamento());
    	        txtAreaMetdEnvioEditar.setText(pedido.getMetodoEnvio());
    	        txtAreaCodRastreioEditar.setText(pedido.getCodigoRastreio());
    	    }
    	}

    }

    
    // EXCLUIR
    @FXML
    void btnAplicarExclusao(ActionEvent event) {
    	if (!txtAreaIDexcluir.getText().isEmpty()) {
	        int id = Integer.parseInt(txtAreaIDexcluir.getText());
	        PedidoDao pedidoDao = new PedidoDao();
	        boolean resultado = pedidoDao.deletarPedido(id);
	        List<Pedido> pedidos = pedidoDao.listarPedidos();
	        ObservableList<Pedido> pedidosObservable = FXCollections.observableArrayList(pedidos);
	        tablePedidos.setItems(pedidosObservable);
	        txtAreaIDexcluir.clear();
	        
	        if (!resultado) {
	            txtAreaIDexcluir.clear();
	            status.setVisible(true);
	        }
	    }

    }
    
    @FXML
    void btnCancelarExclusao(ActionEvent event) {
    	txtAreaIDexcluir.clear();
    	paneCRUDexcluir.setVisible(false);
    }
    
    @FXML
    void btnLimparExclusao(ActionEvent event) {
    	txtAreaIDexcluir.clear();
    }
    
    
    //PESQUISAR
    @FXML
    void btnAplicarPesquisa(ActionEvent event) {
    	Pedido pedido = new Pedido();

    	if (!txtAreaIDPesquisar.getText().isEmpty()) {
    	    pedido.setId(Integer.parseInt(txtAreaIDPesquisar.getText()));
    	}

    	if (!txtAreaIdClientePesquisar.getText().isEmpty()) {
    	    pedido.setIdCliente(Integer.parseInt(txtAreaIdClientePesquisar.getText()));
    	}

    	if (!txtAreaIdProdutoPesquisar.getText().isEmpty()) {
    	    pedido.setIdProduto(Integer.parseInt(txtAreaIdProdutoPesquisar.getText()));
    	}

    	if (!txtAreaQuantidadePesquisar.getText().isEmpty()) {
    	    pedido.setQuantidade(Integer.parseInt(txtAreaQuantidadePesquisar.getText()));
    	}

    	if (!txtAreaStsPedidoPesquisar.getText().isEmpty()) {
    	    pedido.setStatusPedido(txtAreaStsPedidoPesquisar.getText());
    	}

    	if (!txtAreaPrecoUniPesquisar.getText().isEmpty()) {
    	    pedido.setPrecoUnitario(Double.parseDouble(txtAreaPrecoUniPesquisar.getText()));
    	}

    	if (!txtAreaTotalPedidoPesquisar.getText().isEmpty()) {
    	    pedido.setTotalPedido(Double.parseDouble(txtAreaTotalPedidoPesquisar.getText()));
    	}

    	if (!txtAreaEnderecoEntregaPesquisar.getText().isEmpty()) {
    	    pedido.setEnderecoEntrega(txtAreaEnderecoEntregaPesquisar.getText());
    	}

    	if (!txtAreaCustoEnvioPesquisar.getText().isEmpty()) {
    	    pedido.setCustoEnvio(Double.parseDouble(txtAreaCustoEnvioPesquisar.getText()));
    	}

    	if (!txtAreaStsPagamentoPesquisar.getText().isEmpty()) {
    	    pedido.setStatusPagamento(txtAreaStsPagamentoPesquisar.getText());
    	}

    	if (!txtAreaMetdEnvioPesquisar.getText().isEmpty()) {
    	    pedido.setMetodoEnvio(txtAreaMetdEnvioPesquisar.getText());
    	}

    	if (!txtAreaCodRastreioPesquisar.getText().isEmpty()) {
    	    pedido.setCodigoRastreio(txtAreaCodRastreioPesquisar.getText());
    	}

    	PedidoDao pedidoDao = new PedidoDao();
    	List<Pedido> pedidos = pedidoDao.buscarPedidos(pedido);
    	ObservableList<Pedido> pedidosObservable = FXCollections.observableArrayList(pedidos);
    	tablePedidos.setItems(pedidosObservable);

    	txtAreaCodRastreioPesquisar.clear();
    	txtAreaCustoEnvioPesquisar.clear();
    	txtAreaEnderecoEntregaPesquisar.clear();
    	txtAreaIDPesquisar.clear();
    	txtAreaIdClientePesquisar.clear();
    	txtAreaIdProdutoPesquisar.clear();
    	txtAreaMetdEnvioPesquisar.clear();
    	txtAreaPrecoUniPesquisar.clear();
    	txtAreaQuantidadePesquisar.clear();
    	txtAreaStsPagamentoPesquisar.clear();
    	txtAreaStsPedidoPesquisar.clear();
    	txtAreaTotalPedidoPesquisar.clear();
    }

    @FXML
    void btnCancelarPesquisa(ActionEvent event) {
    	txtAreaCodRastreioPesquisar.clear();
    	txtAreaCustoEnvioPesquisar.clear();
    	txtAreaEnderecoEntregaPesquisar.clear();
    	txtAreaIDPesquisar.clear();
    	txtAreaIdClientePesquisar.clear();
    	txtAreaIdProdutoPesquisar.clear();
    	txtAreaMetdEnvioPesquisar.clear();
    	txtAreaPrecoUniPesquisar.clear();
    	txtAreaQuantidadePesquisar.clear();
    	txtAreaStsPagamentoPesquisar.clear();
    	txtAreaStsPedidoPesquisar.clear();
    	txtAreaTotalPedidoPesquisar.clear();
    	paneCRUDpesquisar.setVisible(false);
    }

    @FXML
    void btnLimparPesquisa(ActionEvent event) {
    	txtAreaCodRastreioPesquisar.clear();
    	txtAreaCustoEnvioPesquisar.clear();
    	txtAreaEnderecoEntregaPesquisar.clear();
    	txtAreaIDPesquisar.clear();
    	txtAreaIdClientePesquisar.clear();
    	txtAreaIdProdutoPesquisar.clear();
    	txtAreaMetdEnvioPesquisar.clear();
    	txtAreaPrecoUniPesquisar.clear();
    	txtAreaQuantidadePesquisar.clear();
    	txtAreaStsPagamentoPesquisar.clear();
    	txtAreaStsPedidoPesquisar.clear();
    	txtAreaTotalPedidoPesquisar.clear();
    }

    @FXML
    void initialize() {
    	preencherTableView();
    	
    	assert btnCRUDadicionar != null : "fx:id=\"btnCRUDadicionar\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnCRUDeditar != null : "fx:id=\"btnCRUDeditar\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnCRUDexcluir != null : "fx:id=\"btnCRUDexcluir\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnCRUDpesquisar != null : "fx:id=\"btnCRUDpesquisar\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnClientpage != null : "fx:id=\"btnClientpage\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnFornecedoresPage != null : "fx:id=\"btnFornecedoresPage\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnProductPage != null : "fx:id=\"btnProductPage\" was not injected: check your FXML file 'requests.fxml'.";
        assert btnSalespage != null : "fx:id=\"btnSalespage\" was not injected: check your FXML file 'requests.fxml'.";
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
