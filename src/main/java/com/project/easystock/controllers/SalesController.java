package com.project.easystock.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
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

import com.project.easystock.model.Pedido;
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
	    
	 // ADICIONAR
	    @FXML
	    private TextField txtAreaIdAdicionar;
	    @FXML
	    private TextField txtAreaIdClienteAdicionar;
	    @FXML
	    private TextField txtAreaIdProdutoAdicionar;
	    @FXML
	    private TextField txtAreaCustoEnvioAdicionar;
	    @FXML
	    private TextField txtAreaEnderecoEntregaAdicionar;
	    @FXML
	    private TextField txtAreaPrUnitarioAdicionar;
	    @FXML
	    private TextField txtAreaQuantidadeAdicionar;
	    @FXML
	    private TextField txtAreaStsEntregaAdicionar;
	    @FXML
	    private TextField txtAreaStsPagamentoAdicionar;
	    @FXML
	    private TextField txtAreaTotalVendaAdicionar;

	    // EDITAR
	    @FXML
	    private TextField txtAreaIdEditar;
	    @FXML
	    private TextField txtAreaIdClienteEditar;
	    @FXML
	    private TextField txtAreaIdProdutoEditar;
	    @FXML
	    private TextField txtAreaCustoEnvioEditar;
	    @FXML
	    private TextField txtAreaEnderecoEntregaEditar;
	    @FXML
	    private TextField txtAreaPrUnitarioEditar;
	    @FXML
	    private TextField txtAreaQuantidadeEditar;
	    @FXML
	    private TextField txtAreaStsEntregaEditar;
	    @FXML
	    private TextField txtAreaStsPagamentoEditar;
	    @FXML
	    private TextField txtAreaTotalVendaEditar;

	    // PESQUISAR
	    @FXML
	    private TextField txtAreaIdPesquisar;
	    @FXML
	    private TextField txtAreaIdClientePesquisar;
	    @FXML
	    private TextField txtAreaIdProdutoPesquisar;
	    @FXML
	    private TextField txtAreaCustoEnvioPesquisar;
	    @FXML
	    private TextField txtAreaEnderecoEntregaPesquisar;
	    @FXML
	    private TextField txtAreaPrUnitarioPesquisar;
	    @FXML
	    private TextField txtAreaQuantidadePesquisar;
	    @FXML
	    private TextField txtAreaStsEntregaPesquisar;
	    @FXML
	    private TextField txtAreaStsPagamentoPesquisar;
	    @FXML
	    private TextField txtAreaTotalVendaPesquisar;

	    // EXCLUIR
	    @FXML
	    private TextField txtAreaIdExcluir;


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

	        TableColumn<Venda, String> colunaEnderecoEntrega = new TableColumn<>("Endereço de Entrega");
	        colunaEnderecoEntrega.setCellValueFactory(new PropertyValueFactory<>("enderecoEntrega"));

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
	        tableVendas.getColumns().add(colunaEnderecoEntrega);
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
	  	
	  	// AnchorPanes btn CRUD functions
		// ADICAO
		@FXML
		void btnAplicarAdicao(ActionEvent event) {
		    Venda venda = new Venda();

		    venda.setId(Integer.parseInt(txtAreaIdAdicionar.getText()));
		    venda.setIdCliente(Integer.parseInt(txtAreaIdClienteAdicionar.getText()));
		    venda.setIdProduto(Integer.parseInt(txtAreaIdProdutoAdicionar.getText()));
		    venda.setQuantidade(Integer.parseInt(txtAreaQuantidadeAdicionar.getText()));
		    venda.setStatusEntrega(txtAreaStsEntregaAdicionar.getText());
		    venda.setPrecoUnitario(Double.parseDouble(txtAreaPrUnitarioAdicionar.getText()));
		    venda.setTotalVenda(Double.parseDouble(txtAreaTotalVendaAdicionar.getText()));
		    venda.setEnderecoEntrega(txtAreaEnderecoEntregaAdicionar.getText());
		    venda.setCustoEnvio(Double.parseDouble(txtAreaCustoEnvioAdicionar.getText()));
		    venda.setStatusPagamento(txtAreaStsPagamentoAdicionar.getText());

		    VendaDao vendaDao = new VendaDao();
		    if(vendaDao.inserirVenda(venda)) {
		        System.out.println("Venda adicionada com sucesso!");

		        // Chama a função buscarVendas e atualiza a TableView com os resultados
		        List<Venda> vendas = vendaDao.buscarVendas(new Venda());
		        // Converte a lista de vendas para um ObservableList
		        ObservableList<Venda> vendasObservable = FXCollections.observableArrayList(vendas);
		        // Define os itens da TableView
		        tableVendas.setItems(vendasObservable);
		        
		        txtAreaCustoEnvioAdicionar.clear();
		        txtAreaEnderecoEntregaAdicionar.clear();
		        txtAreaIdAdicionar.clear();
		        txtAreaIdClienteAdicionar.clear();
		        txtAreaIdProdutoAdicionar.clear();
		        txtAreaPrUnitarioAdicionar.clear();
		        txtAreaQuantidadeAdicionar.clear();
		        txtAreaStsPagamentoAdicionar.clear();
		        txtAreaStsEntregaAdicionar.clear();
		        txtAreaTotalVendaAdicionar.clear();
		        paneCRUDadicionar.setVisible(false);
		    } else {
		        System.out.println("Falha ao adicionar a venda.");
		        statusAdicao.setVisible(true);
		    }
		}


		@FXML
		void btnCancelarAdicao(ActionEvent event) {
			txtAreaCustoEnvioAdicionar.clear();
	        txtAreaEnderecoEntregaAdicionar.clear();
	        txtAreaIdAdicionar.clear();
	        txtAreaIdClienteAdicionar.clear();
	        txtAreaIdProdutoAdicionar.clear();
	        txtAreaPrUnitarioAdicionar.clear();
	        txtAreaQuantidadeAdicionar.clear();
	        txtAreaStsPagamentoAdicionar.clear();
	        txtAreaStsEntregaAdicionar.clear();
	        txtAreaTotalVendaAdicionar.clear();
	        paneCRUDadicionar.setVisible(false);
		}

		@FXML
		void btnLimparAdicao(ActionEvent event) {
			txtAreaCustoEnvioAdicionar.clear();
	        txtAreaEnderecoEntregaAdicionar.clear();
	        txtAreaIdAdicionar.clear();
	        txtAreaIdClienteAdicionar.clear();
	        txtAreaIdProdutoAdicionar.clear();
	        txtAreaPrUnitarioAdicionar.clear();
	        txtAreaQuantidadeAdicionar.clear();
	        txtAreaStsPagamentoAdicionar.clear();
	        txtAreaStsEntregaAdicionar.clear();
	        txtAreaTotalVendaAdicionar.clear();
		}

		// EDICAO
		@FXML
		void btnAplicarEdicao(ActionEvent event) {
			Venda venda = tableVendas.getItems().stream().filter(v -> v.getId() == Integer.parseInt(txtAreaIDconfirm.getText())).collect(Collectors.toList()).get(0);
			VendaDao vendaDao = new VendaDao();

			if (venda.getIdCliente() != Integer.parseInt(txtAreaIdClienteEditar.getText())) {
			    venda.setIdCliente(Integer.parseInt(txtAreaIdClienteEditar.getText()));
			}

			if (venda.getIdProduto() != Integer.parseInt(txtAreaIdProdutoEditar.getText())) {
			    venda.setIdProduto(Integer.parseInt(txtAreaIdProdutoEditar.getText()));
			}

			if (venda.getQuantidade() != Integer.parseInt(txtAreaQuantidadeEditar.getText())) {
			    venda.setQuantidade(Integer.parseInt(txtAreaQuantidadeEditar.getText()));
			}

			if (!venda.getStatusEntrega().equals(txtAreaStsEntregaEditar.getText())) {
			    venda.setStatusEntrega(txtAreaStsEntregaEditar.getText());
			}

			if (venda.getPrecoUnitario() != Double.parseDouble(txtAreaPrUnitarioEditar.getText())) {
			    venda.setPrecoUnitario(Double.parseDouble(txtAreaPrUnitarioEditar.getText()));
			}

			if (venda.getTotalVenda() != Double.parseDouble(txtAreaTotalVendaEditar.getText())) {
			    venda.setTotalVenda(Double.parseDouble(txtAreaTotalVendaEditar.getText()));
			}

			if (!venda.getEnderecoEntrega().equals(txtAreaEnderecoEntregaEditar.getText())) {
			    venda.setEnderecoEntrega(txtAreaEnderecoEntregaEditar.getText());
			}

			if (venda.getCustoEnvio() != Double.parseDouble(txtAreaCustoEnvioEditar.getText())) {
			    venda.setCustoEnvio(Double.parseDouble(txtAreaCustoEnvioEditar.getText()));
			}

			if (!venda.getStatusPagamento().equals(txtAreaStsPagamentoEditar.getText())) {
			    venda.setStatusPagamento(txtAreaStsPagamentoEditar.getText());
			}

			if(vendaDao.editarVenda(venda)) {
			    System.out.println("Venda editada com sucesso!");

			    // Chama a função buscarVendas e atualiza a TableView com os resultados
			    List<Venda> vendas = vendaDao.buscarVendas(venda);
			    // Converte a lista de vendas para um ObservableList
			    ObservableList<Venda> vendasObservable = FXCollections.observableArrayList(vendas);
			    // Define os itens da TableView
			    tableVendas.setItems(vendasObservable);
			    
			    txtAreaCustoEnvioEditar.clear();
			    txtAreaEnderecoEntregaEditar.clear();
			    txtAreaIDconfirm.clear();
			    txtAreaIdClienteEditar.clear();
			    txtAreaIdProdutoEditar.clear();
			    txtAreaPrUnitarioEditar.clear();
			    txtAreaQuantidadeEditar.clear();
			    txtAreaStsPagamentoEditar.clear();
			    txtAreaStsEntregaEditar.clear();
			    txtAreaTotalVendaEditar.clear();
			    paneCRUDeditar.setVisible(false);

			} else {
			    System.out.println("Falha ao editar a venda.");
			    statusEdicao.setVisible(true); // Tornar statusEdicao visível aqui
			}

		}

		@FXML
		void btnCancelarEdicao(ActionEvent event) {
			txtAreaCustoEnvioEditar.clear();
		    txtAreaEnderecoEntregaEditar.clear();
		    txtAreaIDconfirm.clear();
		    txtAreaIdClienteEditar.clear();
		    txtAreaIdProdutoEditar.clear();
		    txtAreaPrUnitarioEditar.clear();
		    txtAreaQuantidadeEditar.clear();
		    txtAreaStsPagamentoEditar.clear();
		    txtAreaStsEntregaEditar.clear();
		    txtAreaTotalVendaEditar.clear();
		    paneCRUDeditar.setVisible(false);
		}

		@FXML
		void btnLimparEdicao(ActionEvent event) {
			txtAreaCustoEnvioEditar.clear();
		    txtAreaEnderecoEntregaEditar.clear();
		    txtAreaIDconfirm.clear();
		    txtAreaIdClienteEditar.clear();
		    txtAreaIdProdutoEditar.clear();
		    txtAreaPrUnitarioEditar.clear();
		    txtAreaQuantidadeEditar.clear();
		    txtAreaStsPagamentoEditar.clear();
		    txtAreaStsEntregaEditar.clear();
		    txtAreaTotalVendaEditar.clear();
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
    	        Venda venda = tableVendas.getItems().stream().filter(v -> v.getId() == id).collect(Collectors.toList()).get(0);
    	        
    	        confirmationIDAnchorPane.setVisible(false);
    	        paneCRUDeditar.setVisible(true);
    	        
    	        if (venda != null) {
    	            txtAreaIdClienteEditar.setText(String.valueOf(venda.getIdCliente()));
    	            txtAreaIdProdutoEditar.setText(String.valueOf(venda.getIdProduto()));
    	            txtAreaQuantidadeEditar.setText(String.valueOf(venda.getQuantidade()));
    	            txtAreaStsEntregaEditar.setText(venda.getStatusEntrega());
    	            txtAreaPrUnitarioEditar.setText(String.valueOf(venda.getPrecoUnitario()));
    	            txtAreaTotalVendaEditar.setText(String.valueOf(venda.getTotalVenda()));
    	            txtAreaEnderecoEntregaEditar.setText(venda.getEnderecoEntrega());
    	            txtAreaCustoEnvioEditar.setText(String.valueOf(venda.getCustoEnvio()));
    	            txtAreaStsPagamentoEditar.setText(venda.getStatusPagamento());
    	        }
    	    }


	    }

		// EXCLUSAO
		@FXML
		void btnAplicarExclusao(ActionEvent event) {
			if (!txtAreaIdExcluir.getText().isEmpty()) {
		        int id = Integer.parseInt(txtAreaIdExcluir.getText());
		        VendaDao vendaDao = new VendaDao();
		        boolean resultado = vendaDao.deletarVenda(id);
		        List<Venda> vendas = vendaDao.buscarVendas(new Venda());
		        ObservableList<Venda> vendasObservable = FXCollections.observableArrayList(vendas);
		        tableVendas.setItems(vendasObservable);
		        txtAreaIdExcluir.clear();
		        
		        if (!resultado) {
		            txtAreaIdExcluir.clear();
		            statusExclusao.setVisible(true);
		        }
		    }

		}

		@FXML
		void btnCancelarExclusao(ActionEvent event) {
			txtAreaIdExcluir.clear();
			paneCRUDexcluir.setVisible(false);
		}

		@FXML
		void btnLimparExclusao(ActionEvent event) {
			txtAreaIdExcluir.clear();
		}

		// PESQUISA
		@FXML
		void btnAplicarPesquisa(ActionEvent event) {
			Venda venda = new Venda();

			if (!txtAreaIdPesquisar.getText().isEmpty()) {
			    venda.setId(Integer.parseInt(txtAreaIdPesquisar.getText()));
			}

			if (!txtAreaIdClientePesquisar.getText().isEmpty()) {
			    venda.setIdCliente(Integer.parseInt(txtAreaIdClientePesquisar.getText()));
			}

			if (!txtAreaIdProdutoPesquisar.getText().isEmpty()) {
			    venda.setIdProduto(Integer.parseInt(txtAreaIdProdutoPesquisar.getText()));
			}

			if (!txtAreaQuantidadePesquisar.getText().isEmpty()) {
			    venda.setQuantidade(Integer.parseInt(txtAreaQuantidadePesquisar.getText()));
			}

			if (!txtAreaStsEntregaPesquisar.getText().isEmpty()) {
			    venda.setStatusEntrega(txtAreaStsEntregaPesquisar.getText());
			}

			if (!txtAreaPrUnitarioPesquisar.getText().isEmpty()) {
			    venda.setPrecoUnitario(Double.parseDouble(txtAreaPrUnitarioPesquisar.getText()));
			}

			if (!txtAreaTotalVendaPesquisar.getText().isEmpty()) {
			    venda.setTotalVenda(Double.parseDouble(txtAreaTotalVendaPesquisar.getText()));
			}

			if (!txtAreaEnderecoEntregaPesquisar.getText().isEmpty()) {
			    venda.setEnderecoEntrega(txtAreaEnderecoEntregaPesquisar.getText());
			}

			if (!txtAreaCustoEnvioPesquisar.getText().isEmpty()) {
			    venda.setCustoEnvio(Double.parseDouble(txtAreaCustoEnvioPesquisar.getText()));
			}

			if (!txtAreaStsPagamentoPesquisar.getText().isEmpty()) {
			    venda.setStatusPagamento(txtAreaStsPagamentoPesquisar.getText());
			}

			VendaDao vendaDao = new VendaDao();
			List<Venda> vendas = vendaDao.buscarVendas(venda);
			ObservableList<Venda> vendasObservable = FXCollections.observableArrayList(vendas);
			tableVendas.setItems(vendasObservable);

			txtAreaIdPesquisar.clear();
			txtAreaIdClientePesquisar.clear();
			txtAreaIdProdutoPesquisar.clear();
			txtAreaCustoEnvioPesquisar.clear();
			txtAreaEnderecoEntregaPesquisar.clear();
			txtAreaPrUnitarioPesquisar.clear();
			txtAreaQuantidadePesquisar.clear();
			txtAreaStsEntregaPesquisar.clear();
			txtAreaStsPagamentoPesquisar.clear();
			txtAreaTotalVendaPesquisar.clear();

		}

		@FXML
		void btnCancelarPesquisa(ActionEvent event) {
			txtAreaIdPesquisar.clear();
			txtAreaIdClientePesquisar.clear();
			txtAreaIdProdutoPesquisar.clear();
			txtAreaCustoEnvioPesquisar.clear();
			txtAreaEnderecoEntregaPesquisar.clear();
			txtAreaPrUnitarioPesquisar.clear();
			txtAreaQuantidadePesquisar.clear();
			txtAreaStsEntregaPesquisar.clear();
			txtAreaStsPagamentoPesquisar.clear();
			txtAreaTotalVendaPesquisar.clear();
			paneCRUDpesquisar.setVisible(false);
		}

		@FXML
		void btnLimparPesquisa(ActionEvent event) {
			txtAreaIdPesquisar.clear();
			txtAreaIdClientePesquisar.clear();
			txtAreaIdProdutoPesquisar.clear();
			txtAreaCustoEnvioPesquisar.clear();
			txtAreaEnderecoEntregaPesquisar.clear();
			txtAreaPrUnitarioPesquisar.clear();
			txtAreaQuantidadePesquisar.clear();
			txtAreaStsEntregaPesquisar.clear();
			txtAreaStsPagamentoPesquisar.clear();
			txtAreaTotalVendaPesquisar.clear();
		}

	    @FXML
	    void initialize() {
	    	preencherTableView();
	    	
	    	assert btnCRUDadicionar != null : "fx:id=\"btnCRUDadicionar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnCRUDeditar != null : "fx:id=\"btnCRUDeditar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnCRUDexcluir != null : "fx:id=\"btnCRUDexcluir\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnCRUDpesquisar != null : "fx:id=\"btnCRUDpesquisar\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnClientpage != null : "fx:id=\"btnClientpage\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnFornecedoresPage != null : "fx:id=\"btnFornecedoresPage\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnProductPage != null : "fx:id=\"btnProductPage\" was not injected: check your FXML file 'sales.fxml'.";
	        assert btnRequestPage != null : "fx:id=\"btnRequestPage\" was not injected: check your FXML file 'sales.fxml'.";
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
