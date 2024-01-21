package com.saestwo.controllers;

import com.saestwo.model.ModelWOne;
import com.saestwo.model.ModelW_Login;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

public class ControllerW_Login {

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
