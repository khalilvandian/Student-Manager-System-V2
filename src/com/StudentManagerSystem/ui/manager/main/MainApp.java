/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.StudentManagerSystem.ui.manager.main;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MainApp {
    @FXML
    private BorderPane rootPane;

    @FXML
    private void initialize() {
        try {
            Parent managerHome = FXMLLoader.load(getClass().getResource("/com/StudentManagerSystem/ui/manager/managerHome/managerHome.fxml"));
            rootPane.setCenter(managerHome);
        } catch (IOException e) {
            //TODO
        }
    }

    @FXML
    private void homeButtonHandler(){
        try {
            Parent managerHome = FXMLLoader.load(getClass().getResource("/com/StudentManagerSystem/ui/manager/managerHome/managerHome.fxml"));
            rootPane.setCenter(managerHome);
        } catch (IOException e) {
             //TODO
        }
    }

    @FXML
    private void addStudentButtonHandler(){
        try {
            Parent studentPage = FXMLLoader.load(getClass().getResource("/com/StudentManagerSystem/ui/manager/addStudent/addStudent.fxml"));
            rootPane.setCenter(studentPage);
        } catch (IOException e) {
               //TODO
        }

    }

    @FXML
    private void searchStudentButtonHandler(){
        try {
            Parent searchStudentPage = FXMLLoader.load(getClass().getResource("/com/StudentManagerSystem/ui/manager/searchStudent/searchStudent.fxml"));
            rootPane.setCenter(searchStudentPage);
        } catch (IOException e) {
            //TODO
        }
    }

    @FXML
    private void addEmployeeButtonHandler(){
        try {
            Parent searchStudentPage = FXMLLoader.load(
                    getClass().getResource("/com/StudentManagerSystem/ui/manager/addEmployee/addEmployee.fxml"));
            rootPane.setCenter(searchStudentPage);
        } catch (IOException e) {
            //TODO
        }
    }

    @FXML
    private void editEmployeeButtonHandler(){
        try {
            Parent searchStudentPage = FXMLLoader.load(
                    getClass().getResource("/com/StudentManagerSystem/ui/manager/editEmployee/editEmployee.fxml"));
            rootPane.setCenter(searchStudentPage);
        } catch (IOException e) {
            //TODO
        }
    }

    @FXML
    private void personalInfoButtonHandler(){
        try {
            Parent searchStudentPage = FXMLLoader.load(
                    getClass().getResource("/com/StudentManagerSystem/ui/manager/info/profile.fxml"));
            rootPane.setCenter(searchStudentPage);
        } catch (IOException e) {
            //TODO
        }
    }

    @FXML
    private void courseSettingButtonHandler(){
        try {
            Parent searchStudentPage = FXMLLoader.load(
                    getClass().getResource("/com/StudentManagerSystem/ui/manager/courseSetting/courseSetting.fxml"));
            rootPane.setCenter(searchStudentPage);
        } catch (IOException e) {
            //TODO
        }
    }

    @FXML
    private void addEditCourseButtonHandler(){
        try {
            Parent searchStudentPage = FXMLLoader.load(getClass().getResource("/com/StudentManagerSystem/ui/manager/addEditCourse/addEditCourse.fxml"));
            rootPane.setCenter(searchStudentPage);
        } catch (IOException e) {
            //TODO
        }
    }



}
