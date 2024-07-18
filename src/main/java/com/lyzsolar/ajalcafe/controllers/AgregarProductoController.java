package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.models.DataBase;
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
    @FXML
    private TextField fechacompraText;

    Stage vistaProducto = new Stage();

    private void insertarProducto(Producto producto) {
        String sql = "INSERT INTO producto (producto_id, nombre, categoria, fecha_caducidad, fecha_compra, cantidad, unidad, precio, total) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DataBase.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, producto.getIdProducto());
            pstmt.setString(2, producto.nombreProductoProperty().getValue());
            pstmt.setString(3, producto.categoriaProperty().getValue());
            pstmt.setString(4, producto.fechacaducidadProperty().getValue());
            pstmt.setString(5, producto.fechacompraProperty().getValue());
            pstmt.setInt(6, producto.cantidadProductoProperty().getValue());
            pstmt.setString(7, producto.unidadProperty().getValue());
            pstmt.setDouble(8, producto.precioProductoProperty().getValue());
            pstmt.setDouble(9, producto.totalProperty().getValue());
            pstmt.executeUpdate();
            System.out.println("Producto insertado correctamente");
        } catch (SQLException e) {
            System.out.println("Error al insertar el producto: " + e.getMessage());
        }
    }


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
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ProductoInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaProducto.setTitle("Menú Producto");
        vistaProducto.setScene(scene);
        vistaProducto.show();
        cerrarVentana();
    }

    private void agregarProducto() {
        try {
            // Validar y convertir los valores de entrada
            Integer idProducto = validarEntero(idText.getText(), "ID del Producto");
            String nombreProducto = nombreText.getText();
            String categoria = categoriaText.getText();
            String fechacaducidad = caducidadText.getText();
            Integer cantidadProducto = validarEntero(cantidadText.getText(), "Cantidad del Producto");
            String unidad = unidadText.getText();
            double precioProducto = validarDouble(precioText.getText(), "Precio del Producto");
            double total = validarDouble(totalText.getText(), "Total");
            String fechacompra = fechacompraText.getText();

            // Crear un nuevo producto
            Producto nuevoProducto = new Producto(idProducto, nombreProducto, categoria, fechacaducidad, cantidadProducto, unidad, precioProducto, total, fechacompra);
            Producto.agregarProductoLista(nuevoProducto);
            insertarProducto(nuevoProducto);

            // Limpiar los campos de texto
            idText.clear();
            nombreText.clear();
            categoriaText.clear();
            caducidadText.clear();
            cantidadText.clear();
            unidadText.clear();
            precioText.clear();
            totalText.clear();
            fechacompraText.clear();

            // Imprimir productos agregados en la consola
            System.out.println("Productos agregados:");
            for (Producto producto : Producto.obtenerListaProductos()) {
                System.out.println(producto);
            }

        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Formato de número incorrecto");
            alert.setContentText("Por favor, ingrese números válidos en los campos correspondientes.");
            alert.showAndWait();
        } catch (DateTimeParseException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Formato de fecha incorrecto");
            alert.setContentText("Ingrese cuatro dígitos para el año, dos para el mes y dos para el día");
            alert.showAndWait();
        }
    }

    private Integer validarEntero(String valor, String nombreCampo) throws NumberFormatException {
        try {
            return Integer.valueOf(valor);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("El valor ingresado para " + nombreCampo + " no es un número entero válido.");
        }
    }

    private Double validarDouble(String valor, String nombreCampo) throws NumberFormatException {
        try {
            return Double.valueOf(valor);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("El valor ingresado para " + nombreCampo + " no es un número decimal válido.");
        }
    }

    public void cerrarVentana() {
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();
    }
}