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

public class cartaMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;
    Stage vistaaddPedido = new Stage();

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("AgregarPedido-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaaddPedido.setTitle("Menú Agregar Pedido");
        vistaaddPedido.setScene(scene);
        vistaaddPedido.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("AgregarPedido-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaaddPedido.setTitle("Menú Agregar Pedido");
        vistaaddPedido.setScene(scene);
        vistaaddPedido.show();
        cerrarVentana();
    }

    @FXML
    void initialize() {
    }

    public void cerrarVentana() {
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();
    }

}
