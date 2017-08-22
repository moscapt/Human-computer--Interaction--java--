/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airmadeira;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    
    
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void confirmarLinguagem(MouseEvent event) throws IOException {
        
        Parent confirmarLinguaFXML = FXMLLoader.load(getClass().getResource("LangMenuConfirmar.fxml"));
        Scene confirmarLingua = new Scene(confirmarLinguaFXML);
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(confirmarLingua);
        stage.show();
    }
    
    @FXML
    private void voltarLingua(MouseEvent event) throws IOException {
        
        Parent voltarLinguaFXML = FXMLLoader.load(getClass().getResource("LangMenu.fxml"));
        Scene voltarLingua = new Scene(voltarLinguaFXML);
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(voltarLingua);
        stage.show();
    }
    
    @FXML
    private void selectedLangPT(MouseEvent event) throws IOException {
        
        Parent mainMenuFXML = FXMLLoader.load(getClass().getResource("MenuPrincipal.fxml"));
        Scene mainMenu = new Scene(mainMenuFXML);
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(mainMenu);
        stage.show();
    }
    
    @FXML
    private void selectedOpcoesBordo(MouseEvent event) throws IOException {
        
        Parent OpcoesBordoFXML = FXMLLoader.load(getClass().getResource("OpcoesBordo.fxml"));
        Scene opcoesBordo = new Scene(OpcoesBordoFXML);
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(opcoesBordo);
        stage.show();
    }
    
    @FXML
    private void voltarMenuPrincipal(MouseEvent event) throws IOException {
        
        Parent menuPrincipalFXML = FXMLLoader.load(getClass().getResource("MenuPrincipal.fxml"));
        Scene menuPrincipal = new Scene(menuPrincipalFXML);
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(menuPrincipal);
        stage.show();
    }
    
    @FXML
    private void vaiControloIluminacao_off(MouseEvent event) throws IOException {
        
        Parent controloIluminacao_offFXML = FXMLLoader.load(getClass().getResource("controloIluminacao_off.fxml"));
        Scene controloIluminacao_off = new Scene(controloIluminacao_offFXML);
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(controloIluminacao_off);
        stage.show();
    }
    
    @FXML
    private void vaiControloIluminacao_on(MouseEvent event) throws IOException {
        
        Parent controloIluminacao_onFXML = FXMLLoader.load(getClass().getResource("controloIluminacao_on.fxml"));
        Scene controloIluminacao_on = new Scene(controloIluminacao_onFXML);
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(controloIluminacao_on);
        stage.show();
    }
    
    @FXML
    private void vaiCamarasExteriores(MouseEvent event) throws IOException {
        
        Parent camarasExterioresFXML = FXMLLoader.load(getClass().getResource("CamarasExterioresAviao.fxml"));
        Scene camarasExteriores = new Scene(camarasExterioresFXML);
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(camarasExteriores);
        stage.show();
    }
    
    @FXML
    private void vaiCamaraMaximizada(MouseEvent event) throws IOException {
        
        Parent camaraMaximizadaFXML = FXMLLoader.load(getClass().getResource("camaraMaximizada.fxml"));
        Scene camaraMaximizada = new Scene(camaraMaximizadaFXML);
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(camaraMaximizada);
        stage.show();
    }
    
    @FXML
    private void vaiInformacoesVoo(MouseEvent event) throws IOException {
        
        Parent informacoesVooFXML = FXMLLoader.load(getClass().getResource("InformacoesVoo.fxml"));
        Scene informacoesVoo = new Scene(informacoesVooFXML);
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(informacoesVoo);
        stage.show();
    }
}
