package com.saestwo.controllers;

import com.saestwo.Main;
import com.saestwo.model.ModelWOne;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControllerWOne {

    @FXML
    private Stage primaryStage;
    public Button bottonsesion;

    private ModelWOne modelWOne = new ModelWOne();


    @FXML
    private void initialize() {

        bottonsesion.setOnAction(event ->  modelWOne.abrirNuevaVentana());


    }

    public void setPrimaryStage(Stage primStage) {
        this.primaryStage = primStage;
        modelWOne.setPrimaryStage(primaryStage);

    }









}