package com.lyzsolar.ajalcafe.models;

import javafx.beans.property.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final StringProperty idMenu;
    private final StringProperty Nombre;
    private final StringProperty Descripcion;
    private final DoubleProperty Precio;

    private static List<Menu> listaMenu = new ArrayList<>();

    public Menu(String idMenu, String nombre, String descripcion, double precio) {
        this.idMenu = new SimpleStringProperty(idMenu);
        this.Nombre = new SimpleStringProperty(nombre);
        this.Descripcion = new SimpleStringProperty(descripcion);
        this.Precio = new SimpleDoubleProperty(precio);
    }

    public String getIdMenu() {
        return idMenu.get();
    }

    public StringProperty idMenuProperty() {
        return idMenu;
    }

    public void setIdMenu(String idMenu) {
        this.idMenu.set(idMenu);
    }

    public String getNombre() {
        return Nombre.get();
    }

    public StringProperty nombreProperty() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre.set(nombre);
    }

    public String getDescripcion() {
        return Descripcion.get();
    }

    public StringProperty descripcionProperty() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion.set(descripcion);
    }

    public double getPrecio() {
        return Precio.get();
    }

    public DoubleProperty precioProperty() {
        return Precio;
    }

    public void setPrecio(double precio) {
        this.Precio.set(precio);
    }

    public static void agregarMenuLista(Menu menu) {
        listaMenu.add(menu);
    }

    public static List<Menu> obtenerListaMenu() {
        return listaMenu;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "idMenu=" + idMenu +
                ", Nombre=" + Nombre +
                ", Descripcion=" + Descripcion +
                ", Precio=" + Precio +
                '}';
    }
}
