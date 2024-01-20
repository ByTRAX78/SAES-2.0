package com.saestwo.saestwo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    public Button bottonsesion;
    private Stage primaryStage;


    @FXML
    private void initialize() {
        bottonsesion.setOnAction(event -> abrirNuevaVentana());


    }

    private void abrirNuevaVentana() {

        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("inicioSesion.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setTitle("Hello!");
            stage.setScene(scene);

                primaryStage.hide();

            stage.show();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setPrimaryStage(Stage primStage) {
        this.primaryStage = primStage;

    }






}