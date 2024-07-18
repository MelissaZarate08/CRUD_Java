package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.models.Venta;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class eliminarVentaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BuscarButton;

    @FXML
    private TextField IDText;

    @FXML
    private Button eliminarButton;

    @FXML
    private ImageView eliminarIcono;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;

    @FXML
    private ImageView verIcono;

    @FXML
    void OnMouseclickedBuscarButton(MouseEvent event) {
        String idVentaBuscado = IDText.getText().trim();
        Venta ventaEncontrada = buscarVentaPorId(idVentaBuscado);
        if (ventaEncontrada != null) {
            mostrarAlertaInformacion("Venta encontrada", "ID: " + ventaEncontrada.getIdVenta() + "\n" +
                    "Fecha: " + ventaEncontrada.getFechaVenta() + "\n" +
                    "Total: " + ventaEncontrada.getTotalVenta());
        } else {
            mostrarAlertaError("Venta no encontrada", "No se encontró ninguna venta con el ID proporcionado.");
        }
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

    @FXML
    void OnMouseclickedEliminarButton(MouseEvent event) {
        String idVentaBuscado = IDText.getText().trim();
        boolean eliminado = eliminarVentaPorId(idVentaBuscado);
        if (eliminado) {
            mostrarAlertaInformacion("Venta eliminada", "La venta con ID: " + idVentaBuscado + " ha sido eliminada.");
        } else {
            mostrarAlertaError("Error", "No se encontró ninguna venta con el ID proporcionado.");
        }
    }

    @FXML
    void OnMouseclickedEliminarIcono(MouseEvent event) {
        String idVentaBuscado = IDText.getText().trim();
        boolean eliminado = eliminarVentaPorId(idVentaBuscado);
        if (eliminado) {
            mostrarAlertaInformacion("Venta eliminada", "La venta con ID: " + idVentaBuscado + " ha sido eliminada.");
        } else {
            mostrarAlertaError("Error", "No se encontró ninguna venta con el ID proporcionado.");
        }
    }

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedVerIcono(MouseEvent event) {
        String idVentaBuscado = IDText.getText().trim();
        Venta ventaEncontrada = buscarVentaPorId(idVentaBuscado);
        if (ventaEncontrada != null) {
            mostrarAlertaInformacion("Venta encontrada", "ID: " + ventaEncontrada.getIdVenta() + "\n" +
                    "Fecha: " + ventaEncontrada.getFechaVenta() + "\n" +
                    "Total: " + ventaEncontrada.getTotalVenta());
        } else {
            mostrarAlertaError("Venta no encontrada", "No se encontró ninguna venta con el ID proporcionado.");
        }
    }

    private boolean eliminarVentaPorId(String idVenta) {
        List<Venta> listaVentas = Venta.obtenerListaVenta();
        Iterator<Venta> iterator = listaVentas.iterator();
        while (iterator.hasNext()) {
            Venta venta = iterator.next();
            if (venta.getIdVenta().equals(idVenta)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @FXML
    void initialize() {
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

}
