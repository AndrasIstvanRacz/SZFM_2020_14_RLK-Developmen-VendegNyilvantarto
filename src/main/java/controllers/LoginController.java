package controllers;

import java.io.IOException;

import app.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class LoginController {

    @FXML
    void loginWithEnter(KeyEvent event) {
        if(event.getCode().equals(KeyCode.ENTER)){
            System.out.println("OK");
        }
    }

    @FXML
    void loginWithLoginButton(ActionEvent event) {
        System.out.println("OK");
    }

}
