package com.lyzsolar.ajalcafe.models;

import javafx.beans.property.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final StringProperty idMenu;
    private final StringProperty nombre;
    private final StringProperty descripcion;
    private final DoubleProperty precio;

    private static List<Menu> listaMenu = new ArrayList<>();

    public Menu(String idMenu, String nombre, String descripcion, double precio) {
        this.idMenu = new SimpleStringProperty(idMenu);
        this.nombre = new SimpleStringProperty(nombre);
        this.descripcion = new SimpleStringProperty(descripcion);
        this.precio = new SimpleDoubleProperty(precio);
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
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getDescripcion() {
        return descripcion.get();
    }

    public StringProperty descripcionProperty() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion.set(descripcion);
    }

    public double getPrecio() {
        return precio.get();
    }

    public DoubleProperty precioProperty() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio.set(precio);
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
                ", Nombre=" + nombre +
                ", Descripcion=" + descripcion +
                ", Precio=" + precio +
                '}';
    }
    private Empleado empleado;
}
