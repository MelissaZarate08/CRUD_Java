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

public class menuInterfazController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button agregarButton;

    @FXML
    private Button eliminarButton;

    @FXML
    private Button modificarButton;

    @FXML
    private Button regresarButton;

    @FXML
    private Button verButton;
    @FXML
    private ImageView regresarIcono;
    Stage vistaMenuAdministrador = new Stage();
    Stage AddMenu = new Stage();
    Stage DeleteMenu = new Stage();
    Stage VerMenu = new Stage();

    @FXML
    void OnMouseclickedAgregarButton(MouseEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("AgregarMenu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        AddMenu.setTitle("Agregar Menú");
        AddMenu.setScene(scene);
        AddMenu.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedEliminarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("EliminarMenu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        DeleteMenu.setTitle("Eliminar Menú");
        DeleteMenu.setScene(scene);
        DeleteMenu.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedModificarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ModificarMenu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        DeleteMenu.setTitle("Modificar Menú");
        DeleteMenu.setScene(scene);
        DeleteMenu.show();
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
    void OnMouseclickedVerButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("VerMenu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        VerMenu.setTitle("Ver Menú");
        VerMenu.setScene(scene);
        VerMenu.show();
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
