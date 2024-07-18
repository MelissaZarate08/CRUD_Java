package com.lyzsolar.ajalcafe.controllers;

import com.lyzsolar.ajalcafe.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import com.lyzsolar.ajalcafe.models.Menu;

import java.io.IOException;

public class AgregarMenuController {

    @FXML
    private Button guardarbutton;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView guardarIcono;

    @FXML
    private ImageView regresarIcono;

    @FXML
    private TextField idText;

    @FXML
    private TextField nombreText;

    @FXML
    private TextField descripcionText;

    @FXML
    private TextField precioText;

    Stage SubmenuMenu = new Stage();

    @FXML
    void OnMouseclickedGuardarButton(MouseEvent event) {
        String idMenu = idText.getText().trim();
        String nombre = nombreText.getText().trim();
        String descripcion = descripcionText.getText().trim();
        double precio = Double.parseDouble(precioText.getText().trim());
        Menu nuevoMenu = new Menu(idMenu, nombre, descripcion, precio);
        Menu.agregarMenuLista(nuevoMenu);
        mostrarAlerta("Menú agregado", "El menú ha sido agregado correctamente.");
        System.out.println(nuevoMenu.toString());
    }
    private void mostrarAlerta(String titulo, String contenido) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(contenido);
        alerta.showAndWait();
    }


    @FXML
    void OnMouseclickedGuardarIcono(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedRegresarButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("MenuInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        SubmenuMenu.setTitle("Menú");
        SubmenuMenu.setScene(scene);
        SubmenuMenu.show();
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void OnMouseclickedRegresarIcono(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("MenuInterfaz-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        SubmenuMenu.setTitle("Menú");
        SubmenuMenu.setScene(scene);
        SubmenuMenu.show();
        Stage stage = (Stage) regresarIcono.getScene().getWindow();
        stage.close();

    }

}
