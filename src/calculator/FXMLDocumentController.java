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
        if(!hasNum1) {
            num1 = 7;
        } else {
            num2 = 7;
        }
    }

    @FXML
    private void number8(ActionEvent event) {
        if(!hasNum1) {
            num1 = 8;
        } else {
            num2 = 8;
        }
    }

    @FXML
    private void number9(ActionEvent event) {
        if(!hasNum1) {
            num1 = 9;
        } else {
            num2 = 9;
        }
    }

    @FXML
    private void number4(ActionEvent event) {
        if(!hasNum1) {
            num1 = 4;
        } else {
            num2 = 4;
        }
    }

    @FXML
    private void number5(ActionEvent event) {
        if(!hasNum1) {
            num1 = 5;
        } else {
            num2 = 5;
        }
    }

    @FXML
    private void number6(ActionEvent event) {
        if(!hasNum1) {
            num1 = 6;
        } else {
            num2 = 6;
        }
    }

    @FXML
    private void number1(ActionEvent event) {
        if(!hasNum1) {
            num1 = 1;
        } else {
            num2 = 7;
        }
    }

    @FXML
    private void number2(ActionEvent event) {
        if(!hasNum1) {
            num1 = 2;
        } else {
            num2 = 2;
        }
    }

    @FXML
    private void number3(ActionEvent event) {
        if(!hasNum1) {
            num1 = 3;
        } else {
            num2 = 3;
        }
    }

    @FXML
    private void number0(ActionEvent event) {
        if(!hasNum1) {
            num1 = 0;
        } else {
            num2 = 0;
        }
    }

    private void hasNum1() {
        hasNum1 = num1 >= 0;
    }

    @FXML
    private void opSum(ActionEvent event) {
        if(hasNum1) {
            op = 1;
        }
    }

    @FXML
    private void opLess(ActionEvent event) {
        if(hasNum1) {
            op = 2;
        }
    }

    @FXML
    private void opDivision(ActionEvent event) {
        if(hasNum1) {
            op = 3;
        }
    }

    @FXML
    private void opMultiply(ActionEvent event) {
        if(hasNum1) {
            op = 4;
        }
    }

    @FXML
    private void opEquals(ActionEvent event) {
        if(num1>=0 && num2>=0) {

        }
    }




}
