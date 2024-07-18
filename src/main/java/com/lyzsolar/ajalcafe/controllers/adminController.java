package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.App;
import com.lyzsolar.ajalcafe.models.Producto;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class adminController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button productoButton;

    @FXML
    private Button menuButton;

    @FXML
    private Button pedidoButton;

    @FXML
    private Button ventaButton;

    @FXML
    private Button reporteButton;

    @FXML
    private Button cerrarButton;
    @FXML
    private ImageView cerrarIcono;
    @FXML
    private Button gastosButton;

    Stage vistaProducto = new Stage();
    Stage vistaPedido = new Stage();
    Stage vistaMenu = new Stage();
    Stage vistaVenta = new Stage();
    Stage vistaReporte = new Stage();

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
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("MenuInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaMenu.setTitle("Menú");
        vistaMenu.setScene(scene);
        vistaMenu.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedPedidoButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("PedidoInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaPedido.setTitle("Menú pedido");
        vistaPedido.setScene(scene);
        vistaPedido.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedProductoButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ProductoInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaProducto.setTitle("Menú producto");
        vistaProducto.setScene(scene);
        vistaProducto.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedReporteButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ReporteInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaReporte.setTitle("Menú Reporte");
        vistaReporte.setScene(scene);
        vistaReporte.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseclickedVentasButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("VentasInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaVenta.setTitle("Menú Ventas");
        vistaVenta.setScene(scene);
        vistaVenta.show();
        cerrarVentana();
    }

    public void cerrarVentana() {
        Stage stage = (Stage) cerrarButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void OnMouseclickedgastosButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("AgregarGastos-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaVenta.setTitle("Menú Ventas");
        vistaVenta.setScene(scene);
        vistaVenta.show();
        cerrarVentana();
    }

    @FXML
    void initialize() {
    }
}
