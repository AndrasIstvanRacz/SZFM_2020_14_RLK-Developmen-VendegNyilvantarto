package controllers;

import app.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.tinylog.Logger;

import java.io.IOException;


public class UserWindowController {

    public static String AddOrEdit;

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

    @FXML
    void handleAdd() {
        openAddOrEdit("Add");
    }

    @FXML
    void handleEdit() {
        openAddOrEdit("Edit");
    }

    void openAddOrEdit (String type) {
        AddOrEdit = type;
        try {
            Stage parentStage  = (Stage) user.getScene().getWindow();
            AnchorPane root = FXMLLoader.load(Main.class.getResource("UserAddAndEditWindow.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(parentStage);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.getIcons().add(new Image("images/Icon.png"));
            stage.setTitle(type + " Employee");
            stage.show();
            Logger.info("Launch application success");
        } catch (IOException ex ) {
            Logger.error("Launch application failed");
        }


    }
}
