package controllers;

import app.Main;
import database.EmployeeRepository;
import database.GuestRepository;
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
import model.Guest;
import org.tinylog.Logger;

import java.io.IOException;
import java.util.Date;


public class UserWindowController {

    public static String UserAddOrEdit;

    @FXML
    private BorderPane user;

    @FXML
    private Button btnEdit;

    @FXML
    private TableView<Guest> guestTable;

    @FXML
    private TableColumn<Guest, Integer> columnId;

    @FXML
    private TableColumn<Guest, String> columnName;

    @FXML
    private TableColumn<Guest, Integer> columnPhoneNumber;

    @FXML
    private TableColumn<Guest, String> columnEmail;

    @FXML
    private TableColumn<Guest, Date> columnStartDate;

    @FXML
    private TableColumn<Guest, Date> columnEndDate;

    @FXML
    private TableColumn<Guest, String> columnRoomType;

    @FXML
    private TableColumn<Guest, Integer> columnPayment;

    @FXML
    private ComboBox<String> cbBox;

    @FXML
    private TextField tfSearch;

    private GuestRepository guestRepository = new GuestRepository();

    @FXML
    protected void initialize(){
        if(LoginController.userType.equals("(Admin)")){
            btnEdit.setDisable(false);
        } else {
            btnEdit.setDisable(true);
        }

    }

    private void initColumn() {
        columnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("phone_number"));
        columnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        columnStartDate.setCellValueFactory(new PropertyValueFactory<>("occupying_the_room"));
        columnEndDate.setCellValueFactory(new PropertyValueFactory<>("leaving_the_room"));
        columnRoomType.setCellValueFactory(new PropertyValueFactory<>("room_type"));
        columnPayment.setCellValueFactory(new PropertyValueFactory<>("payment"));
    }

    @FXML
    void handleClickSearch() {
        try {
            ObservableList<Guest> data = FXCollections.observableArrayList(
                    guestRepository.findByColumn(getColumnName(cbBox.getValue().trim()),
                            tfSearch.getText().trim()));
            tfSearch.clear();
            guestTable.setItems(data);
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

    @FXML
    void handleAdd() {
        openAddOrEdit("Add");
    }

    @FXML
    void handleEdit() {
        openAddOrEdit("Edit");
    }

    void openAddOrEdit (String type) {
        UserAddOrEdit = type;
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

    private String getColumnName(String name) {
        String columnName;
        if (name.equals("Id")) {
            columnName = "id";
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
        } else if (name.equals("Start date")) {
            columnName = "occupying_the_room";
            return columnName;
        } else if (name.equals("End date")) {
            columnName = "leaving_the_room";
            return columnName;
        } else if (name.equals("Room type")) {
            columnName = "room_type";
            return columnName;
        } else{
            columnName = "payment";
            return columnName;
        }
    }

}
