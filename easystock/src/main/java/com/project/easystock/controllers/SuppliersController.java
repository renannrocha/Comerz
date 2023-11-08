package com.project.easystock.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

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
	
	
	// BTN NAVEGAÇÃO
	@FXML
	private Button btnClientpage;

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
	
	@FXML
    private AnchorPane confirmationIDAnchorPane;
	
	
	// text
	@FXML
	private Text statusAdicao;

	@FXML
	private Text statusEdicao;

	@FXML
	private Text statusExclusao;

	@FXML
	private Text statusPesquisa;
	
	
	// confirm ID - edição
    @FXML
    private TextField txtAreaIDconfirm;
	
    
	// text field
    // PESQUISA
    @FXML
    private TextField txtAreaCNPJPesquisa;
    
    @FXML
    private TextField txtAreaEmailPesquisa;
    
    @FXML
    private TextField txtAreaIDpesquisa;
    
    @FXML
    private TextField txtAreaMtdEnvioPesquisa;
    
    @FXML
    private TextField txtAreaNomePesquisa;
    
    @FXML
    private TextField txtAreaProdFornecidosPesquisa;
    
    @FXML
    private TextField txtAreaTelefonePesquisa;
    
    @FXML
    private TextField txtAreaTipoPesquisa;
    
    @FXML
    private TextField txtAreaTpEntregaPesquisa;
    
    
    // EDIÇÃO
    @FXML
    private TextField txtAreaIDeditar;
    
    @FXML
    private TextField txtAreaCNPJEditar;
    
    @FXML
    private TextField txtAreaEmailEditar;
    
    @FXML
    private TextField txtAreaMtdEnvioEditar;
    
    @FXML
    private TextField txtAreaNomeEditar;
    
    @FXML
    private TextField txtAreaProdFornecidosEditar;
    
    @FXML
    private TextField txtAreaTelefoneEditar;
    
    @FXML
    private TextField txtAreaTipoEditar;
    
    @FXML
    private TextField txtAreaTpEntregaEditar;
    
    
    // ADIÇÃO
    @FXML
    private TextField txtAreaCNPJadicionar;
    
    @FXML
    private TextField txtAreaEmailAdicionar;
    
    @FXML
    private TextField txtAreaIDadicionar;
    
    @FXML
    private TextField txtAreaMtdEnvioAdicionar;
    
    @FXML
    private TextField txtAreaNomeAdicionar;
    
    @FXML
    private TextField txtAreaProdFornecidosAdicionar;
    
    @FXML
    private TextField txtAreaTelefoneAdicionar;
    
    @FXML
    private TextField txtAreaTipoAdicionar;
    
    @FXML
    private TextField txtAreaTpEntregaAdicionar;
    
    
    // EXCLUSÃO
    @FXML
    private TextField txtAreaExcluir;
    

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
	

	// DEFINIÇÃO DE COLUNAS DA TABELA
	public void preencherTableView() {
	    FornecedorDao fornecedorDao = new FornecedorDao();
	    List<Fornecedor> fornecedor = fornecedorDao.listarFornecedores();
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

	    tableFornecedor.getColumns().add(colunaId);
	    tableFornecedor.getColumns().add(colunaNome);
	    tableFornecedor.getColumns().add(colunaTipo);
	    tableFornecedor.getColumns().add(colunaTelefone);
	    tableFornecedor.getColumns().add(colunaEmail);
	    tableFornecedor.getColumns().add(colunaProdutos);
	    tableFornecedor.getColumns().add(colunaTempoEntrega);
	    tableFornecedor.getColumns().add(colunaCnpj);
	    tableFornecedor.getColumns().add(colunaMetodoEnvio);

	    ObservableList<Fornecedor> fornecedoresObservable = FXCollections.observableArrayList(fornecedor);
	    tableFornecedor.setItems(fornecedoresObservable);
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

	
	// ---> CRUD FUNCTIONS	
	// ADICIONAR
	@FXML
    void btnAplicarAdicao(ActionEvent event) {
		Fornecedor fornecedor = new Fornecedor();

		fornecedor.setId((int) Long.parseLong(txtAreaIDadicionar.getText()));
		fornecedor.setNome(txtAreaNomeAdicionar.getText());
		fornecedor.setTipo(txtAreaTipoAdicionar.getText());
		fornecedor.setTelefone(txtAreaTelefoneAdicionar.getText());
		fornecedor.setEmail(txtAreaEmailAdicionar.getText());
		fornecedor.setProdutos(txtAreaProdFornecidosAdicionar.getText());
		fornecedor.setTempoEntrega(txtAreaTpEntregaAdicionar.getText());
		fornecedor.setCnpj(txtAreaCNPJadicionar.getText());
		fornecedor.setMetodoEnvio(txtAreaMtdEnvioAdicionar.getText());

		FornecedorDao fornecedorDao = new FornecedorDao();
		if(fornecedorDao.inserirFornecedor(fornecedor)) {
		    System.out.println("Fornecedor adicionado com sucesso!");

		    // Chama a função listarFornecedores e atualiza a TableView com os resultados
		    List<Fornecedor> fornecedores = fornecedorDao.listarFornecedores();
		    // Converte a lista de fornecedores para um ObservableList
		    ObservableList<Fornecedor> fornecedoresObservable = FXCollections.observableArrayList(fornecedores);
		    // Define os itens da TableView
		    tableFornecedor.setItems(fornecedoresObservable);
		    txtAreaCNPJadicionar.clear();
			txtAreaEmailAdicionar.clear();
			txtAreaIDadicionar.clear();
			txtAreaMtdEnvioAdicionar.clear();
			txtAreaNomeAdicionar.clear();
			txtAreaProdFornecidosAdicionar.clear();
			txtAreaTelefoneAdicionar.clear();
			txtAreaTipoAdicionar.clear();
			txtAreaTpEntregaAdicionar.clear();
		} else {
		    System.out.println("Falha ao adicionar o fornecedor.");
		    statusEdicao.setVisible(true);
		}
    }
	
	@FXML
    void btnCancelarAdicao(ActionEvent event) {
		txtAreaCNPJadicionar.clear();
		txtAreaEmailAdicionar.clear();
		txtAreaIDadicionar.clear();
		txtAreaMtdEnvioAdicionar.clear();
		txtAreaNomeAdicionar.clear();
		txtAreaProdFornecidosAdicionar.clear();
		txtAreaTelefoneAdicionar.clear();
		txtAreaTipoAdicionar.clear();
		txtAreaTpEntregaAdicionar.clear();
		paneCRUDadicionar.setVisible(false);
    }

	@FXML
    void btnLimparAdicao(ActionEvent event) {
		txtAreaCNPJadicionar.clear();
		txtAreaEmailAdicionar.clear();
		txtAreaIDadicionar.clear();
		txtAreaMtdEnvioAdicionar.clear();
		txtAreaNomeAdicionar.clear();
		txtAreaProdFornecidosAdicionar.clear();
		txtAreaTelefoneAdicionar.clear();
		txtAreaTipoAdicionar.clear();
		txtAreaTpEntregaAdicionar.clear();
    }
	
	
	// PESQUISAR
	@FXML
    void btnAplicarPesquisa(ActionEvent event) {
		Fornecedor fornecedor = new Fornecedor();
	    
	    if (!txtAreaIDpesquisa.getText().isEmpty()) {
	        fornecedor.setId(Integer.parseInt(txtAreaIDpesquisa.getText()));
	    }
	    
	    if (!txtAreaNomePesquisa.getText().isEmpty()) {
	        fornecedor.setNome(txtAreaNomePesquisa.getText());
	    }
	    
	    if (!txtAreaTipoPesquisa.getText().isEmpty()) {
	        fornecedor.setTipo(txtAreaTipoPesquisa.getText());
	    }
	    
	    if (!txtAreaTelefonePesquisa.getText().isEmpty()) {
	        fornecedor.setTelefone(txtAreaTelefonePesquisa.getText());
	    }
	    
	    if (!txtAreaEmailPesquisa.getText().isEmpty()) {
	        fornecedor.setEmail(txtAreaEmailPesquisa.getText());
	    }
	    
	    if (!txtAreaProdFornecidosPesquisa.getText().isEmpty()) {
	        fornecedor.setProdutos(txtAreaProdFornecidosPesquisa.getText());
	    }
	    
	    if (!txtAreaTpEntregaPesquisa.getText().isEmpty()) {
	        fornecedor.setTempoEntrega(txtAreaTpEntregaPesquisa.getText());
	    }
	    
	    if (!txtAreaCNPJPesquisa.getText().isEmpty()) {
	        fornecedor.setCnpj(txtAreaCNPJPesquisa.getText());
	    }
	    
	    if (!txtAreaMtdEnvioPesquisa.getText().isEmpty()) {
	        fornecedor.setMetodoEnvio(txtAreaMtdEnvioPesquisa.getText());
	    }

	    FornecedorDao fornecedorDao = new FornecedorDao();
	    List<Fornecedor> fornecedores = fornecedorDao.buscarFornecedores(fornecedor);
	    ObservableList<Fornecedor> fornecedoresObservable = FXCollections.observableArrayList(fornecedores);
	    tableFornecedor.setItems(fornecedoresObservable);
	    
	    txtAreaCNPJPesquisa.clear();
	    txtAreaEmailPesquisa.clear();
	    txtAreaIDpesquisa.clear();
	    txtAreaMtdEnvioPesquisa.clear();
	    txtAreaNomePesquisa.clear();
	    txtAreaProdFornecidosPesquisa.clear();
	    txtAreaTelefonePesquisa.clear();
	    txtAreaTipoPesquisa.clear();
	    txtAreaTpEntregaPesquisa.clear();
    }
	
	@FXML
    void btnCancelarPesquisa(ActionEvent event) {
		txtAreaCNPJPesquisa.clear();
	    txtAreaEmailPesquisa.clear();
	    txtAreaIDpesquisa.clear();
	    txtAreaMtdEnvioPesquisa.clear();
	    txtAreaNomePesquisa.clear();
	    txtAreaProdFornecidosPesquisa.clear();
	    txtAreaTelefonePesquisa.clear();
	    txtAreaTipoPesquisa.clear();
	    txtAreaTpEntregaPesquisa.clear();
	    paneCRUDpesquisar.setVisible(false);
	    
    }
	
	@FXML
    void btnLimparPesquisa(ActionEvent event) {
		txtAreaCNPJPesquisa.clear();
	    txtAreaEmailPesquisa.clear();
	    txtAreaIDpesquisa.clear();
	    txtAreaMtdEnvioPesquisa.clear();
	    txtAreaNomePesquisa.clear();
	    txtAreaProdFornecidosPesquisa.clear();
	    txtAreaTelefonePesquisa.clear();
	    txtAreaTipoPesquisa.clear();
	    txtAreaTpEntregaPesquisa.clear();
    }
	
	
	// EDITAR
    @FXML
    void btnAplicarEdicao(ActionEvent event) {
    	Fornecedor fornecedor = tableFornecedor.getItems().stream().filter(f -> f.getId() == Integer.parseInt(txtAreaIDconfirm.getText())).collect(Collectors.toList()).get(0);
    	FornecedorDao fornecedorDao = new FornecedorDao();

    	if (!fornecedor.getNome().equals(txtAreaNomeEditar.getText())) {
    	    fornecedor.setNome(txtAreaNomeEditar.getText());
    	}

    	if (!fornecedor.getTipo().equals(txtAreaTipoEditar.getText())) {
    	    fornecedor.setTipo(txtAreaTipoEditar.getText());
    	}

    	if (!fornecedor.getTelefone().equals(txtAreaTelefoneEditar.getText())) {
    	    fornecedor.setTelefone(txtAreaTelefoneEditar.getText());
    	}

    	if (!fornecedor.getEmail().equals(txtAreaEmailEditar.getText())) {
    	    fornecedor.setEmail(txtAreaEmailEditar.getText());
    	}

    	if (!fornecedor.getProdutos().equals(txtAreaProdFornecidosEditar.getText())) {
    	    fornecedor.setProdutos(txtAreaProdFornecidosEditar.getText());
    	}

    	if (!fornecedor.getTempoEntrega().equals(txtAreaTpEntregaEditar.getText())) {
    	    fornecedor.setTempoEntrega(txtAreaTpEntregaEditar.getText());
    	}

    	if (!fornecedor.getCnpj().equals(txtAreaCNPJEditar.getText())) {
    	    fornecedor.setCnpj(txtAreaCNPJEditar.getText());
    	}

    	if (!fornecedor.getMetodoEnvio().equals(txtAreaMtdEnvioEditar.getText())) {
    	    fornecedor.setMetodoEnvio(txtAreaMtdEnvioEditar.getText());
    	}

    	if(fornecedorDao.editarFornecedor(fornecedor)) {
    	    System.out.println("Fornecedor editado com sucesso!");

    	    // Chama a função buscarFornecedores e atualiza a TableView com os resultados
    	    List<Fornecedor> fornecedores = fornecedorDao.buscarFornecedores(fornecedor);
    	    // Converte a lista de fornecedores para um ObservableList
    	    ObservableList<Fornecedor> fornecedoresObservable = FXCollections.observableArrayList(fornecedores);
    	    // Define os itens da TableView
    	    tableFornecedor.setItems(fornecedoresObservable);
    	    
    	    txtAreaCNPJEditar.clear();
    		txtAreaEmailEditar.clear();
    		txtAreaMtdEnvioEditar.clear();
    		txtAreaNomeEditar.clear();
    		txtAreaProdFornecidosEditar.clear();
    		txtAreaTelefoneEditar.clear();
    		txtAreaTipoEditar.clear();
    		txtAreaTpEntregaEditar.clear();
        	paneCRUDeditar.setVisible(false);

    	} else {
    	    System.out.println("Falha ao editar o fornecedor.");
    	    statusEdicao.setVisible(true); // Tornar statusEdicao visível aqui
    	}

    }
    
    @FXML
    void btnCancelarEdicao(ActionEvent event) {
    	txtAreaCNPJEditar.clear();
		txtAreaEmailEditar.clear();
		txtAreaMtdEnvioEditar.clear();
		txtAreaNomeEditar.clear();
		txtAreaProdFornecidosEditar.clear();
		txtAreaTelefoneEditar.clear();
		txtAreaTipoEditar.clear();
		txtAreaTpEntregaEditar.clear();
    	paneCRUDeditar.setVisible(false);
    }
    
    @FXML
    void btnLimparEdicao(ActionEvent event) {
    	txtAreaCNPJEditar.clear();
		txtAreaEmailEditar.clear();
		txtAreaMtdEnvioEditar.clear();
		txtAreaNomeEditar.clear();
		txtAreaProdFornecidosEditar.clear();
		txtAreaTelefoneEditar.clear();
		txtAreaTipoEditar.clear();
		txtAreaTpEntregaEditar.clear();
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
    	    Fornecedor fornecedor = tableFornecedor.getItems().stream().filter(f -> f.getId() == id).collect(Collectors.toList()).get(0);
    	    
    	    confirmationIDAnchorPane.setVisible(false);
    	    paneCRUDeditar.setVisible(true);
    	    
    	    if (fornecedor != null) {
    	        txtAreaNomeEditar.setText(fornecedor.getNome());
    	        txtAreaTipoEditar.setText(fornecedor.getTipo());
    	        txtAreaTelefoneEditar.setText(fornecedor.getTelefone());
    	        txtAreaEmailEditar.setText(fornecedor.getEmail());
    	        txtAreaProdFornecidosEditar.setText(fornecedor.getProdutos());
    	        txtAreaTpEntregaEditar.setText(fornecedor.getTempoEntrega());
    	        txtAreaCNPJEditar.setText(fornecedor.getCnpj());
    	        txtAreaMtdEnvioEditar.setText(fornecedor.getMetodoEnvio());
    	    }
    	}

    }

    
    // EXCLUIR
    @FXML
    void btnAplicarExclusao(ActionEvent event) {
    	if (!txtAreaExcluir.getText().isEmpty()) {
    	    int id = Integer.parseInt(txtAreaExcluir.getText());

    	    FornecedorDao fornecedorDao = new FornecedorDao();
    	    boolean resultado = fornecedorDao.deletarFornecedor(id);
    	    
    	    // Chama a função listarFornecedores e atualiza a TableView com os resultados
    	    List<Fornecedor> fornecedores = fornecedorDao.listarFornecedores();
    	    // Converte a lista de fornecedores para um ObservableList
    	    ObservableList<Fornecedor> fornecedoresObservable = FXCollections.observableArrayList(fornecedores);
    	    // Define os itens da TableView
    	    tableFornecedor.setItems(fornecedoresObservable);
    	    txtAreaExcluir.clear();
    	    
    	    if (!resultado) {
    	    	txtAreaExcluir.clear();
    	        statusExclusao.setVisible(true);
    	    }
    	}

    }
    
    @FXML
    void btnCancelarExclusao(ActionEvent event) {
    	txtAreaExcluir.clear();
    	paneCRUDexcluir.setVisible(false);
    }

    @FXML
    void btnLimparExclusao(ActionEvent event) {
    	txtAreaExcluir.clear();
    }

    
	@FXML
	void initialize() {
		preencherTableView();
		
		assert btnCRUDadicionar != null : "fx:id=\"btnCRUDadicionar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert btnCRUDeditar != null : "fx:id=\"btnCRUDeditar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert btnCRUDexcluir != null : "fx:id=\"btnCRUDexcluir\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert btnCRUDpesquisar != null : "fx:id=\"btnCRUDpesquisar\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert btnClientpage != null : "fx:id=\"btnClientpage\" was not injected: check your FXML file 'suppliers.fxml'.";
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
