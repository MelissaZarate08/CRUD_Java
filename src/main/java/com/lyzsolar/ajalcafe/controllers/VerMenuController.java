package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.App;
import com.lyzsolar.ajalcafe.models.Menu;
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

public class VerMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Menu> tableVerProductos;

    @FXML
    private TableColumn<Menu, String> idDataTable;

    @FXML
    private TableColumn<Menu, String> nombreDataTable;

    @FXML
    private TableColumn<Menu, String> descripcionDataTable;

    @FXML
    private TableColumn<Menu, Double> precioDataTable;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;
    Stage vistaMenu = new Stage();

    @FXML
    void OnMouseClickedRegresarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("MenuVendedor-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaMenu.setTitle(" Menú ");
        vistaMenu.setScene(scene);
        vistaMenu.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseClickedRegresarIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("MenuVendedor-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistaMenu.setTitle(" Menú ");
        vistaMenu.setScene(scene);
        vistaMenu.show();
        cerrarVentana();
    }

    @FXML
    void initialize() {
        idDataTable.setCellValueFactory(cellData -> cellData.getValue().idMenuProperty());
        nombreDataTable.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        descripcionDataTable.setCellValueFactory(cellData -> cellData.getValue().descripcionProperty());
        precioDataTable.setCellValueFactory(cellData -> cellData.getValue().precioProperty().asObject());
        tableVerProductos.setItems(FXCollections.observableArrayList(Menu.obtenerListaMenu()));
    }

    public void cerrarVentana() {
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();
    }
}
