package controllers;

import app.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.tinylog.Logger;

import java.io.IOException;

public class EmployeeWindowController {

    public static String EmployeeAddOrEdit;

    @FXML
    private BorderPane employee;

    private void initColumn() {
        columnID.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));
        columnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        columnStartDate.setCellValueFactory(new PropertyValueFactory<>("startdate"));
        columnEndDate.setCellValueFactory(new PropertyValueFactory<>("enddate"));
        columnRoomType.setCellValueFactory(new PropertyValueFactory<>("roomtype"));
        columnPay.setCellValueFactory(new PropertyValueFactory<>("payment"));
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
        EmployeeAddOrEdit = type;
        try {
            Stage parentStage  = (Stage) employee.getScene().getWindow();
            AnchorPane root = FXMLLoader.load(Main.class.getResource("EmployeeAddAndEditWindow.fxml"));
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