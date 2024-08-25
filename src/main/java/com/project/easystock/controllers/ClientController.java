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
import com.project.easystock.model.Fornecedor;

public class ClientController {
	
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

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
    
    @FXML
    private AnchorPane confirmationIDAnchorPane;
    
    // confirm ID - edição
    @FXML
    private TextField txtAreaIDconfirm;
    
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
    
    //PESQUISAR
    @FXML
    private TextField txtAreaContatoPesquisar;
    
    @FXML
    private TextField txtAreaCpfCnpjPesquisar;
    
    @FXML
    private TextField txtAreaEnderecoPesquisar;
    
    @FXML
    private TextField txtAreaIDpesquisar;
    
    @FXML
    private TextField txtAreaNomePesquisar;
    
    @FXML
    private TextField txtAreaStsClientePesquisar;
    
    @FXML
    private TextField txtAreaStsPedidoPesquisar;
    
    @FXML
    private TextField txtAreaTipoPesquisar;
    
    // ADICIONAR
    @FXML
    private TextField txtAreaContatoAdicionar;
    
    @FXML
    private TextField txtAreaCpfCnpjAdicionar;
    
    @FXML
    private TextField txtAreaEnderecoAdicionar;
    
    @FXML
    private TextField txtAreaIDAdicionar;
    
    @FXML
    private TextField txtAreaNomeAdicionar;
    
    @FXML
    private TextField txtAreaStsClienteAdicionar;
    
    @FXML
    private TextField txtAreaStsPedidoAdicionar;
    
    @FXML
    private TextField txtAreaTipoAdicionar;
    
    // EDITAR
    @FXML
    private TextField txtAreaContatoEditar;

    @FXML
    private TextField txtAreaCpfCnpjEditar;

    @FXML
    private TextField txtAreaEnderecoEditar;
    
    @FXML
    private TextField txtAreaNomeEditar;
    
    @FXML
    private TextField txtAreaStsClienteEditar;
    
    @FXML
    private TextField txtAreaStsPedidoEditar;
    
    @FXML
    private TextField txtAreaTipoEditar;
    
    // EXCLUIR
    @FXML
    private TextField txtAreaIDExcluir;

    // --> NAVEGAÇÃO

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
    
    // --> EXIBIÇÃO TABELA
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
    
    // CRUD btn
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
 	// end CRUD btn
 	
 	
 	// btn anchorPanes CRUD
	// ADICIONAR
 	@FXML
    void btnAplicarAdicao(ActionEvent event) {
 		Cliente cliente = new Cliente();

 		cliente.setId((int) Long.parseLong(txtAreaIDAdicionar.getText()));
 		cliente.setNome(txtAreaNomeAdicionar.getText());
 		cliente.setTipo(txtAreaTipoAdicionar.getText());
 		cliente.setEndereco(txtAreaEnderecoAdicionar.getText());
 		cliente.setCpfCnpj(txtAreaCpfCnpjAdicionar.getText());
 		cliente.setContato(txtAreaContatoAdicionar.getText());
 		cliente.setStatusPedido(txtAreaStsPedidoAdicionar.getText());
 		cliente.setStatusCliente(txtAreaStsClienteAdicionar.getText());

 		ClienteDao clienteDao = new ClienteDao();
 		if(clienteDao.inserirCliente(cliente)) {
 		    System.out.println("Cliente adicionado com sucesso!");

 		    // Chama a função listarClientes e atualiza a TableView com os resultados
 		    List<Cliente> clientes = clienteDao.listarClientes();
 		    // Converte a lista de clientes para um ObservableList
 		    ObservableList<Cliente> clientesObservable = FXCollections.observableArrayList(clientes);
 		    // Define os itens da TableView
 		    clientTable.setItems(clientesObservable);
 		    
 		    txtAreaCpfCnpjAdicionar.clear();
 		    txtAreaContatoAdicionar.clear();
 		    txtAreaEnderecoAdicionar.clear();
 		    txtAreaIDAdicionar.clear();
 		    txtAreaNomeAdicionar.clear();
 		    txtAreaStsClienteAdicionar.clear();
 		    txtAreaStsPedidoAdicionar.clear();
 		    txtAreaTipoAdicionar.clear();
 		    paneCRUDadicionar.setVisible(false);
 		} else {
 		    System.out.println("Falha ao adicionar o cliente.");
 		    statusEdicao.setVisible(true);
 		}

    }
 	
 	@FXML
    void btnCancelarAdicao(ActionEvent event) {
 			txtAreaCpfCnpjAdicionar.clear();
		    txtAreaContatoAdicionar.clear();
		    txtAreaEnderecoAdicionar.clear();
		    txtAreaIDAdicionar.clear();
		    txtAreaNomeAdicionar.clear();
		    txtAreaStsClienteAdicionar.clear();
		    txtAreaStsPedidoAdicionar.clear();
		    txtAreaTipoAdicionar.clear();
		    paneCRUDadicionar.setVisible(false);
    }
 	
