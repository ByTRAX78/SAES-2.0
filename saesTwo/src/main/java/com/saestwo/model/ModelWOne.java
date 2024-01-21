package com.saestwo.model;


import com.saestwo.Main;
import com.saestwo.controllers.ControllerWOne;
import com.saestwo.controllers.ControllerW_Login;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ModelWOne {
    private Stage primaryStage;

    public ModelWOne(){

    }


    public void abrirNuevaVentana() {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("views/inicioSesion.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 490, 514);
            ControllerW_Login controller = fxmlLoader.getController();
            Stage stage = new Stage();
            stage.setTitle("Inicio de sesion!");
            stage.setScene(scene);
            controller.setSecundaryStage(stage);
            controller.setPrimaryStage(primaryStage);
            primaryStage.hide();

            stage.show();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}
