package controllers;


import java.io.IOException;

import app.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class LoginController {

    @FXML
    private TextField tfUsername;

    @FXML
    private PasswordField pfPassword;

    @FXML
    void loginWithEnter(KeyEvent event) {
        if(event.getCode().equals(KeyCode.ENTER)){
            authentication();
        }
    }

    @FXML
    void loginWithLoginButton(ActionEvent event) {
        authentication();
    }

    void authentication(){
        if(tfUsername.getText().equals("admin")
            && pfPassword.getText().equals("admin")){
            System.out.println("OK");
        }
    }
}
