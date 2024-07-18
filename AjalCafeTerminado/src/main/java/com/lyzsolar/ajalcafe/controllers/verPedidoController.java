package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.models.Pedido;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class verPedidoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Pedido, String> IDDataTable;

    @FXML
    private TableView<Pedido> TableVerProductos;

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

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) {

    }

    @FXML
    void initialize() {
        IDDataTable.setCellValueFactory(cellData -> cellData.getValue().idPedidoProperty());
        caducidadDataTable.setCellValueFactory(cellData -> cellData.getValue().totalAPagarProperty().asObject());
        cantidadDataTable.setCellValueFactory(cellData -> cellData.getValue().nombreClienteProperty());
        categoriaDataTable.setCellValueFactory(cellData -> cellData.getValue().subtotalProperty().asObject());
        nombreDataTable.setCellValueFactory(cellData -> cellData.getValue().nombreClienteProperty());
        unidadDataTable.setCellValueFactory(cellData -> cellData.getValue().fechapedidoProperty());
        TableVerProductos.setItems(FXCollections.observableArrayList(Pedido.obtenerListaMenu()));
    }

}

