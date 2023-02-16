module com.example.sisestudante {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive java.sql;
    requires javafx.base;

    opens application to javafx.fxml;
    opens controller to javafx.fxml;
    opens dao to javafx.fxml;
    opens model to javafx.fxml;
    opens utils to javafx.fxml;
    exports application;
    exports controller;
    exports dao;
    exports model;
    exports utils;
}