 	@FXML
    void btnLimparAdicao(ActionEvent event) {
 			txtAreaCpfCnpjAdicionar.clear();
		    txtAreaContatoAdicionar.clear();
		    txtAreaEnderecoAdicionar.clear();
		    txtAreaIDAdicionar.clear();
		    txtAreaNomeAdicionar.clear();
		    txtAreaStsClienteAdicionar.clear();
		    txtAreaStsPedidoAdicionar.clear();
		    txtAreaTipoAdicionar.clear();
    }
 	
 	
 	// EDITAR
    @FXML
    void btnAplicarEdicao(ActionEvent event) {
    	Cliente cliente = clientTable.getItems().stream().filter(c -> c.getId() == Integer.parseInt(txtAreaIDconfirm.getText())).collect(Collectors.toList()).get(0);
    	ClienteDao clienteDao = new ClienteDao();

    	if (!cliente.getNome().equals(txtAreaNomeEditar.getText())) {
    	    cliente.setNome(txtAreaNomeEditar.getText());
    	}

    	if (!cliente.getTipo().equals(txtAreaTipoEditar.getText())) {
    	    cliente.setTipo(txtAreaTipoEditar.getText());
    	}

    	if (!cliente.getEndereco().equals(txtAreaEnderecoEditar.getText())) {
    	    cliente.setEndereco(txtAreaEnderecoEditar.getText());
    	}

    	if (!cliente.getCpfCnpj().equals(txtAreaCpfCnpjEditar.getText())) {
    	    cliente.setCpfCnpj(txtAreaCpfCnpjEditar.getText());
    	}

    	if (!cliente.getContato().equals(txtAreaContatoEditar.getText())) {
    	    cliente.setContato(txtAreaContatoEditar.getText());
    	}

    	if (!cliente.getStatusPedido().equals(txtAreaStsPedidoEditar.getText())) {
    	    cliente.setStatusPedido(txtAreaStsPedidoEditar.getText());
    	}

    	if (!cliente.getStatusCliente().equals(txtAreaStsClienteEditar.getText())) {
    	    cliente.setStatusCliente(txtAreaStsClienteEditar.getText());
    	}

    	if(clienteDao.editarCliente(cliente)) {
    	    System.out.println("Cliente editado com sucesso!");

    	    // Chama a função buscarClientes e atualiza a TableView com os resultados
    	    List<Cliente> clientes = clienteDao.buscarClientes(cliente);
    	    // Converte a lista de clientes para um ObservableList
    	    ObservableList<Cliente> clientesObservable = FXCollections.observableArrayList(clientes);
    	    // Define os itens da TableView
    	    clientTable.setItems(clientesObservable);
    	    
    	    txtAreaCpfCnpjEditar.clear();
    	    txtAreaContatoEditar.clear();
    	    txtAreaEnderecoEditar.clear();
    	    txtAreaNomeEditar.clear();
    	    txtAreaStsClienteEditar.clear();
    	    txtAreaStsPedidoEditar.clear();
    	    txtAreaTipoEditar.clear();
    	    paneCRUDeditar.setVisible(false);

    	} else {
    	    System.out.println("Falha ao editar o cliente.");
    	    statusEdicao.setVisible(true); // Tornar statusEdicao visível aqui
    	}

    }
    
    @FXML
    void btnCancelarEdicao(ActionEvent event) {
    	txtAreaCpfCnpjEditar.clear();
	    txtAreaContatoEditar.clear();
	    txtAreaEnderecoEditar.clear();
	    txtAreaNomeEditar.clear();
	    txtAreaStsClienteEditar.clear();
	    txtAreaStsPedidoEditar.clear();
	    txtAreaTipoEditar.clear();
	    paneCRUDeditar.setVisible(false);
    }
    
