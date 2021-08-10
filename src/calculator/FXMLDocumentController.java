/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author irineualmeidajunior
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button closeButton;
    
    @FXML
    private AnchorPane display;
    
    private double valor = 0;
    private double cx;
    private double cy;
    private String displayNum = "";
    
    
    @FXML
    private TextField txDisplay;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         txDisplay.setText(""+ valor);
    }           

    @FXML
    private void exitCalculator(ActionEvent event) {
        Platform.exit(); //é melhor que systemExit        
    }

    @FXML
    private void showX(MouseEvent event) {
        closeButton.setText("x");
    }

    @FXML
    private void eraseX(MouseEvent event) {
        closeButton.setText(null);
    }
    
     @FXML
    private void evtTeclou(ActionEvent event) {
        displayNum += ((Button)event.getSource()).getText();
        txDisplay.setText(displayNum); 
        /*  
            Arrumar para quando colocar "." não colocar mais do que um.
            Colocar Botão para zerar o valores.
            Programar para o botão quando precionar para realizar a operação, mas quando permitido
        lembrando que não pode dividir por Zero. Tenho que ter pelo menos um valor para somar.

        */    
    }    
    

    @FXML
    private void opSum(ActionEvent event) {
        
    }

    @FXML
    private void opLess(ActionEvent event) {
       
    }

    @FXML
    private void opDivision(ActionEvent event) {
        
    }

    @FXML
    private void opMultiply(ActionEvent event) {
        
    }

    @FXML
    private void opEquals(ActionEvent event) {
        
    }

    @FXML
    private void mouseDragged(MouseEvent event) {
        Stage stage = ((Stage)((Node)event.getSource()).getScene().getWindow());
        stage.setX(event.getScreenX()+cx);
        stage.setY(event.getScreenY()+cy);
    }

    @FXML
    private void mousePressed(MouseEvent event) {
        Stage stage = ((Stage)((Node)event.getSource()).getScene().getWindow());
        cx=stage.getX() - event.getScreenX();
        cy=stage.getY() - event.getScreenY();

    }
    
    
//    --> Faz essa inserção com "?", como um botão ao lado do "close" 
//    @FXML
//    private void evtSobre(ActionEvent event) {
//        Alert alert = new  Alert(Alert.AlertType.INFORMATION);
//        alert.setHeaderText("CalculatorFX versão beta");
//        alert.setContentText("Desenvolvido por Irineu de Almeida Júnior");
//        alert.showAndWait();
//    }

   




}
