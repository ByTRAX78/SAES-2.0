package com.saestwo.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

public class ControllerW_Register {


    @FXML
    private Stage secundaryStage,primaryStage;
    public Hyperlink hiperBack;




    @FXML
    private void back() {

        primaryStage.show();
        secundaryStage.hide();

    }

    public void setSecundaryStage(Stage secundaryStage) {
        this.secundaryStage = secundaryStage;


    }

    public void setPrimaryStage(Stage primStage) {
        this.primaryStage = primStage;


    }
}
