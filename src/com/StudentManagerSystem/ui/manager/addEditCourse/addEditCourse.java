
/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.StudentManagerSystem.ui.manager.addEditCourse;

import com.StudentManagerSystem.Controllers.StudentManagerPageController;
import com.StudentManagerSystem.Main;
import com.StudentManagerSystem.Subject;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class addEditCourse {
    private boolean isAddModeActive;
    @FXML
    private JFXTextField title;
    @FXML
    private JFXTextField unitVal;
    @FXML
    private JFXTextField capacity;
    @FXML
    private JFXTextField professorName;
    @FXML
    private JFXDatePicker testData;
    @FXML
    private JFXButton addEdit;
    private Subject tmpSubject;


    @FXML
    private void initialize() {
        isAddModeActive = true;
    }

    @FXML
    private void addEditCourseHandler(){
        if (isAddModeActive){
            Subject sub = new Subject();

            sub.setTitle(title.getText());
            sub.setExamDate(testData.getValue());
            sub.setProfessorName(professorName.getText());
            sub.setUnitVal(Integer.parseInt(unitVal.getText()));
            sub.setStudentCount(Integer.parseInt(capacity.getText()));

            try {
                sub = StudentManagerPageController.addSubject(new StudentManagerPageController.SubjectInput(sub,null));

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Successful");
                alert.setHeaderText("subject add student");
                alert.setContentText("subject id = "+sub.getID()+ " " + sub.getCode());
                alert.showAndWait();

            } catch (IOException | ClassNotFoundException e) {
                System.out.println("add subject error");
                Main.showError("cant add subject," + e.toString());
            }
        }else{
            //todo
        }
    }

    @FXML
    private void searchCourseHandler(){
        try {

            Parent parent = FXMLLoader.load(getClass().getResource("/com/StudentManagerSystem/ui/manager/searchSubject/searchSubject.fxml"));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Search");
            stage.setScene(new Scene(parent));
            stage.showAndWait();

            tmpSubject = StudentManagerPageController.subjectTmp;
            if (tmpSubject != null){
                setSubjectInf(tmpSubject);
                isAddModeActive = false;
                addEdit.setText("Edit");
            }else {
                setSubjectInf(null);
                isAddModeActive = true;
                addEdit.setText("Add");
            }



        } catch (IOException e) {
            //TODO
        }


    }

    private void setSubjectInf(Subject s){
        if (s != null){
            title.setText(s.getTitle());
            professorName.setText(s.getProfessorName());
            capacity.setText(s.getCapacity()+"");
            testData.setValue(s.getExamDate());
            unitVal.setText(s.getUnitVal()+"");
        }else {
            title.setText("");
            professorName.setText("");
            capacity.setText("");
            testData.setValue(null);
            unitVal.setText("");
        }
    }
}
