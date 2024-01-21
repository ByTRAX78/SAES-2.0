package com.saestwo;

import com.saestwo.controllers.ControllerWOne;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("views/principal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 439, 229);
        ControllerWOne controller = fxmlLoader.getController();
        controller.setPrimaryStage(stage);
        stage.setTitle("Iniciar sesion!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}