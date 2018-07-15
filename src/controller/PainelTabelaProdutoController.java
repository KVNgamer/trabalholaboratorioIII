/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Produtos;

/**
 * FXML Controller class
 *
 * @author KEVIN
 */
public class PainelTabelaProdutoController implements Initializable {

    
    
    @FXML
    private Label labelProdutoNome;
    @FXML
    private Label labelProdutoCodigo;
    @FXML
    private Label labelProdutoPreco;
    @FXML
    private TextField textFieldProdutoNome;
    @FXML
    private TextField textFieldProdutoCodigo;    
    @FXML
    private TextField textFieldProdutoPreco;
    @FXML
    private Button Cancelar;    
    @FXML
    private Button Salvar;
    
    
    private Stage DialogStage;
    private boolean ButtonConfirmarClicked = false;
    private Produtos produto;
    
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    /**
     * @return the DialogStage
     */
    public Stage getDialogStage() {
        return DialogStage;
    }

    /**
     * @param DialogStage the DialogStage to set
     */
    public void setDialogStage(Stage DialogStage) {
        this.DialogStage = DialogStage;
    }

    /**
     * @return the ButtonConfirmarClicked
     */
    public boolean isButtonConfirmarClicked() {
        return ButtonConfirmarClicked;
    }

    /**
     * @param ButtonConfirmarClicked the ButtonConfirmarClicked to set
     */
    public void setButtonConfirmarClicked(boolean ButtonConfirmarClicked) {
        this.ButtonConfirmarClicked = ButtonConfirmarClicked;
    }

    /**
     * @return the produto
     */
    public Produtos getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produtos produto) {
        this.produto = produto;
    }
    
    @FXML
    public void handleButtonSalvar(){
        produto.setNomeProduto(textFieldProdutoNome.getText());
        produto.setCodProduto(textFieldProdutoNome.getText());
        produto.setPrecoProduto(Double.parseDouble(textFieldProdutoNome.getText()));
        
        ButtonConfirmarClicked = true;
        DialogStage.close();
   
   }
   
    @FXML
    public void handleButtonCancelar(){
        DialogStage.close();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
