package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.models.Pedido;
import com.lyzsolar.ajalcafe.models.Venta;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class verVentaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Venta, String> IDDataTable;

    @FXML
    private Button RegresarButton;

    @FXML
    private TableView<Venta> TableVerProductos;

    @FXML
    private TableColumn<Venta, String> fechaDataTable;

    @FXML
    private TableColumn<Venta, Double> montototalDataTable;

    @FXML
    private ImageView regresarIcono;

    @FXML
    void OnMouseClickedRegresarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseClickedRegresarIcono(MouseEvent event) {

    }

    @FXML
    void initialize() {
        IDDataTable.setCellValueFactory(cellData -> cellData.getValue().idVentaProperty());
        fechaDataTable.setCellValueFactory(cellData -> cellData.getValue().fechaVentaProperty());
        montototalDataTable.setCellValueFactory(cellData -> cellData.getValue().totalVentaProperty().asObject());
        TableVerProductos.setItems(FXCollections.observableArrayList(Venta.obtenerListaVenta()));
    }

}
