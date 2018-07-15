/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author KEVIN
 */
public class PainelPrincipalController implements Initializable {

    @FXML
    private Button ButtonCadastroCliente;
    @FXML
    private Button ButtonCadastroProduto;
    @FXML
    private AnchorPane anchorPane;   
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    
    @FXML
    public void handleBotaoCadastroCliente() throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResourcer("/controller/PainelTabelaCliente.fxml"));
        anchorPane.getChildren().setAll(a);
    
    
    }
    
    
    
    
}
