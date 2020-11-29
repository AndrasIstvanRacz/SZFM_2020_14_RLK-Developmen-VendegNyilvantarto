package controllers;

import database.EmployeeRepository;
import database.GuestRepository;
import database.PermissionsRepository;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.Employee;
import model.Guest;
import model.Permissions;
import model.TransferUtil;
import org.tinylog.Logger;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.lang.Integer.parseInt;
import static model.TransferUtil.*;

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
    private Button saveButton;

    @FXML
    private Button btnDelete;

    private GuestRepository guestRepository = new GuestRepository();

    private EmployeeRepository employeeRepository = new EmployeeRepository();

    @FXML
    protected void initialize(){
        if(UserWindowController.UserAddOrEdit ==  "Edit"){
            tfName.setText(guest.getName());
            tfPhoneNumber.setText(guest.getPhone_number().toString());
            tfEmail.setText(guest.getEmail());
            dpStartDate.setValue(guest.getOccupying_the_room());
            dpEndDate.setValue(guest.getLeaving_the_room());
            tfRoomType.setText(guest.getRoom_type());
            tfPayment.setText(guest.getPayment().toString());
            saveButton.setOnMouseClicked(mouseEvent -> handleClickUpdate());

        }else{
            btnDelete.setOpacity(0);
            btnDelete.setDisable(true);
            saveButton.setOnMouseClicked(mouseEvent -> handleClickSave());
        }
    }

    @FXML
    void handleClickDelete() {
        guestRepository.simpleDelete(guest);
    }

    @FXML
    void handleClickSave() {

        try {
            Guest newGuest = new Guest();

            newGuest.setName(tfName.getText().trim());
            newGuest.setPhone_number(parseInt(tfPhoneNumber.getText().trim()));
            newGuest.setEmail(tfEmail.getText().trim());
            newGuest.setOccupying_the_room(dpStartDate.getValue());
            newGuest.setLeaving_the_room(dpStartDate.getValue());
            newGuest.setRoom_type(tfRoomType.getText().trim());
            newGuest.setPayment(parseInt(tfPayment.getText().trim()));
            newGuest.setReceptionist(employeeRepository.findByColumn("employeeUsername", TransferUtil.user).get(0));

            guestRepository.createNew(newGuest);

            tfName.clear();
            tfPhoneNumber.clear();
            tfEmail.clear();
            dpStartDate.setValue(null);
            dpEndDate.setValue(null);
            tfRoomType.clear();
            tfPayment.clear();


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