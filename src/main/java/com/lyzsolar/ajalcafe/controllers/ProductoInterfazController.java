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

public class ProductoInterfazController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button agregarButton;

    @FXML
    private Button modificarButton;

    @FXML
    private Button eliminarButton;

    @FXML
    private Button verButton;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;

    Stage vistaMenuAdministrador = new Stage();
    Stage AddProducto = new Stage();
    Stage DeleteProducto = new Stage();

    @FXML
    void OnMouseclickedAgregarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("AgregarProducto-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        AddProducto.setTitle("Submenú Agregar Producto");
        AddProducto.setScene(scene);
        AddProducto.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedEliminarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("EliminarProducto-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        DeleteProducto.setTitle("Submenú Eliminar Producto");
        DeleteProducto.setScene(scene);
        DeleteProducto.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedModificarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ModificarProducto-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        DeleteProducto.setTitle("Submenú Eliminar Producto");
        DeleteProducto.setScene(scene);
        DeleteProducto.show();
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
    void OnMouseclickedVerButton(MouseEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("VerProducto-view.fxml"));
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
