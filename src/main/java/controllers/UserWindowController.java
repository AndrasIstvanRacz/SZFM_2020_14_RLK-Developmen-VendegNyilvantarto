package controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class UserWindowController {

    @FXML
    private BorderPane user;

    @FXML
    private Button btnEdit;

    @FXML
    protected void initialize(){
        if(LoginController.userType.equals("(Admin)")){
            btnEdit.setDisable(false);
        } else {
            btnEdit.setDisable(true);
        }

    }
}
