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

public class ModificarMenuController {

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

    @FXML
    private Button buscarrButton;

    @FXML
    void OnMouseclickedBuscarButton(MouseEvent event) {
        String idMenuBuscado = idText.getText().trim();
        boolean menuEncontrado = false;
        for (Menu menu : Menu.obtenerListaMenu()) {
            if (menu.getIdMenu().equalsIgnoreCase(idMenuBuscado)) {
                nombreText.setText(menu.getNombre());
                descripcionText.setText(menu.getDescripcion());
                precioText.setText(String.valueOf(menu.getPrecio()));
                menuEncontrado = true;
                break;
            }
        }
        if (!menuEncontrado) {
            mostrarAlertaError("Menú no encontrado", "El menú no existe en la lista.");
        }
    }

    private void mostrarAlertaError(String titulo, String contenido) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(contenido);
        alerta.showAndWait();
    }

    @FXML
    void OnMouseclickedBuscarIcono(MouseEvent event) {

    }

    @FXML
    void OnMouseclickedGuardarButton(MouseEvent event) {
        String idMenuBuscado = idText.getText().trim();
        boolean menuEncontrado = false;
        for (Menu menu : Menu.obtenerListaMenu()) {
            if (menu.getIdMenu().equalsIgnoreCase(idMenuBuscado)) {
                menu.setNombre(nombreText.getText());
                menu.setDescripcion(descripcionText.getText());
                menu.setPrecio(Double.parseDouble(precioText.getText()));
                menuEncontrado = true;
                break;
            }
        }
        if (!menuEncontrado) {
            mostrarAlertaError("Menú no encontrado", "El menú no existe en la lista.");
        } else {
            mostrarAlerta("Menú modificado", "El menú ha sido modificado correctamente.");
        }
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

    Stage SubmenuMenu = new Stage();
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
        Stage stage = (Stage) regresarButton.getScene().getWindow();
        stage.close();

    }

}
