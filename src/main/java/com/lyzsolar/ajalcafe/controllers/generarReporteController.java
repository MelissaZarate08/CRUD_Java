package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class generarReporteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button regresarButton;

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
    Stage vistareport = new Stage();

    @FXML
    void OnMouseClickedRegresarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ReporteInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistareport.setTitle("Menu Reporte");
        vistareport.setScene(scene);
        vistareport.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseClickedRegresarIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ReporteInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistareport.setTitle("Menu Reporte");
        vistareport.setScene(scene);
        vistareport.show();
        cerrarVentana();
    }

    @FXML
    void initialize() {
    }

    public void cerrarVentana() {
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();
    }
}

