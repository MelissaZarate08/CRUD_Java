package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ventasVendedorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button agregarButton;

    @FXML
    private ImageView backIcono;

    @FXML
    private Button eliminarButton;

    @FXML
    private Button modificarButton;

    @FXML
    private Button regresarButton;

    @FXML
    private Button verButton;
    Stage vistaMenuVendedor = new Stage();

    @FXML
    void OnMouseclickedAgregarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedBackIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Vendedor_view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaMenuVendedor.setTitle("Menu Vendedor");
        vistaMenuVendedor.setScene(scene);
        vistaMenuVendedor.show();
        Stage stage = (Stage) backIcono.getScene().getWindow();
        stage.close();

    }

    @FXML
    void OnMouseclickedEliminarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedModificarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Vendedor_view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaMenuVendedor.setTitle("Menu Vendedor");
        vistaMenuVendedor.setScene(scene);
        vistaMenuVendedor.show();
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void OnMouseclickedVerButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert agregarButton != null : "fx:id=\"agregarButton\" was not injected: check your FXML file 'VentasVendedor-view.fxml'.";
        assert backIcono != null : "fx:id=\"backIcono\" was not injected: check your FXML file 'VentasVendedor-view.fxml'.";
        assert eliminarButton != null : "fx:id=\"eliminarButton\" was not injected: check your FXML file 'VentasVendedor-view.fxml'.";
        assert modificarButton != null : "fx:id=\"modificarButton\" was not injected: check your FXML file 'VentasVendedor-view.fxml'.";
        assert regresarButton != null : "fx:id=\"regresarButton\" was not injected: check your FXML file 'VentasVendedor-view.fxml'.";
        assert verButton != null : "fx:id=\"verButton\" was not injected: check your FXML file 'VentasVendedor-view.fxml'.";

    }

}
