module com.saestwo.saestwo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.saestwo to javafx.fxml;
    exports com.saestwo;
    exports com.saestwo.model;
    opens com.saestwo.model to javafx.fxml;
    exports com.saestwo.controllers;
    opens com.saestwo.controllers to javafx.fxml;
}