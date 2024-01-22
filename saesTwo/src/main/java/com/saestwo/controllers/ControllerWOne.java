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
    public Button btnsesion;

    public Button btnregister;

    private final ModelWOne modelWOne = new ModelWOne();


    @FXML
    private void initialize() {

        btnsesion.setOnAction(event ->  modelWOne.openLogin());
        btnregister.setOnAction(event ->  modelWOne.openRegister());


    }



    public void setPrimaryStage(Stage primStage) {
        this.primaryStage = primStage;
        modelWOne.setPrimaryStage(primaryStage);

    }



}