package controllers;

import database.EmfGetter;
import database.EmployeeRepository;
import database.GenericDb;
import database.PermissionsRepository;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.Employee;
import model.Permissions;
import model.TransferUtil;
import org.tinylog.Logger;

import javax.persistence.EntityManager;

import java.io.IOException;

import static java.lang.Integer.parseInt;

public class EmployeeAddAndEditWindowController {

    @FXML
    private TextField tfUsername;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfPhoneNumber;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfZipCode;

    @FXML
    private TextField tfCity;

    @FXML
    private TextField tfStreetName;

    @FXML
    private TextField tfHouseNumber;

    @FXML
    private TextField tfPermission;

    @FXML
    private Button btnDelete;

    @FXML
    private Button saveButton;

    private EmployeeRepository employeeRepository = new EmployeeRepository();

    private PermissionsRepository permissionsRepository = new PermissionsRepository();

    @FXML
    protected void initialize(){
        if(EmployeeWindowController.EmployeeAddOrEdit == "Edit"){
            tfPermission.setText(TransferUtil.employee.getPermissions().getPermission().toString());
            tfUsername.setEditable(false);
            tfUsername.setText(TransferUtil.employee.getEmployeeUsername());
            tfName.setText(TransferUtil.employee.getName());
            tfPhoneNumber.setText(TransferUtil.employee.getPhone_number().toString());
            tfCity.setText(TransferUtil.employee.getCity());
            tfEmail.setText(TransferUtil.employee.getEmail());
            tfZipCode.setText(TransferUtil.employee.getZip_code().toString());
            tfStreetName.setText(TransferUtil.employee.getStreet());
            tfHouseNumber.setText(TransferUtil.employee.getHouse_number());
            saveButton.setOnMouseClicked(mouseEvent -> handleClickUpdate());

        }else{
            btnDelete.setOpacity(0);
            btnDelete.setDisable(true);
        }
    }

    @FXML
    void handleClickDelete(MouseEvent event) {

    }


    void handleClickSave() {

        try {
            Employee newEmployee = new Employee();

            newEmployee.setEmployeeUsername(tfUsername.getText().trim());
            newEmployee.setName(tfName.getText().trim());
            newEmployee.setPhone_number(parseInt(tfPhoneNumber.getText().trim()));
            newEmployee.setEmail(tfEmail.getText().trim());
            newEmployee.setZip_code(parseInt(tfZipCode.getText().trim()));
            newEmployee.setCity(tfCity.getText().trim());
            newEmployee.setStreet(tfStreetName.getText().trim());
            newEmployee.setHouse_number(tfHouseNumber.getText().trim());


            employeeRepository.createNew(newEmployee);
            Permissions permissions = new Permissions();
            permissions.setEmployeeUsername(newEmployee.getEmployeeUsername());
            permissions.setPermissionUser(newEmployee);
            permissions.setPermission(Integer.parseInt(tfPermission.getText().trim()));
            newEmployee.setPermissions(permissions);
            permissionsRepository.createNew(permissions);


            tfUsername.clear();
            tfName.clear();
            tfPhoneNumber.clear();
            tfEmail.clear();
            tfZipCode.clear();
            tfCity.clear();
            tfStreetName.clear();
            tfHouseNumber.clear();


        } catch (Exception e){
            Logger.error("Inserting invalid type");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error message");
            alert.setHeaderText(null);
            alert.setContentText("Invalid data type or bad database connection.");
            alert.showAndWait();
        }

    }

}