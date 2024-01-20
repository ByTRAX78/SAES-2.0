module com.saestwo.saestwo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.saestwo.saestwo to javafx.fxml;
    exports com.saestwo.saestwo;
}