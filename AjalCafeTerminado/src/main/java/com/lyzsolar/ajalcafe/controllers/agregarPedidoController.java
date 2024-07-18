package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import com.lyzsolar.ajalcafe.models.Pedido;

public class agregarPedidoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField AgregarProductText;

    @FXML
    private Button VistaCartaButton;

    @FXML
    private ImageView VistaCartaIcono;

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
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;

    @FXML
    private TextField subtotalText;

    @FXML
    private TextField totalText;

    @FXML
    void OnMouseclickedGuardarButton(MouseEvent event) {
        String idPedido = idText.getText().trim();
        String fechaPedido = fechaText.getText().trim();
        String nombreCliente = nomClienteText.getText().trim();
        String producto =  AgregarProductText.getText().trim();
        double subtotal = Double.parseDouble(subtotalText.getText().trim());
        double total = Double.parseDouble(totalText.getText().trim());
        Pedido pedido = new Pedido(idPedido, fechaPedido, nombreCliente, total, subtotal, producto);
        Pedido.agregarPedidoLista(pedido);
        System.out.println(pedido.toString());
        mostrarAlerta("Exito", "Pedido agregado con exito");
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
    void OnMouseclickedVistaCartaButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedVistaCartaIcono(MouseEvent event) {

    }

    @FXML
    void initialize() {
    }

}
