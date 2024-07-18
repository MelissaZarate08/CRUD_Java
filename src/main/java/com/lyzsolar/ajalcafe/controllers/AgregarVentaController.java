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
    Stage vistaVenta = new Stage();

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
        String idVenta = idText.getText().trim();
        String fechaVenta = fechaText.getText().trim();
        double totalVenta = Double.parseDouble(totalText.getText().trim());
        Venta venta = new Venta(idVenta, fechaVenta, totalVenta);
        Venta.agregarVentaLista(venta);
        System.out.println(venta.toString());
        mostrarAlerta("Exito", "La venta se agrego correctamente");

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

    public void cerrarVentana() {
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();
    }

}
