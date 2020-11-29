package controllers;

import app.Main;
import database.EmfGetter;
import database.PermissionsRepository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Permissions;
import model.TransferUtil;
import org.tinylog.Logger;

import java.io.IOException;


public class LoginController {

    public static String userType;

    @FXML
    private Pane login;

    @FXML
    private TextField tfUsername;

    @FXML
    private Label labelWarning;

    @FXML
    private PasswordField pfPassword;

    private PermissionsRepository permissionsRepository = new PermissionsRepository();

    @FXML
    void initialize(){
        EmfGetter.openEmf();
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

        Permissions userPermission;
        userPermission = permissionsRepository.findByUsername(tfUsername.getText());

        if (userPermission != null && userPermission.getPassword() == null) {
            userPermission.setPassword(pfPassword.getText());
            permissionsRepository.commitChange(userPermission);

        }
        else {
            try{
                userPermission = permissionsRepository.findByUsername(tfUsername.getText());
                if (userPermission.getEmployeeUsername().equals(tfUsername.getText())
                        && userPermission.getPassword().equals(pfPassword.getText())) {
                    TransferUtil.user = tfUsername.getText();
                    if (userPermission.getPermission() == 1) {
                        Stage stage = (Stage) login.getScene().getWindow();
                        stage.close();
                        launchApplication("AdminWindow", "(Admin)");
                    } else if (userPermission.getPermission() == 0) {
                        Stage stage = (Stage) login.getScene().getWindow();
                        stage.close();
                        launchApplication("UserWindow", "(User)");
                    }
                }
                else{
                    labelWarning.setVisible(true);
                }
            }catch (NullPointerException ex){
                labelWarning.setVisible(true);
            }


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
