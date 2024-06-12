package com.StudentManagerSystem.ui.manager.searchSubject;

import com.StudentManagerSystem.Controllers.StudentManagerPageController;
import com.StudentManagerSystem.Subject;
import com.StudentManagerSystem.ui.data.SubjectData;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import java.io.IOException;

import java.util.LinkedList;

public class SearchSubject {

    public TableView TableView;
    @FXML
    private JFXTextField ID;
    @FXML
    private TableColumn<SubjectData, String> titleColumn;
    @FXML
    private  TableColumn<SubjectData, String> gropeNumberColumn;

    private ObservableList<SubjectData> subjectData = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        StudentManagerPageController.subjectTmp = null;
        TableView.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) ->{
                    StudentManagerPageController.subjectTmp = ((SubjectData) newValue).getSubject();
                    Stage stage = (Stage) TableView.getScene().getWindow();
                    stage.close();
                });
    }

    @FXML
    private void searchSubjectHandler(){
        try {
            LinkedList<Subject> s = StudentManagerPageController.searchsubjectByID(Integer.parseInt(ID.getText()));
            setDataToList(s);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            //todo
        }
    }

    private void setDataToList(LinkedList<Subject> s){
        if (s != null){
            subjectData.clear();
            for (Subject subject : s) {
                subjectData.add(new SubjectData(subject));
            }
            titleColumn.setCellValueFactory(cellData ->  cellData.getValue().titleProperty());
            gropeNumberColumn.setCellValueFactory(cellData -> cellData.getValue().groupNumberProperty());
            TableView.setItems(subjectData);
        }else{
            TableView.setItems(null);
        }
    }
}
