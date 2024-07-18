package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class generarReporteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button RegresarButton;

    @FXML
    private TableColumn<?, ?> fechadataTable;

    @FXML
    private ImageView regresarIcono;

    @FXML
    private TableView<?> tableReporte;

    @FXML
    private TableColumn<?, ?> totalGastosTable;

    @FXML
    private TableColumn<?, ?> totalVentasDataTable;

    @FXML
    void OnMouseClickedRegresarButton(MouseEvent event) {

    }

    @FXML
    void OnMouseClickedRegresarIcono(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert RegresarButton != null : "fx:id=\"RegresarButton\" was not injected: check your FXML file 'GenerarReporte-view.fxml'.";
        assert fechadataTable != null : "fx:id=\"fechadataTable\" was not injected: check your FXML file 'GenerarReporte-view.fxml'.";
        assert regresarIcono != null : "fx:id=\"regresarIcono\" was not injected: check your FXML file 'GenerarReporte-view.fxml'.";
        assert tableReporte != null : "fx:id=\"tableReporte\" was not injected: check your FXML file 'GenerarReporte-view.fxml'.";
        assert totalGastosTable != null : "fx:id=\"totalGastosTable\" was not injected: check your FXML file 'GenerarReporte-view.fxml'.";
        assert totalVentasDataTable != null : "fx:id=\"totalVentasDataTable\" was not injected: check your FXML file 'GenerarReporte-view.fxml'.";

    }

}

