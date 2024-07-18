package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.App;
import com.lyzsolar.ajalcafe.models.DataBase;
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
    private Button buscarButton;
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
                actualizarProductoEnBD(producto);
                productoModificado = true;

                idText.clear();
                nombreText.clear();
                categoriaText.clear();
                caducidadText.clear();
                cantidadText.clear();
                unidadText.clear();
                precioText.clear();
                break;
            }
        }
        if (productoModificado) {
            mostrarAlerta("Producto modificado", "Los datos del producto han sido modificados.");
        } else {
            mostrarAlertaError("Producto no encontrado", "El producto no existe en la lista.");
        }
    }

    private void actualizarProductoEnBD(Producto producto) {
        String sql = "UPDATE producto SET nombre = ?, categoria = ?, fechacaducidad = ?, cantidad = ?, unidad = ?, precio = ? WHERE id = ?";
        try (Connection conn = DataBase.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, producto.nombreProductoProperty().get());
            pstmt.setString(2, producto.categoriaProperty().get());
            pstmt.setString(3, producto.fechacaducidadProperty().get());
            pstmt.setInt(4, producto.cantidadProductoProperty().get());
            pstmt.setString(5, producto.unidadProperty().get());
            pstmt.setDouble(6, producto.precioProductoProperty().get());
            pstmt.setInt(7, producto.getIdProducto());

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("No se pudo actualizar el producto, no se encontró el ID.");
            }
        } catch (SQLException e) {
            mostrarAlertaError("Error al modificar el producto", "Hubo un error al intentar modificar el producto: " + e.getMessage());
        }
    }

    @FXML
    void OnMouseclickedGuardarIcono(MouseEvent event) {
        OnMouseclickedGuardarButton(event);
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
        OnMouseclickedRegresarButton(event);
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

    public void cerrarVentana() {
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();
    }
}
