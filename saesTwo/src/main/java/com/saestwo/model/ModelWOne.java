package com.saestwo.model;


import com.saestwo.Main;
import com.saestwo.controllers.ControllerWOne;
import com.saestwo.controllers.ControllerW_Login;
import com.saestwo.controllers.ControllerW_Register;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ModelWOne {
    private Stage primaryStage;

    public ModelWOne(){

    }


    public void openLogin() {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("views/inicioSesion.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 490, 514);
            ControllerW_Login controller = fxmlLoader.getController();
            Stage stage = new Stage();
            stage.setTitle("Inicio de sesion");
            stage.setScene(scene);
            controller.setSecundaryStage(stage);
            controller.setPrimaryStage(primaryStage);
            primaryStage.hide();

            stage.show();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void openRegister(){
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("views/register.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            ControllerW_Register controller = fxmlLoader.getController();
            Stage windowRegister = new Stage();
            windowRegister.setTitle("Register");
            windowRegister.setScene(scene);
            controller.setSecundaryStage(windowRegister);
            controller.setPrimaryStage(primaryStage);

            primaryStage.hide();

            windowRegister.show();


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
