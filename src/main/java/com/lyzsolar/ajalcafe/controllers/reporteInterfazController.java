package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class reporteInterfazController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button generarReporteButton;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;

    @FXML
    private Button cerrarButton;
    @FXML
    private Button verReporteButton;

    Stage vistaMenuAdministrador = new Stage();


    @FXML
    void OnMouseclickedCerrarButton(MouseEvent event) {
        cerrarVentana();
    }
    @FXML
    void OnMouseclickedVerReporteButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("VerReporte-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaMenuAdministrador.setTitle("Menu Administrador");
        vistaMenuAdministrador.setScene(scene);
        vistaMenuAdministrador.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedGenerarReporteButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("AgregarReporte-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaMenuAdministrador.setTitle("Menu Administrador");
        vistaMenuAdministrador.setScene(scene);
        vistaMenuAdministrador.show();
        cerrarVentana();
    }


    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Admin-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaMenuAdministrador.setTitle("Menu Administrador");
        vistaMenuAdministrador.setScene(scene);
        vistaMenuAdministrador.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Admin-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaMenuAdministrador.setTitle("Menu Administrador");
        vistaMenuAdministrador.setScene(scene);
        vistaMenuAdministrador.show();
        cerrarVentana();
    }

    @FXML
    void initialize() {
    }

    public void cerrarVentana() {
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();
    }
}
