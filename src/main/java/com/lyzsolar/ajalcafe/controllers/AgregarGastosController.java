package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.App;
import com.lyzsolar.ajalcafe.models.Gasto;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AgregarGastosController {

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
    private TextField precioText;

    @FXML
    private TextField cantidadText;

    @FXML
    private TextField nombreText;

    @FXML
    private TextField fechaText;

    @FXML
    private Button verGastosButton;

    @FXML
    void OnMouseclickedGuardarButton(MouseEvent event) {
        String id = idText.getText();
        String nombre = nombreText.getText();
        double cantidad = Double.parseDouble(cantidadText.getText());
        double precio = Double.parseDouble(precioText.getText());
        String fecha = fechaText.getText();
        Gasto nuevoGasto = new Gasto(id, nombre, cantidad, precio, fecha);
        Gasto.agregarGastoLista(nuevoGasto);
        idText.clear();
        nombreText.clear();
        cantidadText.clear();
        precioText.clear();
        fechaText.clear();
        mostrarAlerta("Exto","Gastos agregados correctamente");
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
        String id = idText.getText();
        String nombre = nombreText.getText();
        double cantidad = Double.parseDouble(cantidadText.getText());
        double precio = Double.parseDouble(precioText.getText());
        String fecha = fechaText.getText();
        Gasto nuevoGasto = new Gasto(id, nombre, cantidad, precio, fecha);
        Gasto.agregarGastoLista(nuevoGasto);
        idText.clear();
        nombreText.clear();
        cantidadText.clear();
        precioText.clear();
        fechaText.clear();
        mostrarAlerta("Exto","Gastos agregados correctamente");
    }

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) {
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) {
        cerrarVentana();
    }

    public void cerrarVentana() {
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();
    }

    Stage callVer = new Stage();
    @FXML
    void OnMouseclickedverGastosButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ObservarGastos-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callVer.setTitle("Menú");
        callVer.setScene(scene);
        callVer.show();
        cerrarVentana();
    }

    @FXML
    void initialize() {
    }
}
