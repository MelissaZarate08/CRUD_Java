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

public class productoVendedorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;

    @FXML
    private Button verProductosButton;
    Stage vistaMenuVendedor = new Stage();

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Vendedor_view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaMenuVendedor.setTitle("Menú Vendedor");
        vistaMenuVendedor.setScene(scene);
        vistaMenuVendedor.show();
        Stage stage = (Stage) regresarIcono.getScene().getWindow();
        stage.close();

    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Vendedor_view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaMenuVendedor.setTitle("Menu Vendedor");
        vistaMenuVendedor.setScene(scene);
        vistaMenuVendedor.show();
        Stage stage = (Stage) regresarIcono.getScene().getWindow();
        stage.close();

    }


    @FXML
    void OnMouseclickedVerProductosButton(MouseEvent event) {
        

    }

    @FXML
    void initialize() {
        assert regresarButton != null : "fx:id=\"regresarButton\" was not injected: check your FXML file 'ProductoVendedor-view.fxml'.";
        assert regresarIcono != null : "fx:id=\"regresarIcono\" was not injected: check your FXML file 'ProductoVendedor-view.fxml'.";
        assert verProductosButton != null : "fx:id=\"verProductosButton\" was not injected: check your FXML file 'ProductoVendedor-view.fxml'.";

    }

}
