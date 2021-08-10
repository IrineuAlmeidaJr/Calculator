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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author irineualmeidajunior
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button closeButton; 
  
    @FXML
    private TextField screen;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //TODO
    }           

    @FXML
    private void exitCalculator(ActionEvent event) {
        Platform.exit();        
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
    private void number7(ActionEvent event) {
        
    }

    @FXML
    private void number8(ActionEvent event) {
        
    }

    @FXML
    private void number9(ActionEvent event) {
        
    }

    @FXML
    private void number4(ActionEvent event) {
        
    }

    @FXML
    private void number5(ActionEvent event) {
        
    }

    @FXML
    private void number6(ActionEvent event) {
        
    }

    @FXML
    private void number1(ActionEvent event) {
        
    }

    @FXML
    private void number2(ActionEvent event) {
        
    }

    @FXML
    private void number3(ActionEvent event) {
        
    }

    @FXML
    private void number0(ActionEvent event) {
        
    }

    @FXML
    private void opEquals(ActionEvent event) {
         
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
    
    private void hasNum1() {
        
    }
    
   
    
}
