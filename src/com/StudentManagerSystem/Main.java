package com.StudentManagerSystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;


import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){

        try { SystemManage.loadProgram(); } catch (IOException | ClassNotFoundException e) {
            try { SystemManage.saveProgram();}
            catch (IOException e1) {
                System.out.println("Problem in load the files, restart the program"); }
        }

        Parent root;

        try {
            root = FXMLLoader.load(getClass().getResource("/com/StudentManagerSystem/ui/login/login.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void stop(){
        try {
            SystemManage.saveProgram();
        } catch (IOException e) {
            e.printStackTrace();
            //todo
        }
    }

    public static void main(String[] args) {
        launch(args);
    }


    public static void showError(String txt){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setHeaderText(null);
        alert.setContentText(txt);
        alert.showAndWait();
    }
}