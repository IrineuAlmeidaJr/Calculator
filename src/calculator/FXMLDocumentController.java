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
    private String displayNum = "0"; // Precisei colocar "0", 
                                    //pois, dava erro se eu realiza-se qualquer operação
                                    //sem antes ter um valor, como ele pega de displayNum
                                    //preciso zera ele.
    private boolean hasPressEqualButton = false;
    private boolean hasDot = false;
    private boolean hasOperator = false;
    private String operator;
    
    
    @FXML
    private TextField txDisplay;
    @FXML
    private Button closeButton1;
    
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
    private void evtClickNum(ActionEvent event) {
        if(!hasPressEqualButton) {
            String tempNum = ((Button)event.getSource()).getText();
            if(tempNum.equals(".")) {
                if(!hasDot) {
                    displayNum += tempNum;
                    txDisplay.setText(displayNum); 
                    hasDot = true;
                }      
                return;
            } 
            displayNum += tempNum;
            txDisplay.setText(displayNum);
            return;
        } 
        txDisplay.setText("Press operator before");                   
    }    
    
        
    @FXML
    private void pressOperator(ActionEvent event) {
        if(!hasOperator) {
            valor = Double.parseDouble(displayNum);
            displayNum = "";
            hasPressEqualButton = false;
            hasDot = false;
            hasOperator = true;
            txDisplay.setText(displayNum); 
            operator = ((Button)event.getSource()).getText();             
            return;
        }
        txDisplay.setText("Press equal before");         
    }

    @FXML
    private void opEquals(ActionEvent event) {
        switch(operator) {
            
            case "+":   
                valor += Double.parseDouble(displayNum);
                displayNum = Double.toString(valor);
                txDisplay.setText(displayNum); 
                hasOperator = false;
                hasPressEqualButton = true;
                break;
                
            case "-":   
                valor -= Double.parseDouble(displayNum);
                displayNum = Double.toString(valor);
                txDisplay.setText(displayNum);
                hasOperator = false;
                hasPressEqualButton = true;
                break;
                
            case "÷": 
                double num = Double.parseDouble(displayNum);
                if(num != 0) {
                    valor /= num;
                    displayNum = Double.toString(valor);
                    txDisplay.setText(displayNum); 
                } else {
                    displayNum = "0";
                    txDisplay.setText("Undefined");
                }  
                hasPressEqualButton = true;
                hasOperator = false;
                break;
                
            case "x":   
                valor *= Double.parseDouble(displayNum);
                displayNum = Double.toString(valor);
                txDisplay.setText(displayNum);
                hasPressEqualButton = true;
                hasOperator = false;
                break; 
                
        }
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


    @FXML
    private void evtAbout(ActionEvent event) {
        Alert alert = new  Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("CalculatorFX versão beta");
        alert.setContentText("Desenvolvido por Irineu de Almeida Júnior");
        alert.showAndWait();
    }

    @FXML
    private void evtErase(ActionEvent event) {
        hasPressEqualButton = false;
        hasDot = false;
        hasOperator = false;
        displayNum = "0";
        txDisplay.setText(displayNum);        
    }

}
