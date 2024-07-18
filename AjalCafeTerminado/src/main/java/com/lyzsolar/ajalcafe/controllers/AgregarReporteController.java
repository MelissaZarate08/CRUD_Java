package com.lyzsolar.ajalcafe.controllers;

import com.lyzsolar.ajalcafe.models.Reporte;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class AgregarReporteController {

    @FXML
    private Button guardarbutton;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView guardarIcono;

    @FXML
    private ImageView regresarIcono;

    @FXML
    private TextField totalVentasText;

    @FXML
    private TextField fechaText;

    @FXML
    private TextField totaGastoslText;

    @FXML
    private TextField diferenciaText;

    @FXML
    void OnMouseclickedGuardarButton(MouseEvent event) {
        try {
            String fechaReporte = fechaText.getText().trim();
            double totalVentas = Double.parseDouble(totalVentasText.getText().trim());
            double totalGastos = Double.parseDouble(totaGastoslText.getText().trim());
            double diferencia = Double.parseDouble(diferenciaText.getText().trim());
            Reporte reporte = new Reporte(fechaReporte, totalVentas, totalGastos, diferencia);
            Reporte.agregarReporteLista(reporte);
            mostrarAlertaInformacion("Reporte guardado", "El reporte ha sido guardado correctamente.");
        } catch (NumberFormatException e) {
            mostrarAlertaError("Error", "Por favor, ingresa valores válidos para total de ventas, total de gastos y diferencia.");
        }
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
