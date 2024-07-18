package com.lyzsolar.ajalcafe.controllers;

import com.lyzsolar.ajalcafe.App;
import com.lyzsolar.ajalcafe.models.Venta;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class ModificarVentaController {

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
    private TextField fechaText;

    @FXML
    private TextField totalText;

    @FXML
    private Button buscarbutton;

    @FXML
    private ImageView buscarIcono;
    Stage vistaVenta = new Stage();

    @FXML
    void OnMouseclickedBuscarButton(MouseEvent event) {
        String idVentaBuscado = idText.getText().trim();
        Venta ventaEncontrada = buscarVentaPorId(idVentaBuscado);
        if (ventaEncontrada != null) {
            fechaText.setText(ventaEncontrada.getFechaVenta());
            totalText.setText(String.valueOf(ventaEncontrada.getTotalVenta()));
        } else {
            mostrarAlertaError("Venta no encontrada", "No se encontró ninguna venta con el ID proporcionado.");
        }
    }

    @FXML
    void OnMouseclickedBuscarIcono(MouseEvent event) {
        String idVentaBuscado = idText.getText().trim();
        Venta ventaEncontrada = buscarVentaPorId(idVentaBuscado);
        if (ventaEncontrada != null) {
            fechaText.setText(ventaEncontrada.getFechaVenta());
            totalText.setText(String.valueOf(ventaEncontrada.getTotalVenta()));
        } else {
            mostrarAlertaError("Venta no encontrada", "No se encontró ninguna venta con el ID proporcionado.");
        }

    }

    @FXML
    void OnMouseclickedGuardarButton(MouseEvent event) {
        String idVenta = idText.getText().trim();
        Venta ventaEncontrada = buscarVentaPorId(idVenta);
        if (ventaEncontrada != null) {
            ventaEncontrada.setFechaVenta(fechaText.getText().trim());
            ventaEncontrada.setTotalVenta(Double.parseDouble(totalText.getText().trim()));
            mostrarAlertaInformacion("Venta modificada", "Los datos de la venta se han modificado correctamente.");
        } else {
            mostrarAlertaError("Venta no encontrada", "No se encontró ninguna venta con el ID proporcionado.");
        }
    }

    @FXML
    void OnMouseclickedGuardarIcono(MouseEvent event) {
        String idVenta = idText.getText().trim();
        Venta ventaEncontrada = buscarVentaPorId(idVenta);
        if (ventaEncontrada != null) {
            ventaEncontrada.setFechaVenta(fechaText.getText().trim());
            ventaEncontrada.setTotalVenta(Double.parseDouble(totalText.getText().trim()));
            mostrarAlertaInformacion("Venta modificada", "Los datos de la venta se han modificado correctamente.");
        } else {
            mostrarAlertaError("Venta no encontrada", "No se encontró ninguna venta con el ID proporcionado.");
        }
    }

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("VentasInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaVenta.setTitle("Menú Venta");
        vistaVenta.setScene(scene);
        vistaVenta.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("VentasInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaVenta.setTitle("Menú Venta");
        vistaVenta.setScene(scene);
        vistaVenta.show();
        cerrarVentana();
    }

    private Venta buscarVentaPorId(String idVenta) {
        List<Venta> listaVentas = Venta.obtenerListaVenta();
        for (Venta venta : listaVentas) {
            if (venta.getIdVenta().equals(idVenta)) {
                return venta;
            }
        }
        return null;
    }

    private void mostrarAlertaError(String titulo, String contenido) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(contenido);
        alerta.showAndWait();
    }
    private void mostrarAlertaInformacion(String titulo, String contenido) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(contenido);
        alerta.showAndWait();
    }

    public void cerrarVentana() {
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();
    }
}
