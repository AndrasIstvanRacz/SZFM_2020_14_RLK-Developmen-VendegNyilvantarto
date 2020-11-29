package controllers;

import app.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import lombok.SneakyThrows;
import org.tinylog.Logger;

import java.io.IOException;


public class AdminWindowController {

    @FXML
    private BorderPane admin;

    @FXML
    private Button btnEmployees;

    @FXML
    private Button btnGuests;


    @SneakyThrows
    @FXML
    void initialize(){
        admin.setCenter(FXMLLoader.load(Main.class.getResource("EmployeeWindow.fxml")));
        btnEmployees.setStyle("-fx-background-color: rgba(0, 0, 0, 0.6)");
    }

    @FXML
    void handleClicks(MouseEvent event) {
        if(event.getSource() == btnEmployees){
            loadFXML("EmployeeWindow");
            btnGuests.setStyle("-fx-background-color: transparent");
            btnEmployees.setStyle("-fx-background-color: rgba(0, 0, 0, 0.6)");


        }
        else if(event.getSource() == btnGuests){
            loadFXML("UserWindow");
            btnEmployees.setStyle("-fx-background-color: transparent");
            btnGuests.setStyle("-fx-background-color: rgba(0, 0, 0, 0.6)");

        }
    }
    void loadFXML(String Tab){
        BorderPane root = null;
        try{
            root = FXMLLoader.load(Main.class.getResource(Tab+".fxml"));
            Logger.info("FXML loaded.");
        } catch (IOException ex ) {
            Logger.error("FXML loading failed.");
        }
        admin.setCenter(root);
    }
}
