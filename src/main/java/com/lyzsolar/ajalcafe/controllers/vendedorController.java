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

public class vendedorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cerrarButton;

    @FXML
    private ImageView cerrarIcono;

    @FXML
    private Button menuButton;

    @FXML
    private Button pedidoButton;

    @FXML
    private Button productoButton;

    @FXML
    private Button ventaButton;

    Stage vistaProductoVendedor = new Stage();
    Stage vistaMenuVendedor = new Stage();
    Stage vistaPedidoVendedor = new Stage();
    Stage vistaVentaVendedor = new Stage();

    @FXML
    void OnMouseclickedCerrarButton(MouseEvent event) {
        cerrarVentana();

    }

    @FXML
    void OnMouseclickedCerrarIcono(MouseEvent event) {
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedMenuButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("MenuVendedor-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaMenuVendedor.setTitle("Menú-Vendedor");
        vistaMenuVendedor.setScene(scene);
        vistaMenuVendedor.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedPedidoButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("PedidoVendedor-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaPedidoVendedor.setTitle("Pedido-Vendedor");
        vistaPedidoVendedor.setScene(scene);
        vistaPedidoVendedor.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedProductoButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ProductoVendedor-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaProductoVendedor.setTitle("Producto-Vendedor");
        vistaProductoVendedor.setScene(scene);
        vistaProductoVendedor.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedVentasButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("VentasVendedor-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaVentaVendedor.setTitle("Ventas-Vendedor");
        vistaVentaVendedor.setScene(scene);
        vistaVentaVendedor.show();
        cerrarVentana();
    }

    @FXML
    void initialize() {
    }

    public void cerrarVentana() {
        Stage stage = (Stage) cerrarButton.getScene().getWindow();
        stage.close();
    }
}
