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

public class verProductoVendedorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Producto> tableVerProductos;

    @FXML
    private TableColumn<Producto, Integer> idDataTable;

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
    private TableColumn<Producto, String> fechacompraDataTable;

    @FXML
    private Button regresarButton;
    @FXML
    private ImageView regresarIcono;
    Stage vistaProductVendedor= new Stage();

    @FXML
    void OnMouseClickedRegresarIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ProductoVendedor-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaProductVendedor.setTitle("Submenú Producto Vendedor");
        vistaProductVendedor.setScene(scene);
        vistaProductVendedor.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseClickedRegresarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ProductoVendedor-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaProductVendedor.setTitle("Submenú Producto Vendedor");
        vistaProductVendedor.setScene(scene);
        vistaProductVendedor.show();
        cerrarVentana();
    }

    @FXML
    void initialize() {
        idDataTable.setCellValueFactory(cellData -> cellData.getValue().idProductoProperty().asObject());
        nombreDataTable.setCellValueFactory(cellData -> cellData.getValue().nombreProductoProperty());
        categoriaDataTable.setCellValueFactory(cellData -> cellData.getValue().categoriaProperty());
        caducidadDataTable.setCellValueFactory(cellData -> cellData.getValue().fechacaducidad());
        cantidadDataTable.setCellValueFactory(cellData -> cellData.getValue().cantidadProductoProperty().asObject());
        unidadDataTable.setCellValueFactory(cellData -> cellData.getValue().unidadProperty());
        precioDataTable.setCellValueFactory(cellData -> cellData.getValue().precioProductoProperty().asObject());
        fechacompraDataTable.setCellValueFactory(cellData -> cellData.getValue().fechacompraProperty());
        tableVerProductos.setItems(FXCollections.observableArrayList(Producto.obtenerListaProductos()));
    }

    public void cerrarVentana() {
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();
    }
}
