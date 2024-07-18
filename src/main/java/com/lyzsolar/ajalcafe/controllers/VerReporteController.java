package com.lyzsolar.ajalcafe.controllers;

import com.lyzsolar.ajalcafe.App;
import com.lyzsolar.ajalcafe.models.Reporte;
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

import java.io.IOException;

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
    private TableColumn<Reporte, Double> diferenciaColumn;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;
    Stage vistagenerarreport = new Stage();

    @FXML
    void OnMouseClickedRegresarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("reporteInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistagenerarreport.setTitle("Menú Reporte");
        vistagenerarreport.setScene(scene);
        vistagenerarreport.show();
        cerrarVentana();
    }

    @FXML
    void OnMouseClickedRegresarIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("reporteInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        vistagenerarreport.setTitle("Menú Reporte");
        vistagenerarreport.setScene(scene);
        vistagenerarreport.show();
        cerrarVentana();
    }

    @FXML
    void initialize() {
        fechadataTable.setCellValueFactory(cellData -> cellData.getValue().fechaReporteProperty());
        totalGastosTable.setCellValueFactory(cellData -> cellData.getValue().totalGastosProperty().asObject());
        totalVentasDataTable.setCellValueFactory(cellData -> cellData.getValue().totalVentasProperty().asObject());
        diferenciaColumn.setCellValueFactory(cellData -> cellData.getValue().diferenciaProperty().asObject());
        tableReporte.setItems(FXCollections.observableArrayList(Reporte.obtenerListaReporte()));
    }

    public void cerrarVentana() {
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();
    }

}
