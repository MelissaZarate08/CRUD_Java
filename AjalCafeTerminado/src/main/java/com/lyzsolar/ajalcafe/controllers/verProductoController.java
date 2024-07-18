package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.App;
import com.lyzsolar.ajalcafe.models.Producto;
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

public class verProductoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Producto> TableVerProductos;

    @FXML
    private TableColumn<Producto, Integer> IDDataTable;

    @FXML
    private TableColumn<Producto, String> nombreDataTable;

    @FXML
    private TableColumn<Producto, String> categoriaDataTable;

    @FXML
    private TableColumn<Producto, String> caducidadDataTable;

    @FXML
    private TableColumn<Producto, Integer> cantidadDataTable;

    @FXML
    private TableColumn<Producto, String> unidadDataTable;

    @FXML
    private TableColumn<Producto, Double> precioDataTable;

    @FXML
    private Button RegresarButton;
    @FXML
    private ImageView regresarIcono;
    Stage vistaProducto = new Stage();

    @FXML
    void OnMouseClickedRegresarIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ProductoInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaProducto.setTitle("Menú Producto");
        vistaProducto.setScene(scene);
        vistaProducto.show();
        Stage stage = (Stage) regresarIcono.getScene().getWindow();
        stage.close();

    }

    @FXML
    void OnMouseClickedRegresarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ProductoInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaProducto.setTitle("Menú Producto");
        vistaProducto.setScene(scene);
        vistaProducto.show();
        Stage stage = (Stage) RegresarButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void initialize() {
        IDDataTable.setCellValueFactory(cellData -> cellData.getValue().idProductoProperty().asObject());
        nombreDataTable.setCellValueFactory(cellData -> cellData.getValue().nombreProductoProperty());
        categoriaDataTable.setCellValueFactory(cellData -> cellData.getValue().categoriaProperty());
        caducidadDataTable.setCellValueFactory(cellData -> cellData.getValue().fechacaducidad());
        cantidadDataTable.setCellValueFactory(cellData -> cellData.getValue().cantidadProductoProperty().asObject());
        unidadDataTable.setCellValueFactory(cellData -> cellData.getValue().unidadProperty());
        precioDataTable.setCellValueFactory(cellData -> cellData.getValue().precioProductoProperty().asObject());
        TableVerProductos.setItems(FXCollections.observableArrayList(Producto.obtenerListaProductos()));
    }
}
