package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.models.Pedido;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class modificarPedidoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView buscarIcono;

    @FXML
    private Button buscarrButton;

    @FXML
    private TextField fechaText;

    @FXML
    private ImageView guardarIcono;

    @FXML
    private Button guardarbutton;

    @FXML
    private TextField idText;

    @FXML
    private TextField nomClienteText;

    @FXML
    private TextField productoText;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;

    @FXML
    private TextField subtotalText;

    @FXML
    private TextField totalText;

    @FXML
    void OnMouseclickedBuscarButton(MouseEvent event) {
        String idPedidoBuscado = idText.getText().trim();
        boolean pedidoEncontrado = false;
        for (Pedido pedido : Pedido.obtenerListaMenu()) {
            if (pedido.getIdPedido().equalsIgnoreCase(idPedidoBuscado)) {
                fechaText.setText(pedido.getFechapedido());
                productoText.setText(pedido.getProducto());
                nomClienteText.setText(pedido.getNombreCliente());
                subtotalText.setText(String.valueOf(pedido.getSubtotal()));
                totalText.setText(String.valueOf(pedido.getTotalAPagar()));
                pedidoEncontrado = true;
                break;
            }
        }
        if (!pedidoEncontrado) {
            mostrarAlertaError("Pedido no encontrado", "El pedido no existe en la lista.");
        }
    }

    private void mostrarAlertaError(String titulo, String contenido) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(contenido);
        alerta.showAndWait();
    }

    @FXML
    void OnMouseclickedBuscarIcono(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedGuardarButton(MouseEvent event) {
        String idPedidoBuscado = idText.getText().trim();
        boolean pedidoEncontrado = false;
        for (Pedido pedido : Pedido.obtenerListaMenu()) {
            if (pedido.getIdPedido().equalsIgnoreCase(idPedidoBuscado)) {
                pedido.setFechapedido(fechaText.getText());
                pedido.setProducto(productoText.getText());
                pedido.setNombreCliente(nomClienteText.getText());
                pedido.setSubtotal(Double.parseDouble(subtotalText.getText()));
                pedido.setTotalAPagar(Double.parseDouble(totalText.getText()));
                mostrarAlerta("Pedido modificado", "Los datos del pedido se han modificado correctamente.");
                pedidoEncontrado = true;
                break;
            }
        }
        if (!pedidoEncontrado) {
            mostrarAlertaError("Pedido no encontrado", "El pedido no existe en la lista.");
        }
    }

    private void mostrarAlerta(String titulo, String contenido) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(contenido);
        alerta.showAndWait();
    }


    @FXML
    void OnMouseclickedGuardarIcono(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) {

    }

    @FXML
    void initialize() {
    }

}

