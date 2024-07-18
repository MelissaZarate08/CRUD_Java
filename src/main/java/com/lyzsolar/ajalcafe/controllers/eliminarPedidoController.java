package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.App;
import com.lyzsolar.ajalcafe.models.Pedido;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class eliminarPedidoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BuscarButton;


    @FXML
    private TextField Idtext;

    @FXML
    private ImageView buscarIcono;

    @FXML
    private Button eliminarButton;

    @FXML
    private ImageView eliminarIcono;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;
    Stage vistaPedido = new Stage();

    @FXML
    void OnMouseclickedBuscarButton(MouseEvent event) {
        String idPedidoBuscado = Idtext.getText().trim();
        boolean pedidoEncontrado = false;
        for (Pedido pedido : Pedido.obtenerListaMenu()) {
            if (pedido.getIdPedido().equalsIgnoreCase(idPedidoBuscado)) {
                pedidoEncontrado = true;
                mostrarAlerta("Exito", "Pedido encontrado.\n Seleccione eliminar para borrar el pedido. ");
                break;
            }
        }
        if (!pedidoEncontrado) {
            mostrarAlertaError("Pedido no encontrado", "El pedido no existe en la lista.");
        }
    }

    private void mostrarAlertaError(String titulo, String contenido) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(contenido);
        alerta.showAndWait();
    }

    @FXML
    void OnMouseclickedBuscarIcono(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedEliminarButton(MouseEvent event) {
        String idPedidoAEliminar = Idtext.getText().trim();
        boolean pedidoEncontrado = false;

        for (Pedido pedido : Pedido.obtenerListaMenu()) {
            if (pedido.getIdPedido().equalsIgnoreCase(idPedidoAEliminar)) {
                Pedido.obtenerListaMenu().remove(pedido);
                mostrarAlerta("Pedido eliminado", "El pedido ha sido eliminado correctamente.");
                pedidoEncontrado = true;
                break;
            }
        }

        if (!pedidoEncontrado) {
            mostrarAlertaError("Pedido no encontrado", "El pedido no existe en la lista.");
        }
    }

    private void mostrarAlerta(String titulo, String contenido) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(contenido);
        alerta.showAndWait();
    }

    @FXML
    void OnMouseclickedEliminarIcono(MouseEvent event) {
        String idPedidoAEliminar = Idtext.getText().trim();
        boolean pedidoEncontrado = false;

        for (Pedido pedido : Pedido.obtenerListaMenu()) {
            if (pedido.getIdPedido().equalsIgnoreCase(idPedidoAEliminar)) {
                Pedido.obtenerListaMenu().remove(pedido);
                mostrarAlerta("Pedido eliminado", "El pedido ha sido eliminado correctamente.");
                pedidoEncontrado = true;
                break;
            }
        }

        if (!pedidoEncontrado) {
            mostrarAlertaError("Pedido no encontrado", "El pedido no existe en la lista.");
        }

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
    void initialize() {
    }

    public void cerrarVentana() {
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();
    }

}

