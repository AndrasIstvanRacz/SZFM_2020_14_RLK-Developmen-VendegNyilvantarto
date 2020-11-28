package controllers;

import app.Main;
import database.EmployeeRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import model.Permissions;
import model.TransferUtil;
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

    private EmployeeRepository employeeRepository = new EmployeeRepository();

    @FXML
    private TextField tfSearch;

    @FXML
    protected void initialize() {
        new Thread(() -> handleSearch()).start();
    }

    private void initColumn() {
        columnUsername.setCellValueFactory(new PropertyValueFactory<>("employeeUsername"));
        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnPhonenumber.setCellValueFactory(new PropertyValueFactory<>("phone_number"));
        columnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        columnZipcode.setCellValueFactory(new PropertyValueFactory<>("zip_code"));
        columnCity.setCellValueFactory(new PropertyValueFactory<>("city"));
        columnStreetname.setCellValueFactory(new PropertyValueFactory<>("street"));
        columnHousenumber.setCellValueFactory(new PropertyValueFactory<>("house_number"));
    }

    @FXML
    void handleSearch() {
        try {
            ObservableList<Employee> data = FXCollections.observableArrayList(
                    employeeRepository.findByColumn(getColumnName(cbColumnname.getValue().trim()),
                            tfSearch.getText().trim()));
            tfSearch.clear();
            employeeTable.setItems(data);
            initColumn();
        }catch (Exception e){
            Logger.error("Search by invalid type");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error message");
            alert.setHeaderText(null);
            alert.setContentText("Invalid data type or bad database connection.");
            alert.showAndWait();
        }

    }

    private String getColumnName(String name) {
        String columnName;
        if (name.equals("Username")) {
            columnName = "employeeUsername";
            return columnName;
        } else if (name.equals("Permission")) {
            columnName = "permissions";
            return columnName;
        } else if (name.equals("Name")) {
            columnName = "name";
            return columnName;
        } else if (name.equals("Phone number")) {
            columnName = "phone_number";
            return columnName;
        } else if (name.equals("E-mail")) {
            columnName = "email";
            return columnName;
        } else if (name.equals("Zip code")) {
            columnName = "zip_code";
            return columnName;
        } else if (name.equals("City")) {
            columnName = "city";
            return columnName;
        } else if (name.equals("Street name")) {
            columnName = "street";
            return columnName;
        } else{
            columnName = "house_number";
            return columnName;
        }
    }

    @FXML
    void handleAdd() {
        openAddOrEdit("Add");
    }

    @FXML
    void handleEdit() {
        openAddOrEdit("Edit");
        TransferUtil.employee = employeeTable.getSelectionModel().getSelectedItem();
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