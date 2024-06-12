/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.StudentManagerSystem.ui.manager.searchStudent;

import com.StudentManagerSystem.Controllers.StudentManagerPageController;
import com.StudentManagerSystem.DateUtil;
import com.StudentManagerSystem.Main;
import com.StudentManagerSystem.Student;
import com.StudentManagerSystem.ui.data.StudentData;
import com.StudentManagerSystem.ui.manager.advancedSearch.AdvancedSearch;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Optional;

public class SearchStudent {
    @FXML
    private JFXTextField uniID;
    @FXML
    private JFXTextField name;
    @FXML
    private JFXTextField lastName;
    @FXML
    private JFXDatePicker birthDate;
    @FXML
    private JFXTextField ID;
    @FXML
    private JFXButton delete;
    @FXML
    private JFXButton edit;

    private static Student tmpStudent;

    @FXML
    private void initialize() {

    }

    @FXML
    private void AdvSearchHandler() {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/com/StudentManagerSystem/ui/manager/advancedSearch/advancedSearch.fxml"));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Advanced Search");
            stage.setScene(new Scene(parent));
            stage.showAndWait();

            tmpStudent = StudentManagerPageController.studentTmp;
            if (tmpStudent != null){
                setStudentInf(tmpStudent);
                delete.setDisable(false);
                edit.setDisable(false);
            }else {
                setStudentInf(null);
                delete.setDisable(true);
                edit.setDisable(true);
            }
        } catch (IOException e) {
            //TODO
        }
    }

    @FXML
    private void searchStudentHandler() {
        if (!uniID.getText().equals("")){
            try {

                Student s = StudentManagerPageController.displayInformation(Integer.parseInt(uniID.getText()));
                tmpStudent = s;
                setStudentInf(s);

                delete.setDisable(false);
                edit.setDisable(false);
            } catch (IOException | ClassNotFoundException | NullPointerException e) {
//                e.printStackTrace();
                Main.showError("Cant find the student");

                setStudentInf(null);
                delete.setDisable(true);
                edit.setDisable(true);
            } catch (NumberFormatException e){
                Main.showError("university id is a number!");

                setStudentInf(null);
                delete.setDisable(true);
                edit.setDisable(true);
            }
        }

    }

    private void setStudentInf(Student s) {
        if (s != null) {
            name.setText(s.getName());
            lastName.setText(s.getLastname());
            ID.setText(s.getId() + "");
            birthDate.setValue(DateUtil.parse(s.getBirthDate()));
        } else {
            name.setText("");
            lastName.setText("");
            ID.setText("");
            birthDate.setValue(null);
        }
    }

    @FXML
    private void EditButtonHandler() {

    }

    @FXML
    private void DeleteButtonHandler() {
        if (tmpStudent != null) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Delete student?");
            alert.setHeaderText("Delete student?");
            alert.setContentText(
                    "Do you want to delete " + tmpStudent.getName() + " " +
                            tmpStudent.getLastname() + " with id = " + tmpStudent.getId() +
                            "?");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                try {
                    StudentManagerPageController.removeStudent(new StudentManagerPageController.StudentInput(tmpStudent, tmpStudent));
                } catch (IOException e) {
                    e.printStackTrace();
                    //todo
                }
            }
        }
    }
}
