package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.App;
import com.lyzsolar.ajalcafe.models.Producto;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class EliminarProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView eliminarIcono;

    @FXML
    private TextField NombreText;

    @FXML
    private Button eliminarButton;

    @FXML
    private Button BuscarButton;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView verIcono;

    @FXML
    private ImageView regresarIcono;
    Stage vistaProducto = new Stage();

    @FXML
    void OnMouseclickedBuscarButton(MouseEvent event) {
        String nombreProductoABuscar = NombreText.getText().trim();
        boolean productoEncontrado = false;
        for (Producto producto : Producto.obtenerListaProductos()) {
            if (producto.nombreProductoProperty().get().equalsIgnoreCase(nombreProductoABuscar)) {
                productoEncontrado = true;
                break;
            }
        }
        if (productoEncontrado) {
            mostrarAlerta("Producto encontrado", "El producto ha sido encontrado.");
        } else {
            mostrarAlertaError("Producto no encontrado", "El producto no existe en la lista.");
        }
    }

    private void mostrarAlerta(String titulo, String contenido) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(contenido);
        alerta.showAndWait();
    }
    private void mostrarAlertaError(String titulo, String contenido) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(contenido);
        alerta.showAndWait();
    }

    @FXML
    void OnMouseclickedEliminarButton(MouseEvent event) {
        String nombreProductoAEliminar = NombreText.getText().trim();
        boolean productoEliminado = false;
        for (Producto producto : Producto.obtenerListaProductos()) {
            if (producto.nombreProductoProperty().get().equalsIgnoreCase(nombreProductoAEliminar)) {
                Producto.obtenerListaProductos().remove(producto);
                productoEliminado = true;
                break;
            }
        }
        if (productoEliminado) {
            mostrarAlerta("Producto eliminado", "El producto ha sido eliminado de la lista.");
        } else {
            mostrarAlertaError("Producto no encontrado", "El producto no existe en la lista.");
        }
    }

    @FXML
    void OnMouseclickedEliminarIcono(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ProductoInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaProducto.setTitle("Menú Producto");
        vistaProducto.setScene(scene);
        vistaProducto.show();
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedVerIcono(MouseEvent event) {

    }

    @FXML
    void initialize() {
    }
}
