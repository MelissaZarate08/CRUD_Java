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

public class EliminarProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView eliminarIcono;

    @FXML
    private TextField nombreText;

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
        String nombreProductoABuscar = nombreText.getText().trim();
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

        String nombreProductoAEliminar = nombreText.getText().trim();
        String sql = "DELETE FROM producto WHERE nombre=?";
        boolean productoEliminado = false;

        try (Connection conn = DataBase.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombreProductoAEliminar);
            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                productoEliminado = true;
                Producto.obtenerListaProductos().removeIf(producto ->
                        producto.nombreProductoProperty().get().equalsIgnoreCase(nombreProductoAEliminar));
                mostrarAlerta("Producto eliminado", "El producto ha sido eliminado de la lista.");
            } else {
                mostrarAlertaError("Producto no encontrado", "El producto no existe en la base de datos.");
            }

        } catch (SQLException e) {
            mostrarAlertaError("Error al eliminar el producto", "Hubo un error al intentar eliminar el producto: " + e.getMessage());
        }

        if (!productoEliminado) {
            mostrarAlertaError("Producto no encontrado", "El producto no existe en la lista.");
        }
    }

    @FXML
    void OnMouseclickedEliminarIcono(MouseEvent event) {
        OnMouseclickedEliminarButton(event);
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

    @FXML
    void OnMouseclickedVerIcono(MouseEvent event) {

    }

    public void cerrarVentana() {
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void initialize() {
    }
}
