package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import com.lyzsolar.ajalcafe.models.Pedido;
import javafx.stage.Stage;

public class agregarPedidoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField agregarProductText;

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
    Stage vistaPedido = new Stage();
    Stage vistaCarta = new Stage();

    @FXML
    void OnMouseclickedGuardarButton(MouseEvent event) {
        String idPedido = idText.getText().trim();
        String fechaPedido = fechaText.getText().trim();
        String nombreCliente = nomClienteText.getText().trim();
        String producto =  agregarProductText.getText().trim();
        double subtotal = Double.parseDouble(subtotalText.getText().trim());
        double total = Double.parseDouble(totalText.getText().trim());
        Pedido pedido = new Pedido(idPedido, fechaPedido, nombreCliente, total, subtotal, producto);
        Pedido.agregarPedidoLista(pedido);
        System.out.println(pedido.toString());
        mostrarAlerta("Exito", "Pedido agregado con exito");

        idText.clear();
        fechaText.clear();
        nomClienteText.clear();
        agregarProductText.clear();
        subtotalText.clear();
        totalText.clear();
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
        String idPedido = idText.getText().trim();
        String fechaPedido = fechaText.getText().trim();
        String nombreCliente = nomClienteText.getText().trim();
        String producto =  agregarProductText.getText().trim();
        double subtotal = Double.parseDouble(subtotalText.getText().trim());
        double total = Double.parseDouble(totalText.getText().trim());
        Pedido pedido = new Pedido(idPedido, fechaPedido, nombreCliente, total, subtotal, producto);
        Pedido.agregarPedidoLista(pedido);
        System.out.println(pedido.toString());
        mostrarAlerta("Exito", "Pedido agregado con exito");

        idText.clear();
        fechaText.clear();
        nomClienteText.clear();
        agregarProductText.clear();
        subtotalText.clear();
        totalText.clear();

    }

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("PedidoInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaPedido.setTitle("Menú Pedido");
        vistaPedido.setScene(scene);
        vistaPedido.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("PedidoInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaPedido.setTitle("Menú Pedido");
        vistaPedido.setScene(scene);
        vistaPedido.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedVistaCartaButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("CartaMenu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaCarta.setTitle("Menú Pedido");
        vistaCarta.setScene(scene);
        vistaCarta.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedVistaCartaIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("CartaMenu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaCarta.setTitle("Menú Pedido");
        vistaCarta.setScene(scene);
        vistaCarta.show();
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
