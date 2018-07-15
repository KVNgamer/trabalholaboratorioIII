/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProdutoDAO;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Produtos;
import negocio.ClienteNegocio;
import negocio.ProdutoNegocio;

/**
 * FXML Controller class
 *
 * @author KEVIN
 */
public class PainelTabelaProdutoController_principal implements Initializable {

@FXML 
private TableView<Produtos> tableViewProdutos ;
@FXML 
private TableColumn<Produtos, String> tableColumnProdutoNome;
@FXML 
private TableColumn<Produtos, String> tableColumnProdutoCodigo;
@FXML 
private Button buttonInserir;
@FXML 
private Button buttonAlterar;
@FXML 
private Button buttonRemover;
@FXML 
private Label labelProdutoCodigo;
@FXML 
private Label labelProdutoNome;
@FXML 
private Label labelProdutoPreco;

    
    
private List<Produtos> listaProduto;
private ObservableList<Produtos> observableListProduto;

private Produtos ProdutoSelecionado;

private ObservableList<Produtos> observableListaProdutos;
private ProdutoNegocio ProdutoNegocio;

//private final Database database = DatabaseFactory.getDatabase("postgresql");
//private final conne
//private final  ProdutoDAO produtoDAO = new ProdutoDAO();
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           ProdutoNegocio = new ProdutoNegocio();

        if (tableViewProdutos != null) {
            carregarTableViewClientes();
        } // TODO
    }    

    private void carregarTableViewClientes() {
        tableColumnProdutoNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        tableColumnProdutoCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
    
        listaProduto = ProdutoNegocio.listar();
        
        observableListaProdutos = FXCollections.observableArrayList(listaProduto);
        tableViewProdutos.setItems(observableListaProdutos);
    }
    
}
