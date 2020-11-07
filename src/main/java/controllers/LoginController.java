package controllers;

import app.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javassist.bytecode.stackmap.BasicBlock;
import org.tinylog.Logger;

import java.io.IOException;


public class LoginController {

    @FXML
    private Pane login;
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
            Stage stage  = (Stage) login.getScene().getWindow();
            stage.close();
            launchApplication("AdminWindow");
        }
    }

    void launchApplication (String appInterfaceType) {
        try {
            BorderPane root = FXMLLoader.load(Main.class.getResource(appInterfaceType +".fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.getIcons().add(new Image("Images/Icon.png"));
            stage.setTitle("Vendég nyílvántartó");
            stage.show();
        } catch (IOException ex ) {
            Logger.error("FXML loading failed.");
        }


    }
}
