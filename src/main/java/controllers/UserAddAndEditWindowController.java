package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class UserAddAndEditWindowController {

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfPhoneNumber;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfRoomType;

    @FXML
    private TextField tfPayment;

    @FXML
    private DatePicker dpStartDate;

    @FXML
    private DatePicker dpEndDate;

    @FXML
    private Button btnDelete;

    @FXML
    protected void initialize(){
        if(UserWindowController.UserAddOrEdit == "Add") {
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