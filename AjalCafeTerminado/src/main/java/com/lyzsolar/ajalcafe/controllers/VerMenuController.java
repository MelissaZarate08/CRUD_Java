package com.lyzsolar.ajalcafe.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.models.Menu;
import com.lyzsolar.ajalcafe.models.Producto;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class VerMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Menu> TableVerProductos;

    @FXML
    private TableColumn<Menu, String> IDDataTable;

    @FXML
    private TableColumn<Menu, String> nombreDataTable;

    @FXML
    private TableColumn<Menu, String> descripcionDataTable;

    @FXML
    private TableColumn<Menu, Double> precioDataTable;

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
        IDDataTable.setCellValueFactory(cellData -> cellData.getValue().idMenuProperty());
        nombreDataTable.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        descripcionDataTable.setCellValueFactory(cellData -> cellData.getValue().descripcionProperty());
        precioDataTable.setCellValueFactory(cellData -> cellData.getValue().precioProperty().asObject());
        TableVerProductos.setItems(FXCollections.observableArrayList(Menu.obtenerListaMenu()));
    }
}
