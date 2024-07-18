package com.lyzsolar.ajalcafe.controllers;

import com.lyzsolar.ajalcafe.models.Reporte;
import com.lyzsolar.ajalcafe.models.Venta;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class VerReporteController {

    @FXML
    private TableView<Reporte> tableReporte;

    @FXML
    private TableColumn<Reporte, String> fechadataTable;

    @FXML
    private TableColumn<Reporte, Double> totalGastosTable;

    @FXML
    private TableColumn<Reporte, Double> totalVentasDataTable;

    @FXML
    private Button RegresarButton;

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
        fechadataTable.setCellValueFactory(cellData -> cellData.getValue().fechaReporteProperty());
        totalGastosTable.setCellValueFactory(cellData -> cellData.getValue().totalGastosProperty().asObject());
        totalVentasDataTable.setCellValueFactory(cellData -> cellData.getValue().totalVentasProperty().asObject());
        tableReporte.setItems(FXCollections.observableArrayList(Reporte.obtenerListaReporte()));
    }

}