    @FXML
    void btnLimparEdicao(ActionEvent event) {
    	txtAreaCpfCnpjEditar.clear();
	    txtAreaContatoEditar.clear();
	    txtAreaEnderecoEditar.clear();
	    txtAreaNomeEditar.clear();
	    txtAreaStsClienteEditar.clear();
	    txtAreaStsPedidoEditar.clear();
	    txtAreaTipoEditar.clear();
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
    	    Cliente cliente = clientTable.getItems().stream().filter(c -> c.getId() == id).collect(Collectors.toList()).get(0);
    	    
    	    confirmationIDAnchorPane.setVisible(false);
    	    paneCRUDeditar.setVisible(true);
    	    
    	    if (cliente != null) {
    	        txtAreaNomeEditar.setText(cliente.getNome());
    	        txtAreaTipoEditar.setText(cliente.getTipo());
    	        txtAreaEnderecoEditar.setText(cliente.getEndereco());
    	        txtAreaCpfCnpjEditar.setText(cliente.getCpfCnpj());
    	        txtAreaContatoEditar.setText(cliente.getContato());
    	        txtAreaStsPedidoEditar.setText(cliente.getStatusPedido());
    	        txtAreaStsClienteEditar.setText(cliente.getStatusCliente());
    	    }
    	}


    }
    
    
    // EXCLUIR
    @FXML
    void btnAplicarExclusao(ActionEvent event) {
    	if (!txtAreaIDExcluir.getText().isEmpty()) {
    	    int id = Integer.parseInt(txtAreaIDExcluir.getText());
    	    ClienteDao clienteDao = new ClienteDao();
    	    boolean resultado = clienteDao.deletarCliente(id);
    	    List<Cliente> clientes = clienteDao.listarClientes();
    	    ObservableList<Cliente> clientesObservable = FXCollections.observableArrayList(clientes);
    	    clientTable.setItems(clientesObservable);
    	    txtAreaIDExcluir.clear();
    	    
    	    if (!resultado) {
    	        txtAreaIDExcluir.clear();
    	        statusExclusao.setVisible(true);
    	    }
    	}

    }
    
    @FXML
    void btnCancelarExclusao(ActionEvent event) {
    	txtAreaIDExcluir.clear();
    	paneCRUDexcluir.setVisible(false);
    }
    
    @FXML
    void btnLimparExclusao(ActionEvent event) {
    	txtAreaIDExcluir.clear();
    }
    
    
    // PESQUISAR
    @FXML
    void btnAplicarPesquisa(ActionEvent event) {
    	Cliente cliente = new Cliente();

        if (!txtAreaIDpesquisar.getText().isEmpty()) {
            cliente.setId(Integer.parseInt(txtAreaIDpesquisar.getText()));
        }

        if (!txtAreaNomePesquisar.getText().isEmpty()) {
            cliente.setNome(txtAreaNomePesquisar.getText());
        }

        if (!txtAreaTipoPesquisar.getText().isEmpty()) {
            cliente.setTipo(txtAreaTipoPesquisar.getText());
        }

        if (!txtAreaEnderecoPesquisar.getText().isEmpty()) {
            cliente.setEndereco(txtAreaEnderecoPesquisar.getText());
        }

        if (!txtAreaCpfCnpjPesquisar.getText().isEmpty()) {
            cliente.setCpfCnpj(txtAreaCpfCnpjPesquisar.getText());
        }

        if (!txtAreaContatoPesquisar.getText().isEmpty()) {
            cliente.setContato(txtAreaContatoPesquisar.getText());
        }

        if (!txtAreaStsPedidoPesquisar.getText().isEmpty()) {
            cliente.setStatusPedido(txtAreaStsPedidoPesquisar.getText());
        }

        if (!txtAreaStsClientePesquisar.getText().isEmpty()) {
            cliente.setStatusCliente(txtAreaStsClientePesquisar.getText());
        }

        ClienteDao clienteDao = new ClienteDao();
        List<Cliente> clientes = clienteDao.buscarClientes(cliente);
        ObservableList<Cliente> clientesObservable = FXCollections.observableArrayList(clientes);
        clientTable.setItems(clientesObservable);

        txtAreaCpfCnpjPesquisar.clear();
        txtAreaContatoPesquisar.clear();
        txtAreaEnderecoPesquisar.clear();
        txtAreaIDpesquisar.clear();
        txtAreaNomePesquisar.clear();
        txtAreaStsClientePesquisar.clear();
        txtAreaStsPedidoPesquisar.clear();
        txtAreaTipoPesquisar.clear();
    }
    
    @FXML
    void btnCancelarPesquisa(ActionEvent event) {
    	txtAreaCpfCnpjPesquisar.clear();
        txtAreaContatoPesquisar.clear();
        txtAreaEnderecoPesquisar.clear();
        txtAreaIDpesquisar.clear();
        txtAreaNomePesquisar.clear();
        txtAreaStsClientePesquisar.clear();
        txtAreaStsPedidoPesquisar.clear();
        txtAreaTipoPesquisar.clear();
        paneCRUDpesquisar.setVisible(false);
    }
    
    @FXML
    void btnLimparPesquisa(ActionEvent event) {
    	txtAreaCpfCnpjPesquisar.clear();
        txtAreaContatoPesquisar.clear();
        txtAreaEnderecoPesquisar.clear();
        txtAreaIDpesquisar.clear();
        txtAreaNomePesquisar.clear();
        txtAreaStsClientePesquisar.clear();
        txtAreaStsPedidoPesquisar.clear();
        txtAreaTipoPesquisar.clear();
    }
    
    @FXML
    void initialize() {
    	preencherTableView();
    	
    	assert btnCRUDadicionar != null : "fx:id=\"btnCRUDadicionar\" was not injected: check your FXML file 'client.fxml'.";
        assert btnCRUDeditar != null : "fx:id=\"btnCRUDeditar\" was not injected: check your FXML file 'client.fxml'.";
        assert btnCRUDexcluir != null : "fx:id=\"btnCRUDexcluir\" was not injected: check your FXML file 'client.fxml'.";
        assert btnCRUDpesquisar != null : "fx:id=\"btnCRUDpesquisar\" was not injected: check your FXML file 'client.fxml'.";
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
