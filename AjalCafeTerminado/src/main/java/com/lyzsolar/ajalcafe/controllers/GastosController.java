package com.lyzsolar.ajalcafe.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class GastosController {

    @FXML
    private TableView<?> TableVerProductos;

    @FXML
    private TableColumn<?, ?> IDDataTable;

    @FXML
    private TableColumn<?, ?> nombreDataTable;

    @FXML
    private TableColumn<?, ?> cantidadDataTable;

    @FXML
    private TableColumn<?, ?> precioDataTable;

    @FXML
    private TableColumn<?, ?> fechacompraDataTable;

    @FXML
    private TableColumn<?, ?> fechacompraDataTable1;

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

}
