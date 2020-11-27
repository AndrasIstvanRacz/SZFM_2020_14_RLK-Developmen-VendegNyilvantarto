package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

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
    private Button btnDelete;

    @FXML
    protected void initialize(){
        if(EmployeeWindowController.AddOrEdit == "Edit"){
            tfUsername.setEditable(false);

        }else{
            btnDelete.setOpacity(0);
            btnDelete.setDisable(true);
        }
    }

    @FXML
    void handleClickDelete(MouseEvent event) {

    }

    @FXML
    void handleClickSave(MouseEvent event) {

    }

}