module com.example.proyecto {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.proyecto to javafx.fxml;
    exports com.example.proyecto;
    exports com.example.proyecto.controllers;
    opens com.example.proyecto.controllers to javafx.fxml;
}