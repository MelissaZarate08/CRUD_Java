package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.App;
import com.lyzsolar.ajalcafe.models.Pedido;
import com.lyzsolar.ajalcafe.models.Venta;
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

public class verVentaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Venta, String> idDataTable;

    @FXML
    private Button regresarButton;

    @FXML
    private TableView<Venta> tableVerProductos;

    @FXML
    private TableColumn<Venta, String> fechaDataTable;

    @FXML
    private TableColumn<Venta, Double> montototalDataTable;

    @FXML
    private ImageView regresarIcono;
    Stage vistaVenta = new Stage();

    @FXML
    void OnMouseClickedRegresarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("VentasInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaVenta.setTitle("Menú Venta");
        vistaVenta.setScene(scene);
        vistaVenta.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseClickedRegresarIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("VentasInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaVenta.setTitle("Menú Venta");
        vistaVenta.setScene(scene);
        vistaVenta.show();
        cerrarVentana();
    }

    public void cerrarVentana() {
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();
    }
    @FXML
    void initialize() {
        idDataTable.setCellValueFactory(cellData -> cellData.getValue().idVentaProperty());
        fechaDataTable.setCellValueFactory(cellData -> cellData.getValue().fechaVentaProperty());
        montototalDataTable.setCellValueFactory(cellData -> cellData.getValue().totalVentaProperty().asObject());
        tableVerProductos.setItems(FXCollections.observableArrayList(Venta.obtenerListaVenta()));
    }

}
