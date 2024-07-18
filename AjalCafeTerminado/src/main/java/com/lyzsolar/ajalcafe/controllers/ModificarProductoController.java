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

public class ModificarProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField caducidadText;

    @FXML
    private TextField cantidadText;

    @FXML
    private TextField categoriaText;

    @FXML
    private ImageView guardarIcono;

    @FXML
    private Button guardarbutton;

    @FXML
    private TextField idText;

    @FXML
    private TextField nombreText;

    @FXML
    private TextField precioText;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;

    @FXML
    private TextField unidadText;

    @FXML
    private Button BuscarButton;
    Stage vistaProducto = new Stage();

    @FXML
    void OnMouseClickedBuscarButton(MouseEvent event) {
        String nombreProductoABuscar = nombreText.getText().trim();
        boolean productoEncontrado = false;
        for (Producto producto : Producto.obtenerListaProductos()) {
            if (producto.nombreProductoProperty().get().equalsIgnoreCase(nombreProductoABuscar)) {
                productoEncontrado = true;
                llenarCamposDeTexto(producto);
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
    void OnMouseclickedGuardarButton(MouseEvent event) {
        String nombreProductoAModificar = nombreText.getText().trim();
        boolean productoModificado = false;
        for (Producto producto : Producto.obtenerListaProductos()) {
            if (producto.nombreProductoProperty().get().equalsIgnoreCase(nombreProductoAModificar)) {
                producto.setIdProducto(Integer.parseInt(idText.getText()));
                producto.nombreProductoProperty().set(nombreText.getText());
                producto.categoriaProperty().set(categoriaText.getText());
                producto.setFechacaducidad(caducidadText.getText());
                producto.setCantidadProducto(Integer.parseInt(cantidadText.getText()));
                producto.unidadProperty().set(unidadText.getText());
                producto.precioProductoProperty().set(Double.parseDouble(precioText.getText()));
                productoModificado = true;
                break;
            }
        }
        if (productoModificado) {
            mostrarAlerta("Producto modificado", "Los datos del producto han sido modificados.");
        } else {
            mostrarAlertaError("Producto no encontrado", "El producto no existe en la lista.");
        }
    }


    @FXML
    void OnMouseclickedGuardarIcono(MouseEvent event) {

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
    void OnMouseclickedRegresarIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ProductoInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaProducto.setTitle("Menú Producto");
        vistaProducto.setScene(scene);
        vistaProducto.show();
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();
    }

    private void llenarCamposDeTexto(Producto producto) {
        idText.setText(String.valueOf(producto.getIdProducto()));
        nombreText.setText(producto.nombreProductoProperty().get());
        categoriaText.setText(producto.categoriaProperty().get());
        caducidadText.setText(producto.fechacaducidadProperty().get());
        cantidadText.setText(String.valueOf(producto.cantidadProductoProperty().get()));
        unidadText.setText(producto.unidadProperty().get());
        precioText.setText(String.valueOf(producto.precioProductoProperty().get()));
    }

    @FXML
    void initialize() {
    }

}

