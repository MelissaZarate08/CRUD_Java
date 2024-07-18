module com.lyzsolar.ajalcafe {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.lyzsolar.ajalcafe to javafx.fxml;
    exports com.lyzsolar.ajalcafe;
    exports com.lyzsolar.ajalcafe.controllers;
    opens com.lyzsolar.ajalcafe.controllers to javafx.fxml;
}