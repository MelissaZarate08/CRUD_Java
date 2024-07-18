package com.lyzsolar.ajalcafe.controllers;

import com.lyzsolar.ajalcafe.models.Venta;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class AgregarVentaController {

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
    void OnMouseclickedGuardarButton(MouseEvent event) {
        String idVenta = idText.getText().trim();
        String fechaVenta = fechaText.getText().trim();
        double totalVenta = Double.parseDouble(totalText.getText().trim());
        Venta venta = new Venta(idVenta, fechaVenta, totalVenta);
        Venta.agregarVentaLista(venta);
        System.out.println(venta.toString());
        mostrarAlerta("Exito", "La venta se agrego correctamente");
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

}
