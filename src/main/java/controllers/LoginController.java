package controllers;

import app.Main;
import database.EmfGetter;
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
import org.tinylog.Logger;

import java.io.IOException;


public class LoginController {

    public static String userType;

    @FXML
    private Pane login;

    @FXML
    private TextField tfUsername;

    @FXML
    private PasswordField pfPassword;

    @FXML
    void initialize(){
        EmfGetter.asd();
    }
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
            launchApplication("AdminWindow", "(Admin)");
        }
        else if (tfUsername.getText().equals("Rabsz Olga")
                && pfPassword.getText().equals("rOlga")){
            Stage stage  = (Stage) login.getScene().getWindow();
            stage.close();
            launchApplication("UserWindow", "(User)");
        }
    }

    void launchApplication (String appInterfaceType, String uType) {
        try {
            userType = uType;
            BorderPane root = FXMLLoader.load(Main.class.getResource(appInterfaceType +".fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.getIcons().add(new Image("images/Icon.png"));
            stage.setTitle(uType + " Data management app");
            stage.show();
            stage.setOnCloseRequest(windowEvent -> {
                EmfGetter.closeEmf();
            });
            Logger.info("Launch application success");
        } catch (IOException ex ) {
            Logger.error("Launch application failed");
        }


    }
}
