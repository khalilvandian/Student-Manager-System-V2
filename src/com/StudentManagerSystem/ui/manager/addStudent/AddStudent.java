/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.StudentManagerSystem.ui.manager.addStudent;

import com.StudentManagerSystem.Controllers.StudentManagerPageController;
import com.StudentManagerSystem.DateUtil;
import com.StudentManagerSystem.Student;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

import java.io.IOException;
import java.time.LocalDate;

public class AddStudent {
    @FXML
    private JFXTextField name;
    @FXML
    private JFXTextField lastName;
    @FXML
    private JFXDatePicker birthDate;
    @FXML
    private JFXTextField ID;

    @FXML
    private void initialize() {
    }

    @FXML
    private void addStudentHandler(){
        LocalDate date = birthDate.getValue();
        Student s = new Student();

        s.setName(name.getText().toLowerCase());
        s.setLastname(lastName.getText().toLowerCase());
        s.setId(Integer.parseInt(ID.getText()));
        s.setBirthDate(DateUtil.format(date));


        int uniId = 0;
        try {
            uniId = StudentManagerPageController.addStudent(new StudentManagerPageController.StudentInput(s,null));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Successful");
            alert.setHeaderText("Successful add student");
            alert.setContentText("university id = "+uniId);
            alert.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
