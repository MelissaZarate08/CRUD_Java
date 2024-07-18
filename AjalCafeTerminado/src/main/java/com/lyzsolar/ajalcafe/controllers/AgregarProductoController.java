package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.models.Producto;

import com.lyzsolar.ajalcafe.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AgregarProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button guardarbutton;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView guardarIcono;

    @FXML
    private ImageView regresarIcono;

    @FXML
    private TextField idText;

    @FXML
    private TextField nombreText;

    @FXML
    private TextField categoriaText;

    @FXML
    private TextField caducidadText;

    @FXML
    private TextField cantidadText;

    @FXML
    private TextField precioText;

    @FXML
    private TextField unidadText;
    @FXML
    private TextField totalText;

    Stage vistaProducto = new Stage();

    @FXML
    void OnMouseclickedGuardarButton(MouseEvent event) {
        agregarProducto();
    }

    @FXML
    void OnMouseclickedGuardarIcono(MouseEvent event) {
        agregarProducto();
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
        Stage stage = (Stage) regresarIcono.getScene().getWindow();
        stage.close();
    }

    private void agregarProducto() {
        try {
            Integer idProducto = Integer.valueOf(idText.getText());
            String nombreProducto = nombreText.getText();
            String categoria = categoriaText.getText();
            String fechacaducidad = caducidadText.getText();
            Integer cantidadProducto = Integer.valueOf(cantidadText.getText());
            String unidad = unidadText.getText();
            double precioProducto = Double.parseDouble(precioText.getText());

            Producto nuevoProducto = new Producto(idProducto, nombreProducto, categoria, fechacaducidad, cantidadProducto, unidad, precioProducto);
            Producto.agregarProductoLista(nuevoProducto);

            idText.clear();
            nombreText.clear();
            categoriaText.clear();
            caducidadText.clear();
            cantidadText.clear();
            unidadText.clear();
            precioText.clear();

            System.out.println("Productos agregados:");
            for (Producto producto : Producto.obtenerListaProductos()) {
                System.out.println(producto);
            }

        } catch (DateTimeParseException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Formato de fecha incorrecto");
            alert.setContentText("Ingrese cuatro dígitos para el año, dos para el mes y dos para el día");
            alert.showAndWait();
        }
    }
}
