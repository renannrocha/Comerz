package com.project.easystock.controllers;

import java.io.IOException;
import java.net.URL;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import com.project.easystock.model.Produto;
import com.project.easystock.dao.ProdutoDao;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class ProductController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	// nav bar buttons
	
	@FXML
	private Button btnClientpage;

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
	
	// date 
	
	@FXML
    private DatePicker dtaAreaDtaEntradaAdicionar;

    @FXML
    private DatePicker dtaAreaDtaEntradaPesquisa;
    
    // AnchorPane
    
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
    
    // error Text status
    
    @FXML
    private Text statusAdicao;

    @FXML
    private Text statusEdicao;

    @FXML
    private Text statusExclusao;

    @FXML
    private Text statusPesquisa;
    
    // txt
    
    // confirm ID - edição
    
    @FXML
    private TextField txtAreaIDconfirm;
    
    // adicionar
    
    @FXML
    private TextField txtAreaCategoriaAdicionar;
    
    @FXML
    private TextField txtAreaDimencoesAdicionar;
    
    @FXML
    private TextField txtAreaCodBarrasAdicionar;
    
    @FXML
    private TextField txtAreaFornecedorAdicionar;
    
    @FXML
    private TextField txtAreaIDadicionar;
    
    @FXML
    private TextField txtAreaLocArmazemAdicionar;
    
    @FXML
    private TextField txtAreaNomeAdicionar;
    
    @FXML
    private TextField txtAreaMarcaAdicionar;
    
    @FXML
    private TextField txtAreaPesoAdicionar;
    
    @FXML
    private TextField txtAreaPrecoCustoAdicionar;
    
    @FXML
    private TextField txtAreaPrecoVendaAdicionar;
    
    @FXML
    private TextField txtAreaQtdEstoqueAdicionar;
    
    @FXML
    private TextField txtAreaSKUadicionar;
    
    @FXML
    private TextField txtAreaSTSprodutoAdicionar;

    // editar
    
    @FXML
    private TextField txtAreaCategoriaEditar;
    
    @FXML
    private TextField txtAreaCodBarrasEditar;
    
    @FXML
    private TextField txtAreaDimencoesEditar;
    
    @FXML
    private TextField txtAreaFornecedorEditar;
    
    @FXML
    private TextField txtAreaLocArmazemEditar;
    
    @FXML
    private TextField txtAreaMarcaEditar;
    
    @FXML
    private TextField txtAreaNomeEditar;
    
    @FXML
    private TextField txtAreaPesoEditar;
    
    @FXML
    private TextField txtAreaPrecoCustoEditar;
    
    @FXML
    private TextField txtAreaPrecoVendaEditar;
    
    @FXML
    private TextField txtAreaQtdEstoqueEditar;
    
    @FXML
    private TextField txtAreaSKUeditar;
    
    @FXML
    private TextField txtAreaSTSprodutoEditar;
    
    //pesquisar
    
    @FXML
    private TextField txtAreaCategoriaPesquisa;

    @FXML
    private TextField txtAreaCodBarrasPesquisa;

    @FXML
    private TextField txtAreaDimencoesPesquisa;

    @FXML
    private TextField txtAreaFornecedorPesquisa;
    
    @FXML
    private TextField txtAreaIDpesquisa;
    
    @FXML
    private TextField txtAreaLocArmazemPesquisa;
    
    @FXML
    private TextField txtAreaMarcaPesquisa;
    
    @FXML
    private TextField txtAreaNomePesquisa;
    
    @FXML
    private TextField txtAreaPesoPesquisa;
    
    @FXML
    private TextField txtAreaPrecoCustoPesquisa;
    
    @FXML
    private TextField txtAreaPrecoVendaPesquisa;
    
    @FXML
    private TextField txtAreaQtdEstoquePesquisa;
    
    @FXML
    private TextField txtAreaSKUPesquisa;
    
    @FXML
    private TextField txtAreaSTSprodutoPesquisa;
    
    
    // excluir
    @FXML
    private TextField txtAreaIDexclusao;
    
	
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
	
	// configurações tabela principal
	
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
	
	// fim configuração tabela
	
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
	
	// AnchorPane buttons adicionar
	@FXML
    void btnAplicarAdicao(ActionEvent event) {
		Produto produto = new Produto();
	    
	    produto.setId(Long.parseLong(txtAreaIDadicionar.getText()));
	    produto.setNome(txtAreaNomeAdicionar.getText());
	    produto.setCategoria(txtAreaCategoriaAdicionar.getText());
	    produto.setPrecoVenda(Double.parseDouble(txtAreaPrecoVendaAdicionar.getText()));
	    produto.setPrecoCusto(Double.parseDouble(txtAreaPrecoCustoAdicionar.getText()));
	    produto.setQuantidadeEstoque(Integer.parseInt(txtAreaQtdEstoqueAdicionar.getText()));
	    produto.setFornecedor(txtAreaFornecedorAdicionar.getText());
	    produto.setLocalizacao(txtAreaLocArmazemAdicionar.getText());
	    produto.setCodigoBarras(txtAreaCodBarrasAdicionar.getText());
	    produto.setPeso(Double.parseDouble(txtAreaPesoAdicionar.getText()));
	    produto.setDimensoes(txtAreaDimencoesAdicionar.getText());
	    produto.setStatusProduto(txtAreaSTSprodutoAdicionar.getText());
	    produto.setSku(txtAreaSKUadicionar.getText());
	    produto.setMarca(txtAreaMarcaAdicionar.getText());
	    produto.setDataEntrada(new Date()); // Define a data de entrada para a data atual
	    
	    ProdutoDao produtoDao = new ProdutoDao();
	    if(produtoDao.inserirProduto(produto)) {
	        System.out.println("Produto adicionado com sucesso!");
	        
	        // Chama a função listarProdutos e atualiza a TableView com os resultados
	        List<Produto> produtos = produtoDao.listarProdutos();
	        // Converte a lista de produtos para um ObservableList
	        ObservableList<Produto> produtosObservable = FXCollections.observableArrayList(produtos);
	        // Define os itens da TableView
	        tableProdutos.setItems(produtosObservable);
	        
	    } else {
	        System.out.println("Falha ao adicionar o produto.");
	        statusEdicao.setVisible(true); // Tornar statusEdicao visível aqui
	    }
    }
	
	@FXML
    void btnCancelarAdicao(ActionEvent event) {

    }
	
	@FXML
    void btnLimparAdicao(ActionEvent event) {

    }
	
	// AnchorPane buttons Editar
    @FXML
    void btnAplicarEdicao(ActionEvent event) {
    	 Produto produto = tableProdutos.getItems().stream().filter(p-> p.getId() == Long.parseLong(txtAreaIDconfirm.getText())).collect(Collectors.toList()).get(0);
    	    ProdutoDao produtoDao = new ProdutoDao();
    	    
    	    if (!produto.getNome().equals(txtAreaNomeEditar.getText())) {
    	        produto.setNome(txtAreaNomeEditar.getText());
    	    }
    	    if (!produto.getCategoria().equals(txtAreaCategoriaEditar.getText())) {
    	        produto.setCategoria(txtAreaCategoriaEditar.getText());
    	    }
    	    if (produto.getPrecoVenda() != Double.parseDouble(txtAreaPrecoVendaEditar.getText())) {
    	        produto.setPrecoVenda(Double.parseDouble(txtAreaPrecoVendaEditar.getText()));
    	    }
    	    if (produto.getPrecoCusto() != Double.parseDouble(txtAreaPrecoCustoEditar.getText())) {
    	        produto.setPrecoCusto(Double.parseDouble(txtAreaPrecoCustoEditar.getText()));
    	    }
    	    if (produto.getQuantidadeEstoque() != Integer.parseInt(txtAreaQtdEstoqueEditar.getText())) {
    	        produto.setQuantidadeEstoque(Integer.parseInt(txtAreaQtdEstoqueEditar.getText()));
    	    }
    	    if (!produto.getFornecedor().equals(txtAreaFornecedorEditar.getText())) {
    	        produto.setFornecedor(txtAreaFornecedorEditar.getText());
    	    }
    	    if (!produto.getLocalizacao().equals(txtAreaLocArmazemEditar.getText())) {
    	        produto.setLocalizacao(txtAreaLocArmazemEditar.getText());
    	    }
    	    if (!produto.getCodigoBarras().equals(txtAreaCodBarrasEditar.getText())) {
    	        produto.setCodigoBarras(txtAreaCodBarrasEditar.getText());
    	    }
    	    if (produto.getPeso() != Double.parseDouble(txtAreaPesoEditar.getText())) {
    	        produto.setPeso(Double.parseDouble(txtAreaPesoEditar.getText()));
    	    }
    	    if (!produto.getDimensoes().equals(txtAreaDimencoesEditar.getText())) {
    	        produto.setDimensoes(txtAreaDimencoesEditar.getText());
    	    }
    	    if (!produto.getStatusProduto().equals(txtAreaSTSprodutoEditar.getText())) {
    	        produto.setStatusProduto(txtAreaSTSprodutoEditar.getText());
    	    }
    	    if (!produto.getSku().equals(txtAreaSKUeditar.getText())) {
    	        produto.setSku(txtAreaSKUeditar.getText());
    	    }
    	    if (!produto.getMarca().equals(txtAreaMarcaEditar.getText())) {
    	        produto.setMarca(txtAreaMarcaEditar.getText());
    	    }
    	    
    	    if(produtoDao.editarProduto(produto)) {
    	        System.out.println("Produto editado com sucesso!");
    	        
    	        // Chama a função buscarProdutos e atualiza a TableView com os resultados
    	        List<Produto> produtos = produtoDao.buscarProdutos(produto);
    	        // Converte a lista de produtos para um ObservableList
    	        ObservableList<Produto> produtosObservable = FXCollections.observableArrayList(produtos);
    	        // Define os itens da TableView
    	        tableProdutos.setItems(produtosObservable);
    	        
    	    } else {
    	        System.out.println("Falha ao editar o produto.");
    	        statusEdicao.setVisible(true); // Tornar statusEdicao visível aqui
    	    }
    }
    
    @FXML
    void btnCancelarEdicao(ActionEvent event) {
    	txtAreaCategoriaEditar.clear();
        txtAreaCodBarrasEditar.clear();
    	txtAreaDimencoesEditar.clear();
        txtAreaFornecedorEditar.clear();
        txtAreaLocArmazemEditar.clear();
        txtAreaMarcaEditar.clear();
    	txtAreaNomeEditar.clear();
        txtAreaPesoEditar.clear();
        txtAreaPrecoCustoEditar.clear();
        txtAreaPrecoVendaEditar.clear();
        txtAreaQtdEstoqueEditar.clear();
        txtAreaSKUeditar.clear();
        txtAreaSTSprodutoEditar.clear();
        paneCRUDeditar.setVisible(false);
    }
    
    @FXML
    void btnLimparEdicao(ActionEvent event) {
    	txtAreaCategoriaEditar.clear();
        txtAreaCodBarrasEditar.clear();
    	txtAreaDimencoesEditar.clear();
        txtAreaFornecedorEditar.clear();
        txtAreaLocArmazemEditar.clear();
        txtAreaMarcaEditar.clear();
    	txtAreaNomeEditar.clear();
        txtAreaPesoEditar.clear();
        txtAreaPrecoCustoEditar.clear();
        txtAreaPrecoVendaEditar.clear();
        txtAreaQtdEstoqueEditar.clear();
        txtAreaSKUeditar.clear();
        txtAreaSTSprodutoEditar.clear();
    }
    
    // confirmID Edição
    @FXML
    void btnCancelID(ActionEvent event) {
    	txtAreaIDconfirm.clear();
    	confirmationIDAnchorPane.setVisible(false);
    }
    
    @FXML
    void btnConfirmID(ActionEvent event) {
    	
    	if (!txtAreaIDconfirm.getText().isEmpty()) {
	        Long id = Long.parseLong(txtAreaIDconfirm.getText());
	        Produto produto = tableProdutos.getItems().stream().filter(p-> p.getId() == id).collect(Collectors.toList()).get(0);
	        
	        confirmationIDAnchorPane.setVisible(false);
	        paneCRUDeditar.setVisible(true);
	        
	        if (produto != null) {
	            txtAreaNomeEditar.setText(produto.getNome());
	            txtAreaCategoriaEditar.setText(produto.getCategoria());
	            txtAreaPrecoVendaEditar.setText(String.valueOf(produto.getPrecoVenda()));
	            txtAreaPrecoCustoEditar.setText(String.valueOf(produto.getPrecoCusto()));
	            txtAreaQtdEstoqueEditar.setText(String.valueOf(produto.getQuantidadeEstoque()));
	            txtAreaFornecedorEditar.setText(produto.getFornecedor());
	            txtAreaLocArmazemEditar.setText(produto.getLocalizacao());
	            txtAreaCodBarrasEditar.setText(produto.getCodigoBarras());
	            txtAreaPesoEditar.setText(String.valueOf(produto.getPeso()));
	            txtAreaDimencoesEditar.setText(produto.getDimensoes());
	            txtAreaSTSprodutoEditar.setText(produto.getStatusProduto());
	            txtAreaSKUeditar.setText(produto.getSku());
	            txtAreaMarcaEditar.setText(produto.getMarca());
	            }
	        }
    }

    // AnchorPane buttons Exclusão
    @FXML
    void btnAplicarExclusao(ActionEvent event) {
    	if (!txtAreaIDexclusao.getText().isEmpty()) {
            Long id = Long.parseLong(txtAreaIDexclusao.getText());

            ProdutoDao produtoDao = new ProdutoDao();
            boolean resultado = produtoDao.deletarProduto(id);
            
            // Chama a função listarProdutos e atualiza a TableView com os resultados
	        List<Produto> produtos = produtoDao.listarProdutos();
	        // Converte a lista de produtos para um ObservableList
	        ObservableList<Produto> produtosObservable = FXCollections.observableArrayList(produtos);
	        // Define os itens da TableView
	        tableProdutos.setItems(produtosObservable);
            
            if (!resultado) {
            	txtAreaIDexclusao.clear();
                statusExclusao.setVisible(true);
            }
    	}
            
    }
    
    @FXML
    void btnCancelarExcusao(ActionEvent event) {
    	txtAreaIDexclusao.clear();
    	paneCRUDexcluir.setVisible(false);
    }
    
    @FXML
    void btnLimparExclusao(ActionEvent event) {
    	txtAreaIDexclusao.clear();
    }
    
    // AnchorPane buttons Pesquisa
    @FXML
    void btnAplicarPesquisa(ActionEvent event) {
    	Produto produto = new Produto();
        
        if (!txtAreaIDpesquisa.getText().isEmpty()) {
            produto.setId(Long.parseLong(txtAreaIDpesquisa.getText()));
        }
        
        if (!txtAreaNomePesquisa.getText().isEmpty()) {
            produto.setNome(txtAreaNomePesquisa.getText());
        }
        
        if (!txtAreaCategoriaPesquisa.getText().isEmpty()) {
            produto.setCategoria(txtAreaCategoriaPesquisa.getText());
        }
        
        if (!txtAreaCodBarrasPesquisa.getText().isEmpty()) {
            produto.setCodigoBarras(txtAreaCodBarrasPesquisa.getText());
        }
        
        if (!txtAreaDimencoesPesquisa.getText().isEmpty()) {
            produto.setDimensoes(txtAreaDimencoesPesquisa.getText());
        }
        
        if (!txtAreaFornecedorPesquisa.getText().isEmpty()) {
            produto.setFornecedor(txtAreaFornecedorPesquisa.getText());
        }
        
        if (!txtAreaLocArmazemPesquisa.getText().isEmpty()) {
            produto.setLocalizacao(txtAreaLocArmazemPesquisa.getText());
        }
        
        if (!txtAreaMarcaPesquisa.getText().isEmpty()) {
            produto.setMarca(txtAreaMarcaPesquisa.getText());
        }
        
        if (!txtAreaPesoPesquisa.getText().isEmpty()) {
            produto.setPeso(Double.parseDouble(txtAreaPesoPesquisa.getText()));
        }
        
        if (!txtAreaPrecoCustoPesquisa.getText().isEmpty()) {
            produto.setPrecoCusto(Double.parseDouble(txtAreaPrecoCustoPesquisa.getText()));
        }
        
        if (!txtAreaPrecoVendaPesquisa.getText().isEmpty()) {
            produto.setPrecoVenda(Double.parseDouble(txtAreaPrecoVendaPesquisa.getText()));
        }
        
        if (!txtAreaQtdEstoquePesquisa.getText().isEmpty()) {
            produto.setQuantidadeEstoque(Integer.parseInt(txtAreaQtdEstoquePesquisa.getText()));
        }
        
        if (!txtAreaSTSprodutoPesquisa.getText().isEmpty()) {
            produto.setStatusProduto(txtAreaSTSprodutoPesquisa.getText());
        }
        
        if (!txtAreaSKUPesquisa.getText().isEmpty()) {
            produto.setSku(txtAreaSKUPesquisa.getText());
        }

        if (dtaAreaDtaEntradaPesquisa.getValue() != null) {
            LocalDate localDate = dtaAreaDtaEntradaPesquisa.getValue();
            Instant instant = Instant.from(localDate.atStartOfDay(ZoneId.systemDefault()));
            Date date = Date.from(instant);
            produto.setDataEntrada(date);
        }

        // Chama a função buscarProdutos e atualiza a TableView com os resultados
        ProdutoDao produtoDao = new ProdutoDao();
        List<Produto> produtos = produtoDao.buscarProdutos(produto);

        // Converte a lista de produtos para um ObservableList
        ObservableList<Produto> produtosObservable = FXCollections.observableArrayList(produtos);

        // Define os itens da TableView
        tableProdutos.setItems(produtosObservable);
    }
 
    @FXML
    void btnCancelarPesquisa(ActionEvent event) {
    	txtAreaCategoriaPesquisa.clear();
        txtAreaCodBarrasPesquisa.clear();
        txtAreaDimencoesPesquisa.clear();
        txtAreaFornecedorPesquisa.clear();
        txtAreaIDpesquisa.clear();
        txtAreaLocArmazemPesquisa.clear();
        txtAreaMarcaPesquisa.clear();
        txtAreaNomePesquisa.clear();
        txtAreaPesoPesquisa.clear();
        txtAreaPrecoCustoPesquisa.clear();
        txtAreaPrecoVendaPesquisa.clear();
        txtAreaQtdEstoquePesquisa.clear();
        txtAreaSKUPesquisa.clear();
        txtAreaSTSprodutoPesquisa.clear();
        dtaAreaDtaEntradaPesquisa.setValue(null);
        paneCRUDpesquisar.setVisible(false);
    }

    @FXML
    void btnLimparPesquisa(ActionEvent event) {
    	txtAreaCategoriaPesquisa.clear();
        txtAreaCodBarrasPesquisa.clear();
        txtAreaDimencoesPesquisa.clear();
        txtAreaFornecedorPesquisa.clear();
        txtAreaIDpesquisa.clear();
        txtAreaLocArmazemPesquisa.clear();
        txtAreaMarcaPesquisa.clear();
        txtAreaNomePesquisa.clear();
        txtAreaPesoPesquisa.clear();
        txtAreaPrecoCustoPesquisa.clear();
        txtAreaPrecoVendaPesquisa.clear();
        txtAreaQtdEstoquePesquisa.clear();
        txtAreaSKUPesquisa.clear();
        txtAreaSTSprodutoPesquisa.clear();
        dtaAreaDtaEntradaPesquisa.setValue(null);
    }

	@FXML
	void initialize() {
		preencherTableView();

		 	assert btnCRUDadicionar != null : "fx:id=\"btnCRUDadicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert btnCRUDeditar != null : "fx:id=\"btnCRUDeditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert btnCRUDexcluir != null : "fx:id=\"btnCRUDexcluir\" was not injected: check your FXML file 'product.fxml'.";
	        assert btnCRUDpesquisar != null : "fx:id=\"btnCRUDpesquisar\" was not injected: check your FXML file 'product.fxml'.";
	        assert btnClientpage != null : "fx:id=\"btnClientpage\" was not injected: check your FXML file 'product.fxml'.";
	        assert btnFornecedoresPage != null : "fx:id=\"btnFornecedoresPage\" was not injected: check your FXML file 'product.fxml'.";
	        assert btnRequestPage != null : "fx:id=\"btnRequestPage\" was not injected: check your FXML file 'product.fxml'.";
	        assert btnSalespage != null : "fx:id=\"btnSalespage\" was not injected: check your FXML file 'product.fxml'.";
	        assert dtaAreaDtaEntradaAdicionar != null : "fx:id=\"dtaAreaDtaEntradaAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert dtaAreaDtaEntradaPesquisa != null : "fx:id=\"dtaAreaDtaEntradaPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert paneCRUDadicionar != null : "fx:id=\"paneCRUDadicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert paneCRUDeditar != null : "fx:id=\"paneCRUDeditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert paneCRUDexcluir != null : "fx:id=\"paneCRUDexcluir\" was not injected: check your FXML file 'product.fxml'.";
	        assert paneCRUDpesquisar != null : "fx:id=\"paneCRUDpesquisar\" was not injected: check your FXML file 'product.fxml'.";
	        assert statusAdicao != null : "fx:id=\"statusAdicao\" was not injected: check your FXML file 'product.fxml'.";
	        assert statusEdicao != null : "fx:id=\"statusEdicao\" was not injected: check your FXML file 'product.fxml'.";
	        assert statusExclusao != null : "fx:id=\"statusExclusao\" was not injected: check your FXML file 'product.fxml'.";
	        assert statusPesquisa != null : "fx:id=\"statusPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert tableProdutos != null : "fx:id=\"tableProdutos\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaCategoriaAdicionar != null : "fx:id=\"txtAreaCategoriaAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaCategoriaEditar != null : "fx:id=\"txtAreaCategoriaEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaCategoriaPesquisa != null : "fx:id=\"txtAreaCategoriaPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaCodBarrasAdicionar != null : "fx:id=\"txtAreaCodBarrasAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaCodBarrasEditar != null : "fx:id=\"txtAreaCodBarrasEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaCodBarrasPesquisa != null : "fx:id=\"txtAreaCodBarrasPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaDimencoesAdicionar != null : "fx:id=\"txtAreaDimencoesAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaDimencoesEditar != null : "fx:id=\"txtAreaDimencoesEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaDimencoesPesquisa != null : "fx:id=\"txtAreaDimencoesPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaFornecedorAdicionar != null : "fx:id=\"txtAreaFornecedorAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaFornecedorEditar != null : "fx:id=\"txtAreaFornecedorEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaFornecedorPesquisa != null : "fx:id=\"txtAreaFornecedorPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaIDadicionar != null : "fx:id=\"txtAreaIDadicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaIDexclusao != null : "fx:id=\"txtAreaIDexclusao\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaIDpesquisa != null : "fx:id=\"txtAreaIDpesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaLocArmazemAdicionar != null : "fx:id=\"txtAreaLocArmazemAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaLocArmazemEditar != null : "fx:id=\"txtAreaLocArmazemEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaLocArmazemPesquisa != null : "fx:id=\"txtAreaLocArmazemPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaMarcaAdicionar != null : "fx:id=\"txtAreaMarcaAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaMarcaEditar != null : "fx:id=\"txtAreaMarcaEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaMarcaPesquisa != null : "fx:id=\"txtAreaMarcaPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaNomeAdicionar != null : "fx:id=\"txtAreaNomeAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaNomeEditar != null : "fx:id=\"txtAreaNomeEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaNomePesquisa != null : "fx:id=\"txtAreaNomePesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaPesoAdicionar != null : "fx:id=\"txtAreaPesoAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaPesoEditar != null : "fx:id=\"txtAreaPesoEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaPesoPesquisa != null : "fx:id=\"txtAreaPesoPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaPrecoCustoAdicionar != null : "fx:id=\"txtAreaPrecoCustoAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaPrecoCustoEditar != null : "fx:id=\"txtAreaPrecoCustoEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaPrecoCustoPesquisa != null : "fx:id=\"txtAreaPrecoCustoPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaPrecoVendaAdicionar != null : "fx:id=\"txtAreaPrecoVendaAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaPrecoVendaEditar != null : "fx:id=\"txtAreaPrecoVendaEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaPrecoVendaPesquisa != null : "fx:id=\"txtAreaPrecoVendaPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaQtdEstoqueAdicionar != null : "fx:id=\"txtAreaQtdEstoqueAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaQtdEstoqueEditar != null : "fx:id=\"txtAreaQtdEstoqueEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaQtdEstoquePesquisa != null : "fx:id=\"txtAreaQtdEstoquePesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaSKUPesquisa != null : "fx:id=\"txtAreaSKUPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaSKUadicionar != null : "fx:id=\"txtAreaSKUadicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaSKUeditar != null : "fx:id=\"txtAreaSKUeditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaSTSprodutoAdicionar != null : "fx:id=\"txtAreaSTSprodutoAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaSTSprodutoEditar != null : "fx:id=\"txtAreaSTSprodutoEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaSTSprodutoPesquisa != null : "fx:id=\"txtAreaSTSprodutoPesquisa\" was not injected: check your FXML file 'product.fxml'.";

	}

}
