package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.App;
import com.lyzsolar.ajalcafe.models.Pedido;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class verPedidoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Pedido, String> idDataTable;

    @FXML
    private TableView<Pedido> tableVerProductos;

    @FXML
    private TableColumn<Pedido, Double> caducidadDataTable;

    @FXML
    private TableColumn<Pedido, String> cantidadDataTable;

    @FXML
    private TableColumn<Pedido, Double> categoriaDataTable;

    @FXML
    private TableColumn<Pedido, String> nombreDataTable;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;

    @FXML
    private TableColumn<Pedido, String> unidadDataTable;
    Stage vistaPedido = new Stage();

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
        idDataTable.setCellValueFactory(cellData -> cellData.getValue().idPedidoProperty());
        caducidadDataTable.setCellValueFactory(cellData -> cellData.getValue().totalAPagarProperty().asObject());
        cantidadDataTable.setCellValueFactory(cellData -> cellData.getValue().nombreClienteProperty());
        categoriaDataTable.setCellValueFactory(cellData -> cellData.getValue().subtotalProperty().asObject());
        nombreDataTable.setCellValueFactory(cellData -> cellData.getValue().productoProperty());
        unidadDataTable.setCellValueFactory(cellData -> cellData.getValue().fechapedidoProperty());
        tableVerProductos.setItems(FXCollections.observableArrayList(Pedido.obtenerListaMenu()));
    }

    public void cerrarVentana() {
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();
    }

}

