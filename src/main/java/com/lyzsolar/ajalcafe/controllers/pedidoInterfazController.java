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

public class pedidoInterfazController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button agregarButton;

    @FXML
    private Button eliminarButton;

    @FXML
    private Button modificarButton;

    @FXML
    private Button regresarButton;

    @FXML
    private Button verButton;
    @FXML
    private ImageView regresarIcono;

    Stage vistaMenuAdministrador = new Stage();
    Stage AddPedido = new Stage();
    Stage DeletePedido = new Stage();
    Stage VerPedido = new Stage();


    @FXML
    void OnMouseclickedAgregarButton(MouseEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("AgregarPedido-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        AddPedido.setTitle("Agregar Pedido");
        AddPedido.setScene(scene);
        AddPedido.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedEliminarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("EliminarPedido-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        DeletePedido.setTitle("Eliminar Pedido");
        DeletePedido.setScene(scene);
        DeletePedido.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedModificarButton(MouseEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ModificarPedido-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        DeletePedido.setTitle("Modificar Pedido");
        DeletePedido.setScene(scene);
        DeletePedido.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Admin-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaMenuAdministrador.setTitle("Menu Administrador");
        vistaMenuAdministrador.setScene(scene);
        vistaMenuAdministrador.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Admin-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaMenuAdministrador.setTitle("Menu Administrador");
        vistaMenuAdministrador.setScene(scene);
        vistaMenuAdministrador.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedVerButton(MouseEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("VerPedido-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        VerPedido.setTitle("Ver Pedido");
        VerPedido.setScene(scene);
        VerPedido.show();
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
