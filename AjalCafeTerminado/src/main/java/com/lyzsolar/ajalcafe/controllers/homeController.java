package com.lyzsolar.ajalcafe.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lyzsolar.ajalcafe.App;
import com.lyzsolar.ajalcafe.models.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class homeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button IngresarButton;
    @FXML
    private ImageView ingresarIcono;


    @FXML
    private PasswordField password;
    Usuario administrador = new Usuario();
    Usuario vendedor = new Usuario();
    Stage vistaMenuAdministrador = new Stage();

    Stage vistaMenuVendedor = new Stage();
    @FXML
    private TextField user;


    @FXML
    void OnMouseclickedIngresarIcono(MouseEvent event) {
        String nombreUsuario = user.getText();
        String contrasena = password.getText();

        try{
            if (nombreUsuario.equals(administrador.getUsuario()) && contrasena.equals(administrador.getContrasena())){
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Admin-view.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                vistaMenuAdministrador.setTitle("Menu Administrador");
                vistaMenuAdministrador.setScene(scene);
                vistaMenuAdministrador.show();
            } else if (nombreUsuario.equals(vendedor.getUsuario2()) && contrasena.equals(vendedor.getContrasena2())){
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Vendedor_view.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                vistaMenuVendedor.setTitle("Menu Vendedor");
                vistaMenuVendedor.setScene(scene);
                vistaMenuVendedor.show();
            }else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Acceso incorrecto");
                alert.setContentText("Verificar el usuario o la contraseña.");
                alert.showAndWait();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void OnMouseclickedIngresarButton(MouseEvent event) {
        String nombreUsuario = user.getText();
        String contrasena = password.getText();

        try {
            if (nombreUsuario.equals(administrador.getUsuario()) && contrasena.equals(administrador.getContrasena())) {
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Admin-view.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                vistaMenuAdministrador.setTitle("Menu Administrador");
                vistaMenuAdministrador.setScene(scene);
                vistaMenuAdministrador.show();
            } else if (nombreUsuario.equals(vendedor.getUsuario2()) && contrasena.equals(vendedor.getContrasena2())) {
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Vendedor_view.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                vistaMenuVendedor.setTitle("Menu Vendedor");
                vistaMenuVendedor.setScene(scene);
                vistaMenuVendedor.show();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Acceso incorrecto");
                alert.setContentText("Verificar el usuario o la contraseña.");
                alert.showAndWait();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    void initialize() {
    }
}
