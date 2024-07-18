package com.lyzsolar.ajalcafe.models;

import javafx.beans.property.*;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    private final IntegerProperty idProducto;
    private final StringProperty nombreProducto;
    private final StringProperty categoria;
    private final StringProperty fechacaducidad;
    private final IntegerProperty cantidadProducto;
    private final StringProperty unidad;
    private final DoubleProperty precioProducto;

    private static List<Producto> listaProductos = new ArrayList<>();

    public Producto(int idProducto, String nombreProducto, String categoria, String fechacaducidad, int cantidadProducto, String unidad, double precioProducto) {
        this.idProducto = new SimpleIntegerProperty(idProducto);
        this.nombreProducto = new SimpleStringProperty(nombreProducto);
        this.categoria = new SimpleStringProperty(categoria);
        this.fechacaducidad = new SimpleStringProperty(fechacaducidad);
        this.cantidadProducto = new SimpleIntegerProperty(cantidadProducto);
        this.unidad = new SimpleStringProperty(unidad);
        this.precioProducto = new SimpleDoubleProperty(precioProducto);
    }


    public Integer getIdProducto() {
        return idProducto.get();
    }

    public IntegerProperty idProductoProperty() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto.set(idProducto);
    }

    public StringProperty nombreProductoProperty() {
        return nombreProducto;
    }

    public StringProperty categoriaProperty() {
        return categoria;
    }

    public IntegerProperty cantidadProductoProperty() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto.set(cantidadProducto);
    }

    public StringProperty unidadProperty() {
        return unidad;
    }

    public DoubleProperty precioProductoProperty() {
        return precioProducto;
    }

    public StringProperty fechacaducidad() {
        return fechacaducidad;
    }

    public StringProperty fechacaducidadProperty() {
        return fechacaducidad;
    }

    public void setFechacaducidad(String fechacaducidad) {
        this.fechacaducidad.set(fechacaducidad);
    }

    public static void agregarProductoLista(Producto producto) {
        listaProductos.add(producto);
    }

    public static List<Producto> obtenerListaProductos() {
        return listaProductos;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", fechacaducidad=" + fechacaducidad +
                ", cantidadProducto=" + cantidadProducto +
                ", unidad='" + unidad + '\'' +
                ", precioProducto=" + precioProducto +
                '}';
    }
}
