package com.lyzsolar.ajalcafe.controllers;

import com.lyzsolar.ajalcafe.App;
import com.lyzsolar.ajalcafe.models.Menu;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class EliminarMenuController {

    @FXML
    private ImageView eliminarIcono;

    @FXML
    private TextField NombreText;

    @FXML
    private Button eliminarButton;

    @FXML
    private Button BuscarButton;

    @FXML
    private Button regresarButton;

    @FXML
    private ImageView regresarIcono;

    @FXML
    private ImageView buscarIcono;

    @FXML
    void OnMouseclickedBuscarButton(MouseEvent event) {
        String NombreBuscado = NombreText.getText().trim();
        boolean menuEncontrado = false;
        for (Menu menu : Menu.obtenerListaMenu()) {
            if (menu.getNombre().equalsIgnoreCase(NombreBuscado)) {
                NombreText.setText(menu.getIdMenu());
                menuEncontrado = true;
                mostrarAlerta("Menú encontrado", "El menú ha sido encontrado.\n Presione eliminar si coincide el ID con el ID de su menu");
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
    void OnMouseclickedEliminarButton(MouseEvent event) {
        String idMenuAEliminar = NombreText.getText().trim();
        boolean menuEncontrado = false;

        for (Menu menu : Menu.obtenerListaMenu()) {
            if (menu.getIdMenu().equalsIgnoreCase(idMenuAEliminar)) {
                Menu.obtenerListaMenu().remove(menu);
                mostrarAlerta("Menú eliminado", "El menú ha sido eliminado correctamente.");
                menuEncontrado = true;
                break;
            }
        }

        if (!menuEncontrado) {
            mostrarAlertaError("Menú no encontrado", "El menú no existe en la lista.");
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
    void OnMouseclickedEliminarIcono(MouseEvent event) {

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
