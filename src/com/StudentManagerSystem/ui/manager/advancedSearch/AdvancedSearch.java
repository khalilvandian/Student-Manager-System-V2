package com.StudentManagerSystem.ui.manager.advancedSearch;

import com.StudentManagerSystem.Controllers.StudentManagerPageController;
import com.StudentManagerSystem.Student;
import com.StudentManagerSystem.ui.data.StudentData;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.LinkedList;

public class AdvancedSearch {

    @FXML
    private JFXTextField name;
    @FXML
    private JFXTextField lastName;
    @FXML
    private JFXTextField ID;
    @FXML
    private TableView list;

    @FXML
    private  TableColumn<StudentData, String> nameCloumn;
    @FXML
    private  TableColumn<StudentData, String> lastNameCloumn;
    @FXML
    private  TableColumn<StudentData, String> uniIdCloumn;
    @FXML
    private  TableColumn<StudentData, String> IDColumn;

    private ObservableList<StudentData> studentData = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        StudentManagerPageController.studentTmp = null;
        list.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) ->{
                    StudentManagerPageController.studentTmp = ((StudentData) newValue).getStudent();
                    Stage stage = (Stage) name.getScene().getWindow();
                    stage.close();
                });
    }

    @FXML
    private void searchByIDHandler(){
        try {
            int IDT = (ID.getText().equals("")) ? 0 : Integer.parseInt(ID.getText());
            LinkedList<Student> s = StudentManagerPageController.searchStudent(
                    null,null, IDT,0);

            setDataToList(s);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            //todo
        }
    }

    @FXML
    private void searchByNameHandler(){
        try {
            String nameT = name.getText().equals("") ? null :  name.getText().toLowerCase();
            String lastNameT = lastName.getText().equals("") ? null :  lastName.getText().toLowerCase();

            LinkedList<Student> s = StudentManagerPageController.searchStudent(nameT, lastNameT , 0 ,0);
            setDataToList(s);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            //todo
        }
    }

    @FXML
    private void selectStudentHandler(){

    }

    private void setDataToList(LinkedList<Student> s){
        if (s != null){
            studentData.clear();
            for (Student student : s) {
                studentData.add(new StudentData(student));
            }
            nameCloumn.setCellValueFactory(cellData ->  cellData.getValue().nameProperty());
            lastNameCloumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
            IDColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty());
            uniIdCloumn.setCellValueFactory(cellData -> cellData.getValue().uniIdProperty());
            list.setItems(studentData);
        }else{
            list.setItems(null);
        }
    }

}
