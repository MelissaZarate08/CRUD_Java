package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.models.Gasto;
import com.lyzsolar.ajalcafe.models.Pedido;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ObservarGastosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Gasto> tableVerProductos;

    @FXML
    private TableColumn<Gasto, String> idDataTable;

    @FXML
    private TableColumn<Gasto, String> nombreDataTable;

    @FXML
    private TableColumn<Gasto, Double> cantidadDataTable;

    @FXML
    private TableColumn<Gasto, Double> precioDataTable;

    @FXML
    private TableColumn<Gasto, String> fechacompraDataTable;

    @FXML
    private Button regresarButton;

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
        idDataTable.setCellValueFactory(cellData -> cellData.getValue().idgastosProperty());
        nombreDataTable.setCellValueFactory(celData -> celData.getValue().nombreDataTableProperty());
        cantidadDataTable.setCellValueFactory(cellData -> cellData.getValue().cantidadDataTableProperty().asObject());
        precioDataTable.setCellValueFactory(cellData -> cellData.getValue().precioDataTableProperty().asObject());
        fechacompraDataTable.setCellValueFactory(cellData -> cellData.getValue().fechacompraDataTableProperty());
        tableVerProductos.setItems(FXCollections.observableArrayList(Gasto.obtenerListaGasto()));
    }
}
