package controllers;

import app.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Employee;
import org.tinylog.Logger;

import java.io.IOException;

public class EmployeeWindowController {

    public static String EmployeeAddOrEdit;

    @FXML
    private BorderPane employee;

    @FXML
    private TableView<Employee> employeeTable;

    @FXML
    private TableColumn<Employee, String> columnUsername;

    @FXML
    private TableColumn<Employee, Integer> columnPermission;

    @FXML
    private TableColumn<Employee, String> columnName;

    @FXML
    private TableColumn<Employee, Integer> columnPhonenumber;

    @FXML
    private TableColumn<Employee, String> columnEmail;

    @FXML
    private TableColumn<Employee, Integer> columnZipcode;

    @FXML
    private TableColumn<Employee, String> columnCity;

    @FXML
    private TableColumn<Employee, String> columnStreetname;

    @FXML
    private TableColumn<Employee, String> columnHousenumber;

    @FXML
    private ComboBox<String> cbColumnname;

    @FXML
    private TextField tfSearch;

    private void initColumn() {
        columnUsername.setCellValueFactory(new PropertyValueFactory<>("Username"));
        columnPermission.setCellValueFactory(new PropertyValueFactory<>("Permission"));
        columnName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        columnPhonenumber.setCellValueFactory(new PropertyValueFactory<>("Phone number"));
        columnEmail.setCellValueFactory(new PropertyValueFactory<>("E-mail"));
        columnZipcode.setCellValueFactory(new PropertyValueFactory<>("Zip code"));
        columnCity.setCellValueFactory(new PropertyValueFactory<>("City"));
        columnStreetname.setCellValueFactory(new PropertyValueFactory<>("Street name"));
        columnHousenumber.setCellValueFactory(new PropertyValueFactory<>("House number"));
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