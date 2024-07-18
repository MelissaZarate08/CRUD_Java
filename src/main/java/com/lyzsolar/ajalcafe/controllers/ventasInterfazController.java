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

public class ventasInterfazController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button agregarButton;

    @FXML
    private ImageView backIcono;

    @FXML
    private Button eliminarButton;

    @FXML
    private Button modificarButton;

    @FXML
    private Button regresarButton;

    @FXML
    private Button verButton;
    Stage vistaMenuAdministrador = new Stage();
    Stage vistaAddVenta = new Stage();
    Stage vistaDeleteVenta = new Stage();
    Stage vistaModifyVenta = new Stage();
    Stage vistaObservarVenta = new Stage();

    @FXML
    void OnMouseclickedAgregarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("AgregarVenta.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaAddVenta.setTitle("Submenú Agregar ventas");
        vistaAddVenta.setScene(scene);
        vistaAddVenta.show();
        cerrarVentana();
    }


    @FXML
    void OnMouseclickedBackIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Admin-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaMenuAdministrador.setTitle("Menu Administrador");
        vistaMenuAdministrador.setScene(scene);
        vistaMenuAdministrador.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedEliminarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("EliminarVenta-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaDeleteVenta.setTitle("Submenú Eliminar Ventas");
        vistaDeleteVenta.setScene(scene);
        vistaDeleteVenta.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedModificarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ModificarVenta-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaModifyVenta.setTitle("Submenú Modificar Ventas");
        vistaModifyVenta.setScene(scene);
        vistaModifyVenta.show();
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
    void OnMouseclickedVerButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("VerVenta-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaObservarVenta.setTitle("Submenú Ver Ventas");
        vistaObservarVenta.setScene(scene);
        vistaObservarVenta.show();
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
