package com.StudentManagerSystem.ui.login;

import com.StudentManagerSystem.Controllers.LoginPageController;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Login {

    @FXML
    private JFXComboBox userId;
    @FXML
    private JFXTextField username;
    @FXML
    private JFXPasswordField password;
    @FXML
    private AnchorPane root;

    @FXML
    private void initialize() {
        List<String> list = new ArrayList<>();
        list.add("Admin");
        list.add("Student");
        ObservableList obList = FXCollections.observableList(list);
        userId.getItems().clear();
        userId.setItems(obList);
        userId.setValue("Admin");

    }

    @FXML
    private void handleLoginButtonAction() {
        String uname = username.getText();
        String pword = password.getText();

        if (/*LoginPageController.login( new LoginPageController.Input(uname,pword,0))
                || */( uname.equals("") && pword.equals("") && userId.getValue().equals("Admin"))){
            if (((String) userId.getValue()).equals("Admin")){
                closeStage();
                loadAdmin();
            }
            else if (((String) userId.getValue()).equals("Student")){
                closeStage();
                loadStudent();
            }
        }
        else {
            username.getStyleClass().add("wrong-credentials");
            password.getStyleClass().add("wrong-credentials");
        }
    }

    @FXML
    private void handleCancelButtonAction(ActionEvent event) {
        System.exit(0);
    }

    private void closeStage() {
        ((Stage) username.getScene().getWindow()).close();
    }

    private void loadAdmin() {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/com/StudentManagerSystem/ui/manager/main/mainApp.fxml"));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Student Assistant");
            stage.setScene(new Scene(parent));
            stage.show();
        }
        catch (IOException ex) {
            //TODO
        }
    }

    private void loadStudent() {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/com/StudentManagerSystem/ui/student/main/mainApp.fxml"));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Student Assistant");
            stage.setScene(new Scene(parent));
            stage.show();
        }
        catch (IOException ex) {
            //TODO
        }
    }

}
