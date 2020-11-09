package controllers;

import app.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import lombok.SneakyThrows;

public class AdminWindowController {

    @FXML
    private BorderPane admin;

    @SneakyThrows
    @FXML
    protected void initialize(){
        admin.setCenter(FXMLLoader.load(Main.class.getResource("UserWindow.fxml")));
    }
}